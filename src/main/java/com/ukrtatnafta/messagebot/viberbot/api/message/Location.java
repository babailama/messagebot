package com.ukrtatnafta.messagebot.viberbot.api.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ukrtatnafta.messagebot.viberbot.api.Message;
import com.ukrtatnafta.messagebot.viberbot.enums.MessageTypeEnum;

/**
 * Created by Администратор on 24.11.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location extends Message {
    com.ukrtatnafta.messagebot.viberbot.api.Location location;

    public com.ukrtatnafta.messagebot.viberbot.api.Location getLocation() {
        return location;
    }

    public void setLocation(com.ukrtatnafta.messagebot.viberbot.api.Location location) {
        this.location = location;
    }

    @Override
    public String getType() {
        return MessageTypeEnum.LOCATION.getName();
    }

    @Override
    public String toString() {
        return new StringBuilder().append(super.toString()).append("Location{").append("location=").append(location).append('}').toString();
    }
}
