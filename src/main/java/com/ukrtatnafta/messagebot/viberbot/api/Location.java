package com.ukrtatnafta.messagebot.viberbot.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Администратор on 24.11.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
    private String lon;

    private String lat;

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Location{").append("lon='").append(lon).append('\'').append(", lat='").append(lat).append('\'').append('}').toString();
    }
}
