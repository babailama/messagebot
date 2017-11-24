package com.ukrtatnafta.messagebot.viberbot.enums;

/**
 * Created by ivanov-av on 24.11.2017.
 */
public enum ViberApiMethodEnum {
    GET_ACCOUNT_INFO("get_account_info"),
    SET_WEBHOOK("set_webhook"),
    SEND_MESSAGE("send_message"),
    GET_USER_DETAILS("get_user_details"),
    GET_ONLINE("get_online");

    String methodName;

    ViberApiMethodEnum(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodName() {
        return this.methodName;
    }

}
