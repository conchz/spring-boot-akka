package demo.actor

import akka.actor.UntypedAbstractActor
import demo.service.BusinessService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import java.util.concurrent.atomic.AtomicInteger

@Component
@Scope("prototype")
open class WorkerActor : UntypedAbstractActor() {

    @Autowired
    private lateinit var businessService: BusinessService

    private val count = AtomicInteger(0)

    override fun onReceive(message: Any) {
        if (message is Request) {
            businessService.perform(this.toString() + " " + count.incrementAndGet())
        } else if (message is Response) {
            sender.tell(count.get(), self)
        } else {
            unhandled(message)
        }
    }


    class Request

    class Response
}