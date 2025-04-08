package com.app.dependency.injection;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
@RequiredArgsConstructor
public class Food {
//    필드가 생성된 이후에 주입되기 때문에
//    필드 주입
//    @Autowired
//    private Knife knife;

//    Setter 주입
//    private Knife knife;

//    @Autowired
//    public void setKnife(Knife knife) {
//        this.knife = knife;
//    }

//    생성자 주입
    private final Knife knife;
}
