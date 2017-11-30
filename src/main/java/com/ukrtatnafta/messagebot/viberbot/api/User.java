package com.ukrtatnafta.messagebot.viberbot.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ukrtatnafta.messagebot.db.domain.ViberGroup;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by ivanov-av on 23.11.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "viber_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @JsonIgnore
    private int numeric_id;
    @JsonIgnore
    @Column(name = "utn_user")
    private String utnUserName;
    @Column(name = "viber_id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "avatar")
    private String avatar;
    @Column(name = "country")
    private String country;
    @Column(name = "language")
    private String language;
    @Column(name = "device_type")
    private String deviceType;
    @Column(name = "primary_device_os")
    private String primaryDeviceOs;
    @Column(name = "api_version")
    private Long apiVersion;
    @Column(name = "viber_version")
    private String viberVersion;
    @Column(name = "mcc")
    private Long mcc;
    @Column(name = "mnc")
    private Long mnc;
    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "viber_user_group", joinColumns = @JoinColumn(name = "utn_user_id"), inverseJoinColumns = @JoinColumn(name = "viber_group_id"))
    private Set<ViberGroup> groups;

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

    public int getNumeric_id() {
        return numeric_id;
    }

    public void setNumeric_id(int numeric_id) {
        this.numeric_id = numeric_id;
    }

    public String getUtnUserName() {
        return utnUserName;
    }

    public void setUtnUserName(String utnUserName) {
        this.utnUserName = utnUserName;
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
