package xyz.yuchao.kurisubot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import xyz.yuchao.kurisubot.dao.entity.BotConfigEntity;

@Repository
public interface BotConfigRepository extends JpaRepository<BotConfigEntity, Long> {
}
