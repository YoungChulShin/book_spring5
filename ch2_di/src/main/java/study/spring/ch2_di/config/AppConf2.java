package study.spring.ch2_di.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.spring.ch2_di.*;

@Configuration
public class AppConf2 {

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private MemberPrinter memberPrinter;

    @Bean
    public MemberRegisterService memberRegisterService() {
        return new MemberRegisterService(memberDao);
    }

    @Bean
    public ChangePasswordService changePasswordService() {
        ChangePasswordService changePasswordService = new ChangePasswordService();
        changePasswordService.setMemberDao(memberDao);
        return changePasswordService;
    }

    @Bean
    public MemberListPrinter listPrinter() {
        return new MemberListPrinter(memberDao, memberPrinter);
    }

    @Bean
    public MemberInfoPrinter infoPrinter() {
        MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
        infoPrinter.setMemberDao(memberDao);
        infoPrinter.setMemberPrinter(memberPrinter);
        return infoPrinter;
    }
}
