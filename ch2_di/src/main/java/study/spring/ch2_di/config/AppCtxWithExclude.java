package study.spring.ch2_di.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import study.spring.ch2_di.MemberDao;
import study.spring.ch2_di.MemberPrinter;
import study.spring.ch2_di.MemberSummaryPrinter;
import study.spring.ch2_di.annotations.ManualBean;
import study.spring.ch2_di.annotations.NoProduct;

@Component
@ComponentScan(
        basePackages = {"study"},
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {NoProduct.class, ManualBean.class}))
public class AppCtxWithExclude {

    @Bean
    @Qualifier("printer")
    public MemberPrinter memberPrinter1() {
        return new MemberPrinter();
    }

    @Bean
    @Qualifier("summaryPrinter")
    public MemberSummaryPrinter memberPrinter2() {
        return new MemberSummaryPrinter();
    }
}
