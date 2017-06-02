package demo.spring

import demo.spring.akka.AkkaAutoConfiguration
import org.springframework.boot.SpringBootConfiguration
import org.springframework.context.annotation.{Import, PropertySource}

@SpringBootConfiguration
@Import(Array(classOf[AkkaAutoConfiguration]))
@PropertySource(Array("classpath:springboot.properties"))
class AppConfig
