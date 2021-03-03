package study.spring.ch2_di;

import java.time.LocalDateTime;

public class Member {
    private String email;
    private String password;
    private String name;
    private LocalDateTime registerDate;

    public Member() {

    }

    public Member(String email, String password, String name, LocalDateTime registerDate) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.registerDate = registerDate;
    }
}
