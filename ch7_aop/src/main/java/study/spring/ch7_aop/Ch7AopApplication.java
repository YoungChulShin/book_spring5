package study.spring.ch7_aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class Ch7AopApplication {

    public static void main(String[] args) {
//        SpringApplication.run(Ch7AopApplication.class, args);

        ExecTimeCalculator execTimeCalculator1 = new ExecTimeCalculator(new ImpeCalculator());
        System.out.println(execTimeCalculator1.factorial(20));

        ExecTimeCalculator execTimeCalculator2 = new ExecTimeCalculator(new RecCalculator());
        System.out.println(execTimeCalculator2.factorial(20));
    }

}
