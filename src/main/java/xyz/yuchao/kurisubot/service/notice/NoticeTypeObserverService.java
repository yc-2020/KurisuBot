package xyz.yuchao.kurisubot.service.notice;

import com.alibaba.fastjson.JSONObject;

public interface NoticeTypeObserverService {
    //处理消息
    void process(JSONObject message);
}
