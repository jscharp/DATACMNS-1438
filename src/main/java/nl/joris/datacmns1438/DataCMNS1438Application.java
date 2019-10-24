package nl.joris.datacmns1438;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class DataCMNS1438Application {

    public static void main(String[] args) {
        SpringApplication.run(DataCMNS1438Application.class, args);
    }

}
