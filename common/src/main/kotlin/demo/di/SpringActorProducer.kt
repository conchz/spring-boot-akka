package demo.di

import akka.actor.Actor
import akka.actor.IndirectActorProducer
import org.springframework.context.ApplicationContext

class SpringActorProducer(val applicationContext: ApplicationContext,
                          val actorBeanName: String) : IndirectActorProducer {

    override fun produce(): Actor {
        return applicationContext.getBean(actorBeanName) as Actor
    }

    override fun actorClass(): Class<out Actor> {
        @Suppress("UNCHECKED_CAST")
        return applicationContext.getType(actorBeanName) as Class<out Actor>
    }
}