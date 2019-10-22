package com.example.demo;

import org.springframework.stereotype.Component;

public class Jungler implements Performer {
    private int beanBags = 3;

    public Jungler() {
    }

    public Jungler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
}
