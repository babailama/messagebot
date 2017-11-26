package com.ukrtatnafta.messagebot.viberbot.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebHookStatus {
    private String status;
    private String statusMessage;

    public WebHookStatus(String status, String status_message) {
        this.status = status;
        this.statusMessage = status_message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
}
