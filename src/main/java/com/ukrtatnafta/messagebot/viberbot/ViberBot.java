package com.ukrtatnafta.messagebot.viberbot;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ukrtatnafta.messagebot.db.domain.LogRecord;
import com.ukrtatnafta.messagebot.db.repository.IMessageBotCRUDLogRecordRepository;
import com.ukrtatnafta.messagebot.queue.Consumer;
import com.ukrtatnafta.messagebot.queue.Producer;
import com.ukrtatnafta.messagebot.viberbot.api.MessageBotCallApiMethodInterface;
import com.ukrtatnafta.messagebot.viberbot.api.Status;
import com.ukrtatnafta.messagebot.viberbot.api.ViberBotConfig;
import com.ukrtatnafta.messagebot.viberbot.api.WebHookStatus;
import com.ukrtatnafta.messagebot.viberbot.api.data.MessageBotDataObjectInterface;
import com.ukrtatnafta.messagebot.viberbot.enums.ViberApiMethodEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * Created by ivanov-av on 23.11.2017.
 */
@Service
public class ViberBot implements MessageBotCallApiMethodInterface {
    private static final Logger log = LoggerFactory.getLogger(com.ukrtatnafta.messagebot.viberbot.ViberBot.class);
    @Autowired
    IMessageBotCRUDLogRecordRepository messageBotCRUDLogRecordRepository;
    @Autowired
    private
    ObjectMapper objectMapper;
    @Autowired
    private Producer producer;
    @Autowired
    private Consumer consumer;
    @Autowired
    private ViberBotConfig viberBotConfig;
    @Autowired
    private RestTemplate restTemplate;

    public String getUrlApi() {
        return this.viberBotConfig.getUrlApi();
    }

    public void setUrlApi(String urlApi) {
        this.viberBotConfig.setUrl(urlApi);
    }

    public String getToken() {
        return this.viberBotConfig.getToken();
    }

    public void setToken(String token) {
        this.viberBotConfig.setToken(token);
    }

    public String getUrl() {
        return this.viberBotConfig.getUrl();
    }

    public void setUrl(String url) {
        this.viberBotConfig.setUrl(url);
    }

    @Override
    public ResponseEntity callApiMethod(ViberApiMethodEnum method, MessageBotDataObjectInterface data) {
        try {
            String jsonString = objectMapper.writeValueAsString(data);
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.add("X-Viber-Auth-Token", this.getToken());
            httpHeaders.add("Content-Type", "application/json");
            HttpEntity<String> httpEntity = new HttpEntity<>(jsonString, httpHeaders);
            messageBotCRUDLogRecordRepository.save(new LogRecord("Call API method", jsonString));
            ResponseEntity<String> responseEntity = restTemplate.exchange(this.getUrlApi() + method.getMethodName(), HttpMethod.POST, httpEntity, String.class);
            Status status = objectMapper.readValue(responseEntity.getBody(), Status.class);
            log.info(status.toString());
            producer.send(responseEntity.getBody());
            return responseEntity;
        } catch (JsonProcessingException e) {
            log.error(e.getMessage());
        } catch (IOException e) {
            log.error(e.toString());
        }
        return null;
    }

    public ResponseEntity webHook(@RequestBody String request) {
        try {
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.add("X-Viber-Auth-Token", this.getToken());
            httpHeaders.add("Content-Type", "application/json");
            WebHookStatus webHookStatus = new WebHookStatus("0", "200");
            HttpEntity<String> httpEntity = new HttpEntity(webHookStatus, httpHeaders);
            producer.send(request);
            log.info(request);
            return new ResponseEntity<String>(objectMapper.writeValueAsString(webHookStatus), httpHeaders, HttpStatus.OK);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
