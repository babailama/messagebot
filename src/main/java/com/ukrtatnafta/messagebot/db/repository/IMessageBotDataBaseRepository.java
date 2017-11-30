package com.ukrtatnafta.messagebot.db.repository;

import com.ukrtatnafta.messagebot.db.domain.MessageBotRole;
import com.ukrtatnafta.messagebot.db.domain.MessageBotUser;

/**
 * Created by ivanov-av on 29.11.2017.
 */
public interface IMessageBotDataBaseRepository {
    public MessageBotRole saveRole(MessageBotRole role);

    public MessageBotUser saveUser(MessageBotUser user);

    public MessageBotUser loadUser(String userName);

    public MessageBotRole loadRole(String role);
}
