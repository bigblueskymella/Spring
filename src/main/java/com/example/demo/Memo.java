// 🚀 2단계: 메모를 담을 '바구니' 만들기 (Entity) 🟢설계도
// 데이터를 어떤 모양으로 저장할 것인가?

package com.example.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity // "이 클래스는 DB에 테이블로 만들어줘!"라는 뜻
@Getter // 데이터를 가져오는 기능(get)을 자동으로 만듦
@NoArgsConstructor // 기본 생성자를 자동으로 만듦
public class Memo {

    @Id // 이 데이터의 고유 번호(주민번호 같은 것)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 번호를 1, 2, 3... 자동으로 붙여줌
    private Long id;

    @Column(nullable = false) // 빈 값은 허용 안 함
    private String content; // 메모 내용

    // 메모를 처음 만들 때 쓸 "생성자"
    public Memo(String content) {
        this.content = content;
    }
}