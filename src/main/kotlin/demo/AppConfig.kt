package demo

import akka.actor.ActorSystem
import com.typesafe.config.ConfigFactory
import demo.di.SpringExtension
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringBootConfiguration
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.PropertySource
import org.springframework.core.annotation.Order

@SpringBootConfiguration
@PropertySource("classpath:springboot.properties")
open class AppConfig {

    @Autowired
    private lateinit var applicationContext: ApplicationContext

    @Bean
    @Order(-100)
    open fun springExtension(): SpringExtension = SpringExtension(applicationContext)

    @Bean
    open fun actorSystem(): ActorSystem = ActorSystem.create("demo", ConfigFactory.load("akka"))
}