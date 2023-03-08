package xyz.yuchao.kurisubot.dao.entity;

import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "bot_config")
public class BotConfigEntity {

    @Id
    @Column(name = "config_key")
    private String key;

    @Column
    private String text;


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
