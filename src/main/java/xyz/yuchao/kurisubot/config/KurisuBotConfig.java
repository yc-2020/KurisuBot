package xyz.yuchao.kurisubot.config;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Reference
@Component
@ConfigurationProperties(prefix = "qq-bot.server")
public class KurisuBotConfig {
    private String url;

    private String qq;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }
}
