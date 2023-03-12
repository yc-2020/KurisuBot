package xyz.yuchao.kurisubot.service.postType.impl;

import cn.hutool.core.text.escape.XmlEscape;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;
import xyz.yuchao.kurisubot.constants.DataConstant;
import xyz.yuchao.kurisubot.service.BaseAbstractService;
import xyz.yuchao.kurisubot.service.postType.PostTypeService;

@Service("post_type_message")
public class MessageServiceImpl extends BaseAbstractService implements PostTypeService {

    @Override
    public void process(JSONObject request) {
        String message_type = request.getString("message_type");
        logger.info(request);
        if(DataConstant.message_type_private.equals(message_type)){
            String sub_type = request.getString("sub_type");
            if(!DataConstant.post_message_subtype_friend.equals(sub_type)){
                return;
            }
            JSONArray messages = request.getJSONArray("message");
            handlePrivateMessage(messages);
        }
        else if(DataConstant.message_type_group.equals(message_type)){

        }
    }

    /**
     * 处理私聊消息
     * @param messages
     */
    private void handlePrivateMessage(JSONArray messages){
        messages.iterator();
    }


}
