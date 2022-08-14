package tr.com.obss.ji.spring.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tr.com.obss.ji.spring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User,Long>{

Optional<User> findByUsername(String username);


@Query(value = "select u from User u where u.id = :id")
Optional<User>getById(long id);


@Query(value = "select * from user_account where id = :id",nativeQuery = true)
Optional<User>getByIdNative(long id);

List<User> findByRoles_NameIn(List<String>roles);
List<User> findByUsernameStartsWithAndActiveTrueOrderByCreateDateDesc(String username);
}
