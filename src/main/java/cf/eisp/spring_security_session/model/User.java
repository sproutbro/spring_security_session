package cf.eisp.spring_security_session.model;

import lombok.Data;

@Data
public class User {
    private int id;
    private String username;
    private String password;
}
