package com.ukrtatnafta.messagebot.db.repository;

import com.ukrtatnafta.messagebot.db.domain.MessageBotUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ivanov-av on 29.11.2017.
 */
@Repository("messageBotCRUDUserRepository")
public interface IMessageBotCRUDUserRepository extends CrudRepository<MessageBotUser, Long> {
}
