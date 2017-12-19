package com.ukrtatnafta.messagebot.viberbot.api.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ukrtatnafta.messagebot.viberbot.api.message.keyboard.InternalKeyboard;

/**
 * Created by ivanov-av on 14.12.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Keyboard extends Text {
    @JsonProperty("keyboard")
    private InternalKeyboard keyboard;


    public InternalKeyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(InternalKeyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Keyboard{");
        sb.append("keyboard=").append(keyboard);
        sb.append('}');
        return sb.toString();
    }
}
