package io.baselogic.integration.core.gateways.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@SuppressWarnings({"Duplicates", "SpringJavaInjectionPointsAutowiringInspection"})
public class EchoService {

    public static final String SEND_TIMEOUT = "1000";

    /**
     * Converted from:
     * <service-activator input-channel="inputChannel"
     * 	                   output-channel="outputChannel"
     * 	                   ref="echoService"
     * 	                   method="echo"/>
     * @param inboundPayload
     */
    @ServiceActivator(inputChannel = "inputChannel",
            outputChannel = "outputChannel",
            sendTimeout = SEND_TIMEOUT
    )
    public String echo(String inboundPayload) {

        log.info("EchoService.echo():: Inbound message: {}", inboundPayload);

        return String.format("Echo: [%s]", inboundPayload);
	}


    @ServiceActivator(inputChannel = "inputUpperCaseChannel",
            outputChannel = "outputChannel",
            sendTimeout = SEND_TIMEOUT
    )
    public String echoUpperCase(String inboundPayload) {

        String processed = inboundPayload.toUpperCase();

        log.info("EchoService.echoUpperCase():: Processed Inbound message: {}", processed);

        return String.format("Echo UpperCase: [%s]", processed);
	}


} // The End...
