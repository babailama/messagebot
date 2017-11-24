package com.ukrtatnafta.messagebot.viberbot.api.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ivanov-av on 24.11.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WebHook implements MessageBotDataObjectInterface {
    private String url;
    private String[] eventTypes;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String[] getEventTypes() {
        return eventTypes;
    }

    public void setEventTypes(String[] eventTypes) {
        this.eventTypes = eventTypes;
    }
}
