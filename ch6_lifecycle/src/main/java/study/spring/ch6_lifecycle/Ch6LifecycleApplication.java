package study.spring.ch6_lifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import study.spring.ch6_lifecycle.config.AppCtx;

// @SpringBootApplication
public class Ch6LifecycleApplication {

    public static void main(String[] args) {
        // destroySpringApplication.run(Ch6LifecycleApplication.class, args);

        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Client client = ctx.getBean(Client.class);
        client.send();

        Client2 client2 = ctx.getBean(Client2.class);
        client2.send();

        ctx.close();
    }
}
