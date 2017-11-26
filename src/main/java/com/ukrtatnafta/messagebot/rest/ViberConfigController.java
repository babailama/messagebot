package com.ukrtatnafta.messagebot.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ukrtatnafta.messagebot.viberbot.ViberBot;
import com.ukrtatnafta.messagebot.viberbot.api.EmptyObject;
import com.ukrtatnafta.messagebot.viberbot.api.ViberBotConfig;
import com.ukrtatnafta.messagebot.viberbot.enums.ViberApiMethodEnum;
import com.ukrtatnafta.messagebot.viberbot.enums.ViberEventEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ViberConfigController {

    private static final Logger log = LoggerFactory.getLogger(com.ukrtatnafta.messagebot.rest.ViberConfigController.class);
    @Autowired
    ViberBotConfig viberBotConfig;
    @Autowired
    ViberBot viberBot;
    @Autowired
    ObjectMapper objectMapper;


    @GetMapping("/config")
    public String config(Model model) {
        model.addAttribute("allViberEventEnums", ViberEventEnum.getAllEnumsAsStringsList());
        String statusText = viberBot.callApiMethod(ViberApiMethodEnum.GET_ACCOUNT_INFO,
                new EmptyObject()).getBody().toString();
        model.addAttribute("viberBotConfig", viberBotConfig);
        model.addAttribute("status", statusText);
        log.info("GET" + model.asMap().toString());
        return "config_form";
    }

    @PostMapping("/config")
    public String configSubmit(@ModelAttribute ViberBotConfig viberBotConfig, Model model) {
        model.addAttribute("allViberEventEnums", ViberEventEnum.getAllEnumsAsStringsList());
        model.addAttribute("viberBotConfig", viberBotConfig);
        this.viberBotConfig.setEventEnums(viberBotConfig.getEventEnums());
        log.info("web hook config: " + viberBotConfig.getWebhook().toString());
        log.info("POST" + this.viberBotConfig.toString());
        ResponseEntity<String> responseEntity = viberBot.callApiMethod(ViberApiMethodEnum.SET_WEBHOOK,
                viberBotConfig.getWebhook());
        model.addAttribute("status", responseEntity.getBody());
        log.info(responseEntity.getBody());
        return "config_form";
    }
}
