package com.app.dependency.qualifier.task;

import lombok.ToString;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@ToString
public class Outback implements Restaurant {
    private int steakPrice;

    public Outback() {
        this.steakPrice = Restaurant.steakPrice + 20000;
    }

    @Override
    public boolean selfBarUse() {
        return false;
    }
}
