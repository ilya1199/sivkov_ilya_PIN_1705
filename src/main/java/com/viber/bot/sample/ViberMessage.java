package com.viber.bot.sample;

import java.util.Date;
import java.util.Random;

public class ViberMessage {
    private Integer ran;

    public ViberMessage(Integer ran) {

        this.ran = ran;
    }

    public Integer getran() {

        Integer i =  Math.abs(new Random(new Date().getTime()).nextInt()) % ran;
        return i;
    }

}
