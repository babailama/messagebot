package com.ukrtatnafta.messagebot.queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import static com.ukrtatnafta.messagebot.ApplicationConfig.VIBER_QUEUE;
/**
 * Created by ivanov-av on 24.11.2017.
 */
@Service
public class Producer {
    private static final Logger log = LoggerFactory.getLogger(com.ukrtatnafta.messagebot.queue.Producer.class);

    @Autowired
    private JmsTemplate jmsTemplate;

    public void send(String jsonString) {
        log.info("sending with convertAndSend() to queue <" + jsonString + ">");
        jmsTemplate.convertAndSend(VIBER_QUEUE, jsonString);
    }
}
