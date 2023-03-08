package xyz.yuchao.kurisubot.config;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Reference
@Component
@ConfigurationProperties(prefix = "http.proxy")
public class HttpProxyConfig {
    private String url;
    private Integer port;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
