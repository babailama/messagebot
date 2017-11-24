package com.ukrtatnafta.messagebot.viberbot.api.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ukrtatnafta.messagebot.viberbot.api.Message;
import com.ukrtatnafta.messagebot.viberbot.enums.MessageTypeEnum;

/**
 * Created by Администратор on 24.11.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Video extends Message {
    private Long duration;

    private String thumbnail;

    private String media;

    private Long size;

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    @Override
    public String getType() {
        return MessageTypeEnum.VIDEO.getName();
    }

    @Override
    public String toString() {
        return new StringBuilder().append(super.toString()).append("Video{").append("duration=").append(duration).append(", thumbnail='").append(thumbnail).append('\'').append(", media='").append(media).append('\'').append(", size=").append(size).append('}').toString();
    }
}
