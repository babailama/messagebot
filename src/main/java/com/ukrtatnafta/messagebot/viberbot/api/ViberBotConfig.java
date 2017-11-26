package com.ukrtatnafta.messagebot.viberbot.api;

import com.ukrtatnafta.messagebot.viberbot.api.data.WebHook;
import com.ukrtatnafta.messagebot.viberbot.enums.ViberEventEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ViberBotConfig {
    private String token;
    private String url;
    private List<ViberEventEnum> eventEnums = new ArrayList<>();
    private String urlApi;

    public String getUrlApi() {
        return urlApi;
    }

    public void setUrlApi(String urlApi) {
        this.urlApi = urlApi;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getEventEnums() {
        return eventEnums.stream().map(ViberEventEnum::getName).collect(Collectors.toList());
    }

    public void setEventEnums(List<String> eventEnums) {
        this.eventEnums = eventEnums.stream().map(ViberEventEnum::get).collect(Collectors.toList());
    }

    public WebHook getWebhook() {
        WebHook webHook = new WebHook();
        webHook.setUrl(this.getUrl());
        webHook.setEventTypes(this.getEventEnums());
        return webHook;
    }

    @Override
    public String toString() {
        return "ViberBotConfig{" +
                "token='" + token + '\'' +
                ", url='" + url + '\'' +
                ", eventEnums=" + eventEnums +
                ", urlApi='" + urlApi + '\'' +
                '}';
    }
}
