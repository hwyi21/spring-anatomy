package com.example.springanatomy;

public class DependencyService {

    public DependencyService() {
        System.out.println("DependencyService 생성자 호출됨");
    }

    public void assist() {
        System.out.println("의존성 서비스 동작 중");
    }
}
