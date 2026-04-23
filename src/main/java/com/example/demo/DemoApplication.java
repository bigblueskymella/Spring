package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// 스프링 부트라는 거대한 공장의 스위치를 올리는 작업
		// 1. DemoApplication.class를 기준으로 주변 폴더를 샅샅이 훑는다.
		// 우리가 만든 @RestController, @Service, @Repository 같은 어노테이션이 붙은 클래스들을 다 찾아
		// 우리 마을 집 지을 사람(클래스)들을 소환하는 명단 작성 단계
		SpringApplication.run(DemoApplication.class, args);
	}

}

// DemoApplication.class: "이 클래스가 우리 동네의 대장
// 스프링이 알아서 객체 생성, 의존성 연결, 서버 구동을 한 번에 해주는
// 1. 스캔 -> 2. 생성 -> 3. 서버 오픈

// 1️⃣. "우리 동네(패키지)에 누가 살고 있지?" (Component Scan)
// DemoApplication.class를 기준으로 주변 폴더를 샅샅이 뒤집니다.
// 우리가 만든 @RestController, @Service, @Repository 같은 어노테이션이 붙은 클래스들을 다 찾아냅니다.
// 비유: 우리 마을에 집을 지을 사람(클래스)들을 소환하는 명단 작성 단계입니다.

// 2️⃣. "객체(Bean)를 만들어서 창고에 넣자!" (IoC 컨테이너 생성)
// 찾아낸 클래스들을 토대로 실제 객체(Bean)를 딱 하나씩 만듭니다.
// 그리고 이 객체들을 스프링이 직접 관리하는 **'스프링 컨테이너'**라는 커다란 보관함에 담습니다.
// 비유: 재료들을 다 모아서 요리할 준비가 된 주방을 세팅하는 단계입니다.

// 3️⃣. "서버 문 열어라!" (Embedded Tomcat 구동)
// 스프링 부트는 내부에 **톰캣(Tomcat)**이라는 웹 서버를 품고 있습니다.
// 별도의 설치 없이 8080 포트를 열고 손님(사용자)을 맞이할 준비를 마칩니다.
// 비유: 식당 영업 준비가 끝났으니 "OPEN" 간판을 내걸고 손님을 기다리는 단계입니다.