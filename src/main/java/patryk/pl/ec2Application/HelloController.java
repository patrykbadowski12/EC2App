package patryk.pl.ec2Application;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/hello")
    public String hello() {
        return "Hello from EC2 instance";
    }

    @PostMapping("/user")
    public UserEntity createUser(@RequestParam String username) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(username);
        return userRepository.save(userEntity);
    }
}
