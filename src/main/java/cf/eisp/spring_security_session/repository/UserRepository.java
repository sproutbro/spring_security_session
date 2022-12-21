package cf.eisp.spring_security_session.repository;

import cf.eisp.spring_security_session.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
    void save(User user);

    User findByUsername(String username);
}
