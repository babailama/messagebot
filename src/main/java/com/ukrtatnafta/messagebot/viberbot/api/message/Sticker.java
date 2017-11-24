package com.ukrtatnafta.messagebot.viberbot.api.message;

import com.ukrtatnafta.messagebot.viberbot.api.Message;
import com.ukrtatnafta.messagebot.viberbot.enums.MessageTypeEnum;

/**
 * Created by Администратор on 24.11.2017.
 */

public class Sticker extends Message {
    private String stickerId;

    public String getStickerId() {
        return stickerId;
    }

    public void setStickerId(String stickerId) {
        this.stickerId = stickerId;
    }

    @Override
    public String getType() {
        return MessageTypeEnum.STICKER.getName();
    }

    @Override
    public String toString() {
        return new StringBuilder().append(super.toString()).append(super.toString()).append("Sticker{").append(" stickerId='").append(stickerId).append('\'').append('}').toString();
    }
}
