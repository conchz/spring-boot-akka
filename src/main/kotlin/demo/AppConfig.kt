package demo

import akka.actor.ActorSystem
import com.typesafe.config.ConfigFactory
import demo.di.SpringExtension
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringBootConfiguration
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.PropertySource

@SpringBootConfiguration
@PropertySource("classpath:springboot.properties")
open class AppConfig {

    @Autowired
    private lateinit var applicationContext: ApplicationContext

    @Bean
    open fun actorSystem(): ActorSystem {
        val actorSystem = ActorSystem.create("demo-actor-system", ConfigFactory.load("akka"))
        return actorSystem
    }

    @Bean
    open fun springExtension(): SpringExtension {
        return SpringExtension(applicationContext)
    }
}