package com.ukrtatnafta.messagebot.viberbot.api.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ukrtatnafta.messagebot.viberbot.api.Message;
import com.ukrtatnafta.messagebot.viberbot.enums.MessageTypeEnum;

/**
 * Created by ivanov-av on 23.11.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Text extends Message {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getType(){
        return MessageTypeEnum.TEXT.getName();
    }
}
