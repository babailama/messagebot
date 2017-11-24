package com.ukrtatnafta.messagebot.viberbot.api;

import com.ukrtatnafta.messagebot.viberbot.api.data.MessageBotDataObjectInterface;
import com.ukrtatnafta.messagebot.viberbot.enums.ViberApiMethodEnum;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ivanov-av on 24.11.2017.
 */
public interface MessageBotCallApiMethodInterface {
    ResponseEntity callApiMethod(ViberApiMethodEnum method, MessageBotDataObjectInterface data, RestTemplate restTemplate);
}
