package study.spring.ch7_aop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import study.spring.ch7_aop.Calculator;
import study.spring.ch7_aop.ExecTimeAspect;
import study.spring.ch7_aop.RecCalculator;

@Configuration
@EnableAspectJAutoProxy
public class AppCtx {

    @Bean
    public Calculator calculator() {
        return new RecCalculator();
    }

    @Bean
    public ExecTimeAspect execTimeAspect() {
        return new ExecTimeAspect();
    }
}
