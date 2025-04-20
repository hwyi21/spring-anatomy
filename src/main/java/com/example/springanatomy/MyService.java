package com.example.springanatomy;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

public class MyService {

    @Autowired
    private DependencyService dependency;

    public MyService() {
        System.out.println("MyService 생성자 호출됨");
        System.out.println("생성자에서 DI 상태 확인: " + dependency); // null일 것
    }

    /**
     * @PostConstruct는 의존성 주입이 끝난 후 자동으로 실행되는 초기화 메서드에 사용됩니다.
     * 생성자 이후에 호출되며, Bean이 컨테이너에 등록되기 전에 마지막으로 초기화 작업을 할 수 있는 안전한 시점입니다.
     * 데이터 검증, 연결 설정, 로그 출력 등 초기 세팅 로직을 넣는 데 적합합니다.
     */
    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct 초기화 메서드 호출됨");
        System.out.println("PostConstruct에서 DI 상태 확인: " + dependency); // 주입 완료 상태
        dependency.assist(); // 여기서 동작 성공
    }

    public void doSomething() {
        System.out.println("서비스 로직 실행 중");
    }
}
