package xyz.yuchao.kurisubot.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import xyz.yuchao.kurisubot.entity.config.ConfigGlobal;
import xyz.yuchao.kurisubot.service.config.ConfigGlobalService;
import xyz.yuchao.kurisubot.service.group.GroupRecallService;


import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class BotConfig implements InitializingBean {

    @Resource
    private ConfigGlobalService configGlobalService;

    @Resource
    private GroupRecallService groupRecallService;

    private Map<String,String> config;

    /**
     * 防撤回群号
     */
    private List<String> groupRecall;

    @Override
    public void afterPropertiesSet() {
        this.config=configGlobalService.list().stream().collect(Collectors.toMap(ConfigGlobal::getConfigKey, ConfigGlobal::getValue));
        initGroupRecall();
    }

    public String getValue(String key){
        return  config.get(key);
    }

    private void initGroupRecall(){
        groupRecall=new ArrayList<>();
        groupRecallService.list().forEach(entity-> groupRecall.add(entity.getGroupId()));
    }

    public List<String> getGroupRecall() {
        return groupRecall;
    }

}
