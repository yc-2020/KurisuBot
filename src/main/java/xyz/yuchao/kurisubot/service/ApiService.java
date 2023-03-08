package xyz.yuchao.kurisubot.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

public interface ApiService {
    //发送私聊消息
    void sendMessage(String userId, String groupId, JSONArray message, Boolean autoEscape);
    // 获取消息
    JSONObject getMessage(String messageId);

    void sendPrivateForwardMsg(String userId,JSONArray jsonArray);

}
