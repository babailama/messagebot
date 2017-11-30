package com.ukrtatnafta.messagebot.db.domain;

import javax.persistence.*;

/**
 * Created by ivanov-av on 29.11.2017.
 */
@Entity
@Table(name = "role")
public class MessageBotRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int id;

    @Column(name = "role")
    private String role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MessageBotRole{");
        sb.append("id=").append(id);
        sb.append(", role='").append(role).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
