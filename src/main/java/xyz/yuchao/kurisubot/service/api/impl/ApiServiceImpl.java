package xyz.yuchao.kurisubot.service.api.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;
import xyz.yuchao.kurisubot.config.KurisuBotConfig;
import xyz.yuchao.kurisubot.constants.UrlConstant;
import xyz.yuchao.kurisubot.service.api.ApiService;
import xyz.yuchao.kurisubot.service.BaseAbstractService;

import javax.annotation.Resource;

@Service
public class ApiServiceImpl extends BaseAbstractService implements ApiService {


//    @Resource
    private RestTemplate restTemplate=new RestTemplate();
    @Resource
    private KurisuBotConfig kurisuBotConfig;


    @Override
    public void sendMessage(String userId, String groupId, JSONArray message, Boolean autoEscape) {
        Assert.hasText(userId,"发送对象不能为空");
        String url=kurisuBotConfig.getUrl()+ UrlConstant.sendPrivateMessage;
        JSONObject sendMessage=new JSONObject();
        sendMessage.put("user_id",userId);
        sendMessage.put("group_id",groupId);
        sendMessage.put("message",message);
        sendMessage.put("auto_escape",autoEscape);
        logger.info("发送的消息："+sendMessage.toString());
        JSONObject jsonObject = restTemplate.postForObject(url, sendMessage, JSONObject.class);
    }

    @Override
    public JSONObject getMessage(String messageId) {
        Assert.hasText(messageId,"messageId不能为空");
        String url=kurisuBotConfig.getUrl()+ UrlConstant.getMessage;
        JSONObject request=new JSONObject();
        request.put("message_id",messageId);
        JSONObject jsonObject = restTemplate.postForObject(url, request, JSONObject.class);
        return jsonObject;
    }

    @Override
    public void sendPrivateForwardMsg(String userId, JSONArray jsonArray) {
        String url=kurisuBotConfig.getUrl()+ UrlConstant.sendPrivateForwardMsg;
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("user_id",userId);
        jsonObject.put("messages",jsonArray);
        logger.info("请求参数"+jsonObject.toJSONString());
        restTemplate.postForObject(url, jsonObject, JSONObject.class);
    }
}
