package com.ukrtatnafta.messagebot.queue;

import com.ukrtatnafta.messagebot.db.domain.LogRecord;
import com.ukrtatnafta.messagebot.db.repository.IMessageBotCRUDLogRecordRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.jms.Session;

import static com.ukrtatnafta.messagebot.ApplicationConfig.VIBER_QUEUE;
/**
 * Created by ivanov-av on 24.11.2017.
 */
@Component
public class Consumer {
    private static final Logger log = LoggerFactory.getLogger(com.ukrtatnafta.messagebot.queue.Consumer.class);
    @Autowired
    IMessageBotCRUDLogRecordRepository messageBotCRUDLogRecordRepository;

    @JmsListener(destination = VIBER_QUEUE)
    public void receiveMessage(@Payload String jsonString, @Headers MessageHeaders headers,
                               Message message, Session session) {
        /*
        TODO
        conversation with bot
        */

        LogRecord record = new LogRecord("Consumer", jsonString);
        messageBotCRUDLogRecordRepository.save(record);

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
