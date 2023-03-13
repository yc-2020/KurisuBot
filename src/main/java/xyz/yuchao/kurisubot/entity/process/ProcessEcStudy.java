package xyz.yuchao.kurisubot.entity.process;

import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("process_ec_study")
public class ProcessEcStudy implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("word")
    private String word;

    @TableField("user_id")
    private String userId;

    /**
     * 查询次数
     */
    @TableField("search_num")
    private Integer searchNum;

    /**
     * 学习次数
     */
    @TableField("study_num")
    private Integer studyNum;

    /**
     * 错误次数
     */
    @TableField("err_num")
    private Integer errNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getSearchNum() {
        return searchNum;
    }

    public void setSearchNum(Integer searchNum) {
        this.searchNum = searchNum;
    }

    public Integer getStudyNum() {
        return studyNum;
    }

    public void setStudyNum(Integer studyNum) {
        this.studyNum = studyNum;
    }

    public Integer getErrNum() {
        return errNum;
    }

    public void setErrNum(Integer errNum) {
        this.errNum = errNum;
    }

    @Override
    public String toString() {
        return "ProcessEcStudy{" +
            "id = " + id +
            ", word = " + word +
            ", userId = " + userId +
            ", searchNum = " + searchNum +
            ", studyNum = " + studyNum +
            ", errNum = " + errNum +
        "}";
    }
}
