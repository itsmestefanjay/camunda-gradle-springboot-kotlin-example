package de.stefanjay

import mu.KotlinLogging
import org.camunda.bpm.engine.impl.cfg.ProcessEngineConfigurationImpl
import org.camunda.bpm.spring.boot.starter.configuration.impl.AbstractCamundaConfiguration
import org.springframework.context.annotation.Configuration

@Configuration
class CamundaConfig : AbstractCamundaConfiguration() {

    private val logging = KotlinLogging.logger {}

    override fun preInit(processEngineConfiguration: ProcessEngineConfigurationImpl?) {
        processEngineConfiguration?.isInitializeTelemetry = false
        processEngineConfiguration?.isTelemetryReporterActivate = false
        logging.info { "Telemetry disabled!" }
    }



}