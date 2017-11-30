package com.ukrtatnafta.messagebot.web.www;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ukrtatnafta.messagebot.viberbot.ViberBot;
import com.ukrtatnafta.messagebot.viberbot.api.Sender;
import com.ukrtatnafta.messagebot.viberbot.api.data.Win1251Message;
import com.ukrtatnafta.messagebot.viberbot.api.message.Text;
import com.ukrtatnafta.messagebot.viberbot.enums.ViberApiMethodEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;

/**
 * Created by ivanov-av on 27.11.2017.
 */
@Controller
public class Win1251MEssageController {
    private static final Logger log = LoggerFactory.getLogger(Win1251MEssageController.class);
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private ViberBot viberBot;

    //"C:\Program Files\cURL\bin\curl" -vk -X POST -H "Content-Type: text/plain;charset=Cp1251" -H "X_UTN_VIBER_TOKEN: 46cb89e2f267d470-205d4f161f03435c-4297d520469042a5" -d "{""receiver_id"":""FtOXrz2Jtzl0sbCRbAQ9Ag=="",   ""message"":""привет мир!""}" http://10.5.9.8:9090/win2151message
    @PostMapping("/win2151message")
    public String win1251MessageHandler(@RequestBody String message) {
        try {
            Win1251Message win1251Message = objectMapper.readValue(message, Win1251Message.class);
            Text textMessage = new Text();
            textMessage.setText(win1251Message.getMessage());
            textMessage.setReceiver(win1251Message.getReceiverId());
            textMessage.setMinApiVersion(1L);
            textMessage.setType("text");
            textMessage.setSender(new Sender("UTN bot"));
            ResponseEntity responseEntity = viberBot.callApiMethod(ViberApiMethodEnum.SEND_MESSAGE, textMessage);
            log.info(responseEntity.getBody().toString());
            log.info(win1251Message.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "empty";
    }
}
