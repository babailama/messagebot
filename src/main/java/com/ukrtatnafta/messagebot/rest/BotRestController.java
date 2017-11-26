package com.ukrtatnafta.messagebot.rest;

import com.ukrtatnafta.messagebot.viberbot.ViberBot;
import com.ukrtatnafta.messagebot.viberbot.api.data.AccountInfo;
import com.ukrtatnafta.messagebot.viberbot.api.message.Location;
import com.ukrtatnafta.messagebot.viberbot.api.message.Text;
import com.ukrtatnafta.messagebot.viberbot.api.message.Url;
import com.ukrtatnafta.messagebot.viberbot.api.reguest.OnlineRequest;
import com.ukrtatnafta.messagebot.viberbot.api.reguest.UserDetailsRequest;
import com.ukrtatnafta.messagebot.viberbot.enums.ViberApiMethodEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by ivanov-av on 23.11.2017.
 */
@RestController
public class BotRestController {
    private static final Logger log = LoggerFactory.getLogger(com.ukrtatnafta.messagebot.rest.BotRestController.class);
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private ViberBot viberBot;

    @RequestMapping(value = "/account_info", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public ResponseEntity accountInfo() {
        log.info("get account info for "+viberBot.getToken());
        return viberBot.callApiMethod(ViberApiMethodEnum.GET_ACCOUNT_INFO, new AccountInfo());
    }

    @RequestMapping(value = "/send_text_message", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public ResponseEntity sendTextMessage(@RequestBody Text message) {
        log.info("sending text message for " + message.getReceiver());
        return viberBot.callApiMethod(ViberApiMethodEnum.SEND_MESSAGE, message);
    }

    @RequestMapping(value = "/send_url", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public ResponseEntity sendTextMessage(@RequestBody Url message) {
        log.info("sending text message for " + message.getReceiver());
        return viberBot.callApiMethod(ViberApiMethodEnum.SEND_MESSAGE, message);
    }

    @RequestMapping(value = "/send_location", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public ResponseEntity sendTextMessage(@RequestBody Location message) {
        log.info("sending text message for " + message.getReceiver());
        log.info(message.toString());
        return viberBot.callApiMethod(ViberApiMethodEnum.SEND_MESSAGE, message);
    }

    @RequestMapping(value = "/get_user_details", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public ResponseEntity getUserDetails(@RequestBody UserDetailsRequest request) {
        return viberBot.callApiMethod(ViberApiMethodEnum.GET_USER_DETAILS, request);
    }

    @RequestMapping(value = "/get_online", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public ResponseEntity getUserDetails(@RequestBody OnlineRequest request) {
        return viberBot.callApiMethod(ViberApiMethodEnum.GET_ONLINE, request);
    }

    @RequestMapping(value = "/set_webhook", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public ResponseEntity setWebHook(@RequestBody OnlineRequest request) {
        return viberBot.callApiMethod(ViberApiMethodEnum.SET_WEBHOOK, request);
    }

    @RequestMapping(value = "/hook", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public ResponseEntity webHook(@RequestBody String request) {
        return viberBot.webHook(request);
    }
}
