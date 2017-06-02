package demo.di

import akka.actor.Extension
import akka.actor.Props
import org.springframework.context.ApplicationContext

class SpringExtension(val applicationContext: ApplicationContext) : Extension {

    fun props(actorBeanName: String): Props {
        return Props.create(SpringActorProducer::class.java, applicationContext, actorBeanName)
    }
}