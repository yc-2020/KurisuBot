package xyz.yuchao.kurisubot.entity.dict;

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
@TableName("dict_ec")
public class DictEc implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("word")
    private String word;

    @TableField("phonetic")
    private String phonetic;

    @TableField("definition")
    private String definition;

    @TableField("translation")
    private String translation;

    @TableField("pos")
    private String pos;

    @TableField("collins")
    private String collins;

    @TableField("oxford")
    private String oxford;

    @TableField("tag")
    private String tag;

    @TableField("bnc")
    private String bnc;

    @TableField("frq")
    private String frq;

    @TableField("exchange")
    private String exchange;

    @TableField("detail")
    private String detail;

    @TableField("audio")
    private String audio;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getPhonetic() {
        return phonetic;
    }

    public void setPhonetic(String phonetic) {
        this.phonetic = phonetic;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getCollins() {
        return collins;
    }

    public void setCollins(String collins) {
        this.collins = collins;
    }

    public String getOxford() {
        return oxford;
    }

    public void setOxford(String oxford) {
        this.oxford = oxford;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getBnc() {
        return bnc;
    }

    public void setBnc(String bnc) {
        this.bnc = bnc;
    }

    public String getFrq() {
        return frq;
    }

    public void setFrq(String frq) {
        this.frq = frq;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    @Override
    public String toString() {
        return "DictEc{" +
            "word = " + word +
            ", phonetic = " + phonetic +
            ", definition = " + definition +
            ", translation = " + translation +
            ", pos = " + pos +
            ", collins = " + collins +
            ", oxford = " + oxford +
            ", tag = " + tag +
            ", bnc = " + bnc +
            ", frq = " + frq +
            ", exchange = " + exchange +
            ", detail = " + detail +
            ", audio = " + audio +
        "}";
    }
}
