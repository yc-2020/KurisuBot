package xyz.yuchao.kurisubot.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import xyz.yuchao.kurisubot.dao.BotConfigRepository;
import xyz.yuchao.kurisubot.dao.GroupRecallRepository;
import xyz.yuchao.kurisubot.dao.entity.BotConfigEntity;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class BotConfig implements InitializingBean {

    @Resource
    private BotConfigRepository botConfigRepository;

    @Resource
    private GroupRecallRepository groupRecallRepository;

    private Map<String,String> config;

    /**
     * 防撤回群号
     */
    private List<String> groupRecall;

    @Override
    public void afterPropertiesSet() {
        this.config=botConfigRepository.findAll().stream().collect(Collectors.toMap(BotConfigEntity::getKey, BotConfigEntity::getText));
        initGroupRecall();
    }

    public String getValue(String key){
        return  config.get(key);
    }

    private void initGroupRecall(){
        groupRecall=new ArrayList<>();
        groupRecallRepository.findAll().forEach(entity-> groupRecall.add(entity.getGroupId()));
    }

    public List<String> getGroupRecall() {
        return groupRecall;
    }

}
