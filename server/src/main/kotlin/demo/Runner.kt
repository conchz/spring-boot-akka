package demo

import akka.actor.ActorSystem
import akka.actor.Terminated
import akka.pattern.Patterns
import akka.util.Timeout
import demo.actor.WorkerActor
import demo.di.SpringExtension
import demo.util.KotlinLogging
import org.springframework.beans.factory.DisposableBean
import org.springframework.beans.factory.InitializingBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import scala.concurrent.Await
import scala.concurrent.duration.Duration
import scala.concurrent.duration.FiniteDuration
import java.util.concurrent.TimeUnit

/**
 * Spring Boot与Akka的集成: http://blog.csdn.net/beliefer/article/details/53783936
 */
@Component
open class Runner : CommandLineRunner, InitializingBean, DisposableBean {

    private val logger = KotlinLogging.logger {}

    @Autowired
    private lateinit var actorSystem: ActorSystem

    @Autowired
    private lateinit var springExtension: SpringExtension

    override fun run(vararg args: String?) {
        val workerActor = actorSystem.actorOf(springExtension.props("workerActor"), "worker-actor")

        workerActor.tell(WorkerActor.Request(), null)
        workerActor.tell(WorkerActor.Request(), null)
        workerActor.tell(WorkerActor.Request(), null)

        val duration = FiniteDuration.create(3, TimeUnit.SECONDS)
        val awaitable = Patterns.ask(workerActor, WorkerActor.Response(), Timeout.durationToTimeout(duration))

        logger.info("Response: " + Await.result(awaitable, duration))
    }

    override fun afterPropertiesSet() {
        // empty implementation
    }

    override fun destroy() {
        actorSystem.terminate()
        Await.result<Terminated>(actorSystem.whenTerminated(), Duration.Inf())
    }
}