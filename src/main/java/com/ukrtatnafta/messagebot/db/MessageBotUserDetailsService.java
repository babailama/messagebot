package com.ukrtatnafta.messagebot.db;

import com.ukrtatnafta.messagebot.db.domain.MessageBotUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by ivanov-av on 30.11.2017.
 */
@Service
public class MessageBotUserDetailsService implements UserDetailsService {
    private static final Logger log = LoggerFactory.getLogger(MessageBotUserDetailsService.class);
    @Autowired
    private MessageBotDataBaseRepository dataBaseRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        log.info("Attempting to login, user: '" + userName + "'");
        MessageBotUser user = dataBaseRepository.loadUser(userName);
        if (user == null) {
            log.error("User not found: '" + userName + "'");
            throw new UsernameNotFoundException(userName);
        }
        MessageBotUserPrincipal userPrincipal = new MessageBotUserPrincipal(user);
        log.info(userPrincipal.toString());
        return userPrincipal;
    }
}
