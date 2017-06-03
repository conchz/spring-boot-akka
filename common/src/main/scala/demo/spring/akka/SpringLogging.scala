package demo.spring.akka

import grizzled.slf4j.{Logger => GrizzledLogger}
import org.springframework.util.ClassUtils

trait SpringLogging {
  protected val logger: GrizzledLogger = GrizzledLogger(ClassUtils.getUserClass(getClass))
}
