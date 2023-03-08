package xyz.yuchao.kurisubot.dao.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "group_recall")
/*
  防撤回
 */
public class GroupRecall implements Serializable {
    @Id
    private String groupId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
