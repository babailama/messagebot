package com.ukrtatnafta.messagebot.db.domain;

import javax.persistence.*;

/**
 * Created by ivanov-av on 30.11.2017.
 */
@Entity
@Table(name = "viber_group")
public class ViberGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "viber_group")
    private String viberGroup;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getViberGroup() {
        return viberGroup;
    }

    public void setViberGroup(String viberGroup) {
        this.viberGroup = viberGroup;
    }
}
