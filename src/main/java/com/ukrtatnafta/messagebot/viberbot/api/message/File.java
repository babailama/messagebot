package com.ukrtatnafta.messagebot.viberbot.api.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ukrtatnafta.messagebot.viberbot.api.Message;

/**
 * Created by Администратор on 24.11.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class File extends Message {
    private String file_name;

    private String media;

    private Long size;

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
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
    public String toString() {
        return new StringBuilder().append(super.toString()).append("File{").append("file_name='").append(file_name).append('\'').append(", media='").append(media).append('\'').append(", size=").append(size).append('}').toString();
    }
}
