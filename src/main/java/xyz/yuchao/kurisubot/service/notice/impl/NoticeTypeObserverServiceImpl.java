package xyz.yuchao.kurisubot.service.notice.impl;



import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import xyz.yuchao.kurisubot.config.BotConfig;
import xyz.yuchao.kurisubot.config.KurisuBotConfig;
import xyz.yuchao.kurisubot.enums.PostNoticeType;
import xyz.yuchao.kurisubot.service.api.ApiService;
import xyz.yuchao.kurisubot.service.BaseAbstractService;
import xyz.yuchao.kurisubot.service.notice.NoticeTypeObserverService;

import javax.annotation.Resource;

@Service
//群消息撤回处理
public class NoticeTypeObserverServiceImpl extends BaseAbstractService implements NoticeTypeObserverService {

    @Resource
    private ApiService apiService;
    @Resource
    private KurisuBotConfig kurisuBotConfig;



    @Resource
    private BotConfig botConfig;

    @Override
    public void process(JSONObject message) {
        String noticeType = message.getString("notice_type");
        //非群消息撤回处理消息返回
        if (!PostNoticeType.group_recall.toString().equals(noticeType)) {
            return;
        }

        String groupRecallFlag = botConfig.getValue("group_recall");
        //防撤回功能是否开启
        if(null==groupRecallFlag|| "disable".equals(groupRecallFlag)){
            return;
        }
        String messageId = message.getString("message_id");
        JSONObject messageInfo = apiService.getMessage(messageId);
        if("failed".equals(messageInfo.getString("status"))){
            return;
        }

        JSONObject messageData = messageInfo.getJSONObject("data");
        String groupId = messageInfo.getString("group_id");
        boolean contains = botConfig.getGroupRecall().contains(groupId);
        //在黑名单返回
        if(contains &&"black".equals(groupRecallFlag)){
            return;
        }
        //不在白名单
        if(!contains && "white".equals(groupRecallFlag)){
            return;
        }
        apiService.sendMessage(kurisuBotConfig.getQq(), null, buildMessage(messageData), null);
        apiService.sendPrivateForwardMsg(kurisuBotConfig.getQq(),buildMessageNode(messageId));
    }


    private JSONArray buildMessage(JSONObject messageInfo){
        //撤回消息的群号
        String groupId = messageInfo.getString("group_id");
        //消息发送者 QQ 号
        String userName = messageInfo.getJSONObject("sender").getString("nickname");
        //操作者 QQ 号
        String operatorId = messageInfo.getString("operator_id");
        JSONArray jsonArray=new JSONArray();
        JSONObject sendMessageInfo = new JSONObject();
        sendMessageInfo.put("type", "text");
        JSONObject sendMessageDate = new JSONObject();
        //QQ 是秒级需要转换
        long time=messageInfo.getLong("time")*1000;
        sendMessageDate.put("text", DateUtil.formatDateTime(DateUtil.date(time)) + " 群号:" + groupId + " 用户:" + (StringUtils.hasText(operatorId)?operatorId:userName) + "撤回了" + userName + "的消息，消息内容为：");
        sendMessageInfo.put("data", sendMessageDate);
        jsonArray.add(sendMessageInfo);
        return jsonArray;
    }

    private JSONArray buildMessageNode(String messageId){
        JSONArray jsonArray=new JSONArray();
        JSONObject jsonNode=new JSONObject();
        jsonArray.add(jsonNode);
        jsonNode.put("type","node");
        JSONObject jsonData=new JSONObject();
        jsonNode.put("data",jsonData);
        jsonData.put("id",messageId);
        return jsonArray;
    }
}
