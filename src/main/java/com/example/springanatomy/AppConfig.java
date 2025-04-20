package com.example.springanatomy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration은 이 클래스가 스프링 설정 클래스임을 나타냅니다.
 * 내부에 정의된 @Bean 메서드를 통해 스프링 컨테이너에 Bean을 등록할 수 있게 해줍니다.
 * 이 클래스는 CGLIB 프록시로 감싸져, 내부 @Bean 메서드 간 호출 시에도 컨테이너를 통해
 * 동일한 싱글톤 인스턴스를 반환하게 됩니다.
 *
 * CGLIB 프록시: @Bean 메서드 간의 내부 호출을 가로채서,
 * 직접 메서드를 실행하는 대신 스프링 컨테이너에서 이미 등록된 Bean을 반환하도록 해주는 기술
 *
 * 싱글톤: 컨테이너가 해당 Bean을 애플리케이션 내에서 단 하나만 생성하여 공유하는 방식
 */
@Configuration
public class AppConfig {

    @Bean
    public DependencyService dependencyService() {
        return new DependencyService();
    }

    /**
     * @Bean은 해당 메서드가 반환하는 객체를 스프링 컨테이너에 Bean으로 등록하게 해주는 어노테이션입니다.
     * @Configuration 클래스 안에서 사용되며, 외부 라이브러리나 직접 생성한 객체를 등록할 때 사용됩니다.
     */
    @Bean
    public MyService myService() {
        return new MyService();
    }
}
