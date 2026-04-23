//🗄️ 3단계: DB와 대화하는 '매니저' 만들기 (Repository) 🟢관리자

package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository를 상속받으면 저장, 조회, 삭제 기능을 공짜로 사용합니다.
public interface MemoRepository extends JpaRepository<Memo, Long> {
}