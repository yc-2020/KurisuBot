package xyz.yuchao.kurisubot.entity.config;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yc
 * @since 2023-03-13
 */
@TableName("config_global")
public class ConfigGlobal implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("config_key")
    private String configKey;

    @TableField("value")
    private String value;

    public String getConfigKey() {
        return configKey;
    }

    public void setConfigKey(String configKey) {
        this.configKey = configKey;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ConfigGlobal{" +
            "configKey = " + configKey +
            ", value = " + value +
        "}";
    }
}
