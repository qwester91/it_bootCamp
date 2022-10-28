package gmail.harashchenia.dzmitry.users.dao.api;

import gmail.harashchenia.dzmitry.users.dao.entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface IUserDao extends JpaRepository<UserEntity, UUID> {
    Page<UserEntity> findAll(Pageable pageable);
    UserEntity findUserEntitiesByRole(String role);
}
