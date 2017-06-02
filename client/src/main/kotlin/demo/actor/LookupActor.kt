package demo.actor

import akka.actor.UntypedAbstractActor
import demo.util.KotlinLogging
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Component
@Scope("prototype")
class LookupActor : UntypedAbstractActor() {

    private val logger = KotlinLogging.logger {}

    override fun onReceive(message: Any) {
        //
    }
}