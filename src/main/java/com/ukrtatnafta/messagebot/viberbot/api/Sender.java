package com.ukrtatnafta.messagebot.viberbot.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ivanov-av on 23.11.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Sender {
    private String id;
    private String name;
    private String avatar;

    public Sender() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n----- User Information-----\n");
        sb.append("ID: " + getId() + "\n");
        sb.append("Name: " + getName() + "\n");
        sb.append("Avatar: " + getAvatar() + "\n");
        sb.append("*****************************");
        return sb.toString();
    }
}
