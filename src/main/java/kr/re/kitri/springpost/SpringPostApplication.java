package kr.re.kitri.springpost;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class SpringPostApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPostApplication.class, args);
    }

}
