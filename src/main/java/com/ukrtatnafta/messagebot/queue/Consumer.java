package com.ukrtatnafta.messagebot.queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.messaging.Message;

import javax.jms.Session;

import static com.ukrtatnafta.messagebot.ApplicationConfig.VIBER_QUEUE;
/**
 * Created by ivanov-av on 24.11.2017.
 */
@Component
public class Consumer {
    private static final Logger log = LoggerFactory.getLogger(com.ukrtatnafta.messagebot.queue.Consumer.class);

    @JmsListener(destination = VIBER_QUEUE)
    public void receiveMessage(@Payload String jsonString, @Headers MessageHeaders headers,
                               Message message, Session session) {
        log.info("received <" + jsonString + ">");

        log.info("- - - - - - - - - - - - - - - - - - - - - - - -");
        log.info("######          Message Details           #####");
        log.info("- - - - - - - - - - - - - - - - - - - - - - - -");
        log.info("headers: " + headers);
        log.info("message: " + message);
        log.info("session: " + session);
        log.info("- - - - - - - - - - - - - - - - - - - - - - - -");
    }
}
