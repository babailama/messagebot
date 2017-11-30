package com.ukrtatnafta.messagebot.db.repository;

import com.ukrtatnafta.messagebot.db.domain.MessageBotRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by ivanov-av on 29.11.2017.
 */
@Repository("messageBotRoleRepository")
public interface IMessageBotRoleRepository extends JpaRepository<MessageBotRole, Long> {
    public MessageBotRole findByRole(String string);
}
