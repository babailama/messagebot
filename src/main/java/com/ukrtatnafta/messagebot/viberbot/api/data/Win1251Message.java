package com.ukrtatnafta.messagebot.viberbot.api.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ivanov-av on 27.11.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Win1251Message implements MessageBotDataObjectInterface {
    private String receiverId;
    private String message;

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Win1251Message{");
        sb.append("receiver_id='").append(receiverId).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
