package xyz.yuchao.kurisubot.service.config.impl;

import xyz.yuchao.kurisubot.entity.config.ConfigGlobal;
import xyz.yuchao.kurisubot.mapper.config.ConfigGlobalMapper;
import xyz.yuchao.kurisubot.service.config.ConfigGlobalService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yc
 * @since 2023-03-13
 */
@Service
public class ConfigGlobalServiceImpl extends ServiceImpl<ConfigGlobalMapper, ConfigGlobal> implements ConfigGlobalService {

}
