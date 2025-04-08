package com.app.dependency.qualifier.task;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("vips")
@ToString
public class Vips implements Restaurant {
    private int steakPrice;

    public Vips() {
        this.steakPrice = Restaurant.steakPrice + 10000;
    }

    @Override
    public boolean selfBarUse() {
        return true;
    }
}
