package demo.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootConfiguration
@ComponentScan({"demo.spring.akka", "demo.actor", "demo.service"})
@PropertySource({"classpath:springboot.properties"})
public class RootConfig {
}
