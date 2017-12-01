package com.ukrtatnafta.messagebot.db.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by ivanov-av on 01.12.2017.
 */
@Entity
@Table(name = "logs")
public class LogRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "date")
    private Date date;
    @Column(name = "source")
    private String source;
    @Column(name = "message", length = 4096)
    private String message;

    public LogRecord(String source, String message) {
        this.source = source;
        this.message = message;
    }

    @PrePersist
    protected void onCreate() {
        date = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
