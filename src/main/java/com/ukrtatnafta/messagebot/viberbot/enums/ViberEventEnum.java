package com.ukrtatnafta.messagebot.viberbot.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ivanov-av on 23.11.2017.
 */
public enum ViberEventEnum {
    DELIVERED("delivered"),
    SEEN("seen"),
    FAILED("failed"),
    SUBSCRIBED("subscribed"),
    UNSUBSCRIBED("unsubscribed"),
    CONVERSATION_STARTED("conversation_started");

    String name;

    private static final Map<String, ViberEventEnum> lookup = new HashMap<>();

    static {
        for (ViberEventEnum v : ViberEventEnum.values()) {
            lookup.put(v.getName(), v);
        }
    }

    public static ViberEventEnum get(String name) {
        return lookup.get(name);
    }

    ViberEventEnum(String name) {
        this.name = name;
    }

    public static List<String> getAllEnumsAsStringsList() {
        List<String> allViberEventEnums = new ArrayList<>();
        for (ViberEventEnum viberEventEnum : ViberEventEnum.values()) {
            String name = viberEventEnum.getName();
            allViberEventEnums.add(name);
        }
        return allViberEventEnums;
    }

    public String getName() {
        return name;
    }


}
