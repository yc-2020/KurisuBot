package xyz.yuchao.kurisubot.service.postType.impl;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;
import xyz.yuchao.kurisubot.service.BaseAbstractService;
import xyz.yuchao.kurisubot.service.notice.NoticeTypeObserverService;
import xyz.yuchao.kurisubot.service.postType.PostTypeService;

import javax.annotation.Resource;
import java.util.List;

@Service("post_type_notice")
public class NoticeServiceImpl extends BaseAbstractService implements PostTypeService {
    @Resource
    private List<NoticeTypeObserverService> noticeTypeObserverServiceList;

    @Override
    public void process(JSONObject request) {
        //通知类信息
        noticeTypeObserverServiceList.forEach(e-> e.process(request));
    }
}
