package xyz.yuchao.kurisubot.entity.group;

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
@TableName("group_recall")
public class GroupRecall implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("group_id")
    private String groupId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "GroupRecall{" +
            "groupId = " + groupId +
        "}";
    }
}
