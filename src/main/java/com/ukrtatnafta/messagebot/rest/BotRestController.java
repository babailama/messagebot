package com.ukrtatnafta.messagebot.rest;

import com.ukrtatnafta.messagebot.viberbot.ViberBot;
import com.ukrtatnafta.messagebot.viberbot.api.data.AccountInfo;
import com.ukrtatnafta.messagebot.viberbot.api.message.Text;
import com.ukrtatnafta.messagebot.viberbot.enums.ViberApiMethodEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by ivanov-av on 23.11.2017.
 */
@RestController
public class BotRestController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private ViberBot viberBot;
    @Autowired
    private RestTemplate restTemplate;
    private static final Logger log = LoggerFactory.getLogger(com.ukrtatnafta.messagebot.Application.class);


    @RequestMapping(value = "/account_info", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public ResponseEntity accountInfo() {
        log.info("get account info for "+viberBot.getToken());
        return viberBot.callApiMethod(ViberApiMethodEnum.GET_ACCOUNT_INFO, new AccountInfo(), restTemplate);
    }

    @RequestMapping(value = "/send_text_message", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public ResponseEntity sendTextMessage(@RequestBody Text message) {
        log.info("sending text message for " + message.getReceiver());
        return viberBot.callApiMethod(ViberApiMethodEnum.SEND_MESSAGE, message, restTemplate);
    }
}
