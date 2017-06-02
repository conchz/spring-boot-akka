package demo.spring.akka

import org.slf4j.{Logger, LoggerFactory}
import org.springframework.util.ClassUtils

trait SpringLogging {
  // Remove any CGLIB gunk to clean up logging
  protected val log: Logger = LoggerFactory.getLogger(ClassUtils.getUserClass(getClass))
}
