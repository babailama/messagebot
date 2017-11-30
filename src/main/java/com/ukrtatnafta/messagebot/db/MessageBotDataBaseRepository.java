package com.ukrtatnafta.messagebot.db;

import com.ukrtatnafta.messagebot.db.domain.MessageBotRole;
import com.ukrtatnafta.messagebot.db.domain.MessageBotUser;
import com.ukrtatnafta.messagebot.db.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by ivanov-av on 29.11.2017.
 */
@Service
@Transactional
public class MessageBotDataBaseRepository implements IMessageBotDataBaseRepository {
    @Autowired
    private IMessageBotCRUDRoleRepository messageBotCRUDRoleRepository;
    @Autowired
    private IMessageBotCRUDUserRepository messageBotCRUDUserRepository;
    @Autowired
    private IMessageBotUserRepository messageBotUserRepository;
    @Autowired
    private IMessageBotRoleRepository messageBotRoleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public MessageBotRole saveRole(MessageBotRole role) {
        return messageBotCRUDRoleRepository.save(role);
    }

    @Override
    public MessageBotUser saveUser(MessageBotUser user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return messageBotCRUDUserRepository.save(user);
    }

    @Override
    public MessageBotUser loadUser(String name) {
        return messageBotUserRepository.findByUserName(name);
    }

    @Override
    public MessageBotRole loadRole(String name) {
        return messageBotRoleRepository.findByRole(name);
    }
}
