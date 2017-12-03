package com.ukrtatnafta.messagebot;

import com.ukrtatnafta.messagebot.db.MessageBotUserDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AnonymousAuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AnonymousAuthenticationFilter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * Created by ivanov-av on 29.11.2017.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    private static final Logger log = LoggerFactory.getLogger(WebMvcConfig.class);

    @Autowired
    MessageBotUserDetailsService userDetailsService;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("/webjars/");
        registry.addResourceHandler("/images/**")
                .addResourceLocations("/resources/static/images/");
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }



/*    @Bean UserDetailsService userDetailsService(){
        return userDetailsService;
    }*/

    @Bean
    public DaoAuthenticationProvider authProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }

    @Bean
    public AnonymousAuthenticationFilter anonymousAuthFilter() {
        AnonymousAuthenticationFilter anonymousAuthenticationFilter = new AnonymousAuthenticationFilter("message_bot_anonymous");
        return anonymousAuthenticationFilter;
    }

    @Bean
    public AnonymousAuthenticationProvider anonymousAuthenticationProvider() {
        return new AnonymousAuthenticationProvider("message_bot_anonymous");
    }
}
