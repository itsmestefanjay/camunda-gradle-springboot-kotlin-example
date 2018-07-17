package de.stefanjay.delegate

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class SayHelloDelegate : JavaDelegate {

    private val logger = LoggerFactory.getLogger(SayHelloDelegate::class.java)

    override fun execute(execution: DelegateExecution?) {
        logger.info("hello {}", execution)
    }
}