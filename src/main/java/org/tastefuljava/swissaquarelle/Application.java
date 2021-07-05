package org.tastefuljava.swissaquarelle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("file:${catalina.base}/conf/swissaquarelle.properties")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
