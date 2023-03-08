package xyz.yuchao.kurisubot.controller;


import com.alibaba.fastjson.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.yuchao.kurisubot.enums.PostType;
import xyz.yuchao.kurisubot.service.notice.NoticeTypeObserverService;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HomeController {

    private Logger logger=LogManager.getLogger();
    @Resource
    private List<NoticeTypeObserverService> noticeTypeObserverServiceList;
    @RequestMapping("/")
    public String homePage(@RequestBody JSONObject request){
        String postType=request.getString("post_type");
        //心跳包直接返回
        if(PostType.meta_event.toString().equals(postType)){
            return "success";
        }
        //通知类信息
        if(PostType.notice.toString().equals(postType)){
            noticeTypeObserverServiceList.forEach(e-> e.process(request));
        }
        return "success";
    }

}
