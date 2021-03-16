package study.spring.simple_example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    private int count = 0;

    @GetMapping("/user")
    public User getUser() {
        User user = new User("aa", 30);

        count++;
        if (count % 2 == 0) {
            throw new UserNotFoundException("not found user");
        }

        return user;
    }
}
