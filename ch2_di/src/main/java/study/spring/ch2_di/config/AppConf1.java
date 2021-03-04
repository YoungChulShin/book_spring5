package study.spring.ch2_di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.spring.ch2_di.MemberDao;
import study.spring.ch2_di.MemberPrinter;

@Configuration
public class AppConf1 {

    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }

    @Bean
    public MemberPrinter memberPrinter() {
        return new MemberPrinter();
    }
}
