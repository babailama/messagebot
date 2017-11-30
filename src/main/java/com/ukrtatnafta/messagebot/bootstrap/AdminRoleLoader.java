package com.ukrtatnafta.messagebot.bootstrap;

import com.ukrtatnafta.messagebot.db.domain.MessageBotRole;
import com.ukrtatnafta.messagebot.db.domain.MessageBotUser;
import com.ukrtatnafta.messagebot.db.repository.IMessageBotDataBaseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by ivanov-av on 29.11.2017.
 */
@Component
public class AdminRoleLoader implements ApplicationListener<ContextRefreshedEvent> {
    private static final Logger log = LoggerFactory.getLogger(com.ukrtatnafta.messagebot.bootstrap.AdminRoleLoader.class);

    @Autowired
    private IMessageBotDataBaseRepository dataBaseRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        MessageBotRole role;// = dataBaseRepository.loadRole("ADMIN");
        MessageBotUser user = dataBaseRepository.loadUser("admin");

        if (user != null) {
            log.info(user.toString());
        } else {
            role = new MessageBotRole();
            role.setRole("ADMIN");
            user = new MessageBotUser();
            user.setActive(1);
            user.setUserName("admin");
            user.setPassword("p@$$w0rd");
            user.setRoles(new HashSet<>(Arrays.asList(role)));
            dataBaseRepository.saveUser(user);
        }

    }
}
