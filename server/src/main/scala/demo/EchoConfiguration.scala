package demo

import demo.actor.EchoActor
import demo.spring.akka.annotation.ActorBean
import demo.spring.akka.{ActorSystemConfiguration, AkkaAutoConfiguration}
import org.springframework.context.annotation.{Bean, ComponentScan, Configuration, Import}

@Configuration
@ComponentScan
@Import(Array(classOf[AkkaAutoConfiguration]))
class EchoConfiguration extends ActorSystemConfiguration {

  @ActorBean
  def echoActorBean = new EchoActor()

  @Bean
  def echoActor = actorOf[EchoActor]

}
