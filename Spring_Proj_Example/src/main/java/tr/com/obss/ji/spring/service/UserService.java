package tr.com.obss.ji.spring.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import tr.com.obss.ji.spring.cache.UserCache;
import tr.com.obss.ji.spring.entity.MyUserDetails;
import tr.com.obss.ji.spring.entity.User;
import tr.com.obss.ji.spring.model.UserDTO;
import tr.com.obss.ji.spring.model.UserUpdateDTO;
import tr.com.obss.ji.spring.repo.RoleRepository;
import tr.com.obss.ji.spring.repo.UserDAO;
import tr.com.obss.ji.spring.repo.UserRepository;

import java.util.List;
import java.util.Set;

@Service
public class UserService implements UserDetailsService {
    private final ApplicationContext context;
    private final UserCache cache;

    private final UserRepository repository;

    private final UserDAO userDAO;

    private final PasswordEncoder encoder;

    private final RoleRepository roleRepository;
    public UserService(ApplicationContext context, @Qualifier("userCacheSingleton") UserCache cache, UserRepository repository,
                       UserDAO userDAO, RoleRepository roleRepository, PasswordEncoder encoder){
        this.context = context;
        this.cache = cache;
        this.repository = repository;
        this.userDAO = userDAO;
        this.roleRepository = roleRepository;
        this.encoder = encoder;
    }

    public List<User>getUsersWithRole(List<String>roles){
        return repository.findByRoles_NameIn(roles);
    }
    public User save(UserDTO user) {
        var u = new User();
        u.setUsername(user.getUsername());
        u.setPassword(encoder.encode(user.getPassword()));
        //u.setActive(true);
        //u.setCreateDate(new Date());
        //u.setUpdateDate(new Date());
        //u.setOperationType("SAVE");
        var userRoleOpt = roleRepository.findByName("ROLE_USER");
        userRoleOpt.ifPresent((userRole)-> { u.setRoles(Set.of(userRoleOpt.get()));
        });
        return repository.save(u);


       /* var userCachePrototype = context.getBean(UserCachePrototype.class);
        var userCacheSingleton = context.getBean(UserCacheSingleton.class);
        userCachePrototype.users.put(user.getUsername(),user);
        cache.put(user);
        //userCacheSingleton.users.put(user.getUsername(),user);
        var myMap = new HashMap<String,Object>();
        myMap.put("singleton",userCacheSingleton.getMap());
        myMap.put("prototype",userCachePrototype.users);
        return myMap;*/


    }


    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(long id) {
        var userOpt = repository.findById(id);
        return userOpt.orElseThrow(() -> {
            throw new IllegalArgumentException("User not found !!");
        });
    }
public User getById(long id) {
        var userOpt = repository.getById(id);
        return userOpt.orElseThrow(() -> {
             throw new IllegalArgumentException("User not found !!");
        });
}

public User getByIdNative(long id) {
    var userOpt = repository.getByIdNative(id);
    return userOpt.orElseThrow(() -> {
       throw new IllegalArgumentException("User not found !!! \n");
    });
}


   //get request link: http://localhost:8081/api/v1/users/with-jpa-pagination
    public Page<User> findAllWithJpaPagination(int pageNumber, int pageSize) {
        var paged = PageRequest.of(pageNumber,pageSize);
        return repository.findAll(paged);
    }
    //get request link: http://localhost:8081/api/v1/users/with-dao-pagination
    public List<User>findAllDaoPagination(int pageNumber,int pageSize) {
        return userDAO.get(pageNumber,pageSize);
    }

    public User update(long id, UserUpdateDTO updateDTO) {
        var user = this.findById(id);
        user.setPassword(encoder.encode(updateDTO.getPassword()));
        return repository.save(user);
    }

    public User findByUsername(String username) {
        var userOpt = repository.findByUsername(username);
        return userOpt.orElseThrow(() -> {
            throw new IllegalArgumentException("User is not found !!");
        });
    }

    public List<User>findAllByUsername(String username) {
        return repository.findByUsernameStartsWithAndActiveTrueOrderByCreateDateDesc(username);
    }

    public User remove(long id) {
        var user = this.findById(id);
        user.setActive(!user.isActive());
        return repository.save(user);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var user = this.findByUsername(username);
        return new MyUserDetails(user);
    }
}




