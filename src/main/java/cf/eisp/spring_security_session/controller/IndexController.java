package cf.eisp.spring_security_session.controller;

import cf.eisp.spring_security_session.model.User;
import cf.eisp.spring_security_session.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class IndexController {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final UserRepository userRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/join")
    public String join() {
        return "join";
    }

    @GetMapping("/user")
    public String user() {
        return "user";
    }

    @PostMapping("/join")
    public String joinAction(User user) {
        String encodePWD = bCryptPasswordEncoder.encode(user.getPassword());
        user.setPassword(encodePWD);
        userRepository.save(user);
        return "join";
    }
}
