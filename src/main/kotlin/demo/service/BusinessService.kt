package demo.service

import demo.util.loggerFor
import org.springframework.stereotype.Component

@Component
open class BusinessService {

    private val logger = loggerFor<BusinessService>()

    fun perform(o: Any) {
        logger.info("Perform: {}", o)
    }
}