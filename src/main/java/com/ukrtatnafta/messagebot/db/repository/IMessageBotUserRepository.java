package com.ukrtatnafta.messagebot.db.repository;

import com.ukrtatnafta.messagebot.db.domain.MessageBotUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by ivanov-av on 29.11.2017.
 */
@Repository("messageBotUserRepository")
public interface IMessageBotUserRepository extends JpaRepository<MessageBotUser, Long> {
    public MessageBotUser findByUserName(String userName);
}
