package demo.config;

import demo.spring.akka.AkkaAutoConfiguration;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@SpringBootConfiguration
@ComponentScan({"demo.spring.akka", "demo.actor", "demo.service"})
@Import(AkkaAutoConfiguration.class)
@PropertySource({"classpath:springboot.properties"})
public class RootConfig {
}
