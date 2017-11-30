package com.ukrtatnafta.messagebot.db.repository;

import com.ukrtatnafta.messagebot.viberbot.api.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ivanov-av on 30.11.2017.
 */
@Repository("messageBotCRUDViberUserRepository")
public interface IMessageBotCRUDViberUserRepository extends CrudRepository<User, Long> {
}
