package com.ukrtatnafta.messagebot.viberbot.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by ivanov-av on 23.11.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    private String id;
    private String name;
    private String avatar;
    private String country;
    private String language;
    //@JsonProperty("device_type")
    private String deviceType;
    //@JsonProperty("primary_device_os")
    private String primaryDeviceOs;
    //@JsonProperty("api_version")
    private Long apiVersion;
    //@JsonProperty("viber_version")
    private String viberVersion;
    private Long mcc;
    private Long mnc;

    public User() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n----- User Information-----\n");
        sb.append("ID: " + getId() + "\n");
        sb.append("Name: " + getName() + "\n");
        sb.append("Avatar: " + getAvatar() + "\n");
        sb.append("Country: " + getCountry() + "\n");
        sb.append("Language: " + getLanguage() + "\n");
        sb.append("Device type: " + getDeviceType() + "\n");
        sb.append("Primary device OS: " + getPrimaryDeviceOs() + "\n");
        sb.append("API version:" + getApiVersion() + "\n");
        sb.append("Viber version:" + getViberVersion() + "\n");
        sb.append("Mobile country code:" + getMcc() + "\n");
        sb.append("Mobile network code:" + getMnc() + "\n");
        sb.append("*****************************");
        return sb.toString();
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getPrimaryDeviceOs() {
        return primaryDeviceOs;
    }

    public void setPrimaryDeviceOs(String primaryDeviceOs) {
        this.primaryDeviceOs = primaryDeviceOs;
    }

    public Long getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(Long apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getViberVersion() {
        return viberVersion;
    }

    public void setViberVersion(String viberVersion) {
        this.viberVersion = viberVersion;
    }

    public Long getMcc() {
        return mcc;
    }

    public void setMcc(Long mcc) {
        this.mcc = mcc;
    }

    public Long getMnc() {
        return mnc;
    }

    public void setMnc(Long mnc) {
        this.mnc = mnc;
    }
}
