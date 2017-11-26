package com.ukrtatnafta.messagebot.viberbot.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ukrtatnafta.messagebot.viberbot.api.data.MessageBotDataObjectInterface;
import com.ukrtatnafta.messagebot.viberbot.enums.MessageTypeEnum;

/**
 * Created by ivanov-av on 23.11.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Message implements MessageBotDataObjectInterface{
    private String receiver;
    private MessageTypeEnum type;
    private Sender sender;
    //@JsonProperty("tracking_data")
    private String trackingData;
    private Long minApiVersion = 1L;

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
