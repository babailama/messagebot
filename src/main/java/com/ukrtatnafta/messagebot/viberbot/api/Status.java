package com.ukrtatnafta.messagebot.viberbot.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ukrtatnafta.messagebot.viberbot.enums.ViberEventEnum;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Администратор on 24.11.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)

public class Status {

    private String icon;

    private String status;

    private Location location;

    private String statusMessage;

    private String uri;

    private String country;

    private String id;

    private String category;

    private List<ViberEventEnum> eventTypes;

    private String subcategory;

    private String name;

    private String background;

    private String webhook;

    private String subscribersCount;

    private Member[] members;

    private String messageToken;

    public String getMessageToken() {
        return messageToken;
    }

    public void setMessageToken(String messageToken) {
        this.messageToken = messageToken;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getEventTypes() {
        return eventTypes.stream().map(ViberEventEnum::getName).collect(Collectors.toList());
    }

    public void setEventTypes(List<String> eventTypes) {
        this.eventTypes = eventTypes.stream().map(ViberEventEnum::get).collect(Collectors.toList());
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getWebhook() {
        return webhook;
    }

    public void setWebhook(String webhook) {
        this.webhook = webhook;
    }

    public String getSubscribersCount() {
        return subscribersCount;
    }

    public void setSubscribersCount(String subscribers_count) {
        this.subscribersCount = subscribers_count;
    }

    public Member[] getMembers() {
        return members;
    }

    public void setMembers(Member[] members) {
        this.members = members;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Status{");
        sb.append("icon='").append(icon).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", location=").append(location);
        sb.append(", statusMessage='").append(statusMessage).append('\'');
        sb.append(", uri='").append(uri).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", id='").append(id).append('\'');
        sb.append(", category='").append(category).append('\'');
        sb.append(", eventTypes=").append(eventTypes);
        sb.append(", subcategory='").append(subcategory).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", background='").append(background).append('\'');
        sb.append(", webhook='").append(webhook).append('\'');
        sb.append(", subscribersCount='").append(subscribersCount).append('\'');
        sb.append(", members=").append(Arrays.toString(members));
        sb.append(", messageToken='").append(messageToken).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
