package ma.youcode.restapiwdc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.core.userdetails.UserDetailsService;

@SpringBootApplication
// @SpringBootApplication = @Configuration + @EnableAutoConfiguration + @ComponentScan
//fire up a servlet container and serve up our service.
public class RestApiWdcApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiWdcApplication.class, args);
    }

}
