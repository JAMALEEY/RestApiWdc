package ma.youcode.restapiwdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// SpringBootApplication= component scanning, autoconfiguration, and property support
//fire up a servlet container and serve up our service.
public class RestApiWdcApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiWdcApplication.class, args);
    }

}
