package study.spring.ch2_di.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfig {

    @Bean(destroyMethod = "close")
    public DataSource dataSource() {
        DataSource ds = new DataSource();
        ds.setDriverClassName("com.mysql.jdbc.driver");
        ds.setUrl("jdbc:mysql://localhost:3306/spring5fs?characterEncoding=utf8");
        ds.setUsername("root");
        ds.setPassword("1323");
        ds.setInitialSize(2);
        ds.setMaxAge(10);
        return ds;
    }
}