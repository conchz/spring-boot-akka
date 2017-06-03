package demo.actor

import akka.actor.UntypedAbstractActor
import demo.spring.akka.annotation.ActorComponent

@ActorComponent
class EchoActor extends UntypedAbstractActor {
  override def onReceive(message: Any): Unit = {
    sender() ! message
  }
}
