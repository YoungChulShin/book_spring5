package study.spring.ch7_aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.spring.ch7_aop.config.AppCtx;

//@SpringBootApplication
public class Ch7AopApplication {

    public static void main(String[] args) {
//        SpringApplication.run(Ch7AopApplication.class, args);

//        ExecTimeCalculator execTimeCalculator1 = new ExecTimeCalculator(new ImpeCalculator());
//        System.out.println(execTimeCalculator1.factorial(20));
//
//        ExecTimeCalculator execTimeCalculator2 = new ExecTimeCalculator(new RecCalculator());
//        System.out.println(execTimeCalculator2.factorial(20));

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppCtx.class);

        Calculator cal = ctx.getBean("calculator", Calculator.class);
        long fiveFact = cal.factorial(5);
        System.out.println(fiveFact);
        System.out.println(cal.getClass().getName());
        ctx.close();
    }
}
