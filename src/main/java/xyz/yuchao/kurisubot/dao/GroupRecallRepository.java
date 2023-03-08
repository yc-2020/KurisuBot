package xyz.yuchao.kurisubot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import xyz.yuchao.kurisubot.dao.entity.GroupRecall;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Repository
public interface GroupRecallRepository extends JpaRepository<GroupRecall,Long> {
    GroupRecall findByGroupId(String groupId);
}
