package demo.service

import demo.util.KotlinLogging
import org.springframework.stereotype.Component

@Component
open class BusinessService {

    private val logger = KotlinLogging.logger {}

    fun perform(o: Any) {
        logger.info("Perform: {}", o)
    }
}