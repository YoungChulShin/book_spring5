package study.spring.ch2_di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import study.spring.ch2_di.MemberDao;
import study.spring.ch2_di.MemberPrinter;

@Configuration
@Import(AppConf2.class)
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
