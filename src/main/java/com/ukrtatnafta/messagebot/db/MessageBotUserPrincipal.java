package com.ukrtatnafta.messagebot.db;

import com.ukrtatnafta.messagebot.db.domain.MessageBotRole;
import com.ukrtatnafta.messagebot.db.domain.MessageBotUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by ivanov-av on 30.11.2017.
 */
public class MessageBotUserPrincipal implements UserDetails {
    @Autowired
    private MessageBotDataBaseRepository dataBaseRepository;

    private MessageBotUser user;

    public MessageBotUserPrincipal(MessageBotUser user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> gas = new ArrayList<>();
        for (MessageBotRole role : user.getRoles()) {
            gas.add(new SimpleGrantedAuthority(role.getRole()));
        }
        return gas;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return user.getActive() == 1;
    }

    @Override
    public boolean isAccountNonLocked() {
        return user.getActive() == 1;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return user.getActive() == 1;
    }

    @Override
    public boolean isEnabled() {
        return user.getActive() == 1;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MessageBotUserPrincipal{");
        sb.append("user=").append(user.toString());
        sb.append('}');
        return sb.toString();
    }
}
