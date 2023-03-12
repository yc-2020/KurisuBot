package xyz.yuchao.kurisubot.controller.bot;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.yuchao.kurisubot.controller.BaseAbstractController;
import xyz.yuchao.kurisubot.service.postType.PostTypeService;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/bot")
public class QQBotController extends BaseAbstractController {

    @Resource
    private Map<String, PostTypeService> postTypeServiceMap;
    @RequestMapping("/qq")
    public String homePage(@RequestBody JSONObject request){
        String postType="post_type_"+request.getString("post_type");
        PostTypeService postTypeService = postTypeServiceMap.get(postType);
        if(null ==postTypeService){
            return success();
        }
        postTypeService.process(request);
        return success();
    }
}
