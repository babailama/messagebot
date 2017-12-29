package com.ukrtatnafta.messagebot.viberbot.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.ukrtatnafta.messagebot.viberbot.api.data.MessageBotDataObjectInterface;
import com.ukrtatnafta.messagebot.viberbot.api.message.*;
import com.ukrtatnafta.messagebot.viberbot.api.message.keyboard.InternalKeyboard;
import com.ukrtatnafta.messagebot.viberbot.enums.MessageTypeEnum;

/**
 * Created by ivanov-av on 23.11.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Contact.class, name = "contact"),
        @JsonSubTypes.Type(value = File.class, name = "file"),
        @JsonSubTypes.Type(value = Location.class, name = "location"),
        @JsonSubTypes.Type(value = Sticker.class, name = "sticker"),
        @JsonSubTypes.Type(value = Text.class, name = "text"),
        @JsonSubTypes.Type(value = Url.class, name = "url"),
        @JsonSubTypes.Type(value = Video.class, name = "video")
})
public class Message implements MessageBotDataObjectInterface{
    private String receiver;
    private MessageTypeEnum type;
    private Sender sender;
    private String trackingData;
    private Long minApiVersion = 1L;
    private InternalKeyboard keyboard;

    public InternalKeyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(InternalKeyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getType() {
        return type.getName();
    }

    public void setType(String type) {
        this.type = MessageTypeEnum.get(type);
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public String getTrackingData() {
        return trackingData;
    }

    public void setTrackingData(String trackingData) {
        this.trackingData = trackingData;
    }

    public Long getMinApiVersion() {
        return minApiVersion;
    }

    public void setMinApiVersion(Long minApiVersion) {
        this.minApiVersion = minApiVersion;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Message{").append("receiver='").append(receiver).append('\'').append(", type='").append(type).append('\'').append(", sender=").append(sender).append(", trackingData='").append(trackingData).append('\'').append(", minApiVersion=").append(minApiVersion).append('}').toString();
    }
}
