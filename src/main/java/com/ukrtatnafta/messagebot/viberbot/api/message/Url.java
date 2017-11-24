package com.ukrtatnafta.messagebot.viberbot.api.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ukrtatnafta.messagebot.viberbot.api.Message;
import com.ukrtatnafta.messagebot.viberbot.enums.MessageTypeEnum;

/**
 * Created by Администратор on 24.11.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Url extends Message {
    private String media;

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    @Override
    public String getType() {
        return MessageTypeEnum.URL.getName();
    }

    @Override
    public String toString() {
        return new StringBuilder().append(super.toString()).append("Url{").append("media='").append(media).append('\'').append('}').toString();
    }
}
