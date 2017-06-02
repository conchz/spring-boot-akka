package demo.spring.akka

import org.springframework.boot.SpringBootConfiguration
import org.springframework.context.annotation.PropertySource

@SpringBootConfiguration
@PropertySource(Array("classpath:springboot.properties"))
class RootConfig
