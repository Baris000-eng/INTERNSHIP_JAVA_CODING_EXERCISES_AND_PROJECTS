package tr.com.obss.ji.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.com.obss.ji.spring.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(String name);

    boolean existsByName(String name);
}
