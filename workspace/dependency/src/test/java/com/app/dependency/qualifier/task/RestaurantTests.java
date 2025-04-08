package com.app.dependency.qualifier.task;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class RestaurantTests {
    @Autowired
    @Qualifier("vips")
    Restaurant vips;

    @Autowired
    Restaurant outback;

    @Test
    public void testVips() {
        log.info("{}", vips);
    }

    @Test
    public void testOutback() {
        log.info("{}", outback);
    }
}
