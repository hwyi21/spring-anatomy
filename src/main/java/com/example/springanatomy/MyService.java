package com.example.springanatomy;

import jakarta.annotation.PostConstruct;

public class MyService {

    public MyService() {
        System.out.println("MyService 생성자 호출됨");
    }

    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct 초기화 메서드 호출됨");
    }

    public void doSomething() {
        System.out.println("서비스 로직 실행 중");
    }
}
