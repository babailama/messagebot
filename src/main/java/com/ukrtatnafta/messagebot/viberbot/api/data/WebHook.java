package com.ukrtatnafta.messagebot.viberbot.api.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ukrtatnafta.messagebot.viberbot.enums.ViberEventEnum;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ivanov-av on 24.11.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WebHook implements MessageBotDataObjectInterface {
    private String url;
    private List<ViberEventEnum> eventTypes;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getEventTypes() {
        return eventTypes.stream().map(ViberEventEnum::getName).collect(Collectors.toList());
    }

    public void setEventTypes(List<String> eventTypes) {
        this.eventTypes = eventTypes.stream().map(ViberEventEnum::get).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"url\"=\"").append(url).append('"');
        sb.append(", \"eventTypes=\"").append(eventTypes);
        sb.append('}');
        return sb.toString();
    }
}
