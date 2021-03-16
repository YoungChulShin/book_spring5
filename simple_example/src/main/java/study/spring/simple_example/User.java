package study.spring.simple_example;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class User {

    private String username;

    private int age;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime registerDate;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
        this.registerDate = LocalDateTime.now();
    }
}
