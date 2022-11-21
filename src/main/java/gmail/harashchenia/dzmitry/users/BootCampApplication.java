package gmail.harashchenia.dzmitry.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.TimeZone;


@SpringBootApplication
@EnableJpaRepositories("gmail/harashchenia/dzmitry/users/dao/api/")
public class BootCampApplication {



    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        SpringApplication.run(BootCampApplication.class, args);



    }

}
