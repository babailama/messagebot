package com.ukrtatnafta.messagebot.db.repository;

import com.ukrtatnafta.messagebot.db.domain.MessageBotRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ivanov-av on 29.11.2017.
 */
@Repository("messageBotCRUDRoleRepository")
public interface IMessageBotCRUDRoleRepository extends CrudRepository<MessageBotRole, Long> {
}
