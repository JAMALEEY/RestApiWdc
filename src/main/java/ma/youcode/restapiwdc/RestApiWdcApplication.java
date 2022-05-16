package ma.youcode.restapiwdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
// @SpringBootApplication = @Configuration + @EnableAutoConfiguration + @ComponentScan
//fire up a servlet container and serve up our service.
public class RestApiWdcApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiWdcApplication.class, args);
    }

}
