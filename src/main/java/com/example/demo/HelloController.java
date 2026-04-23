// 🟢손님 맞이 카운터

package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor // Repository를 가져오기 위한 마법의 주문
public class HelloController {

    private final MemoRepository memoRepository; // 매니저 소환

    // 1. 메모 저장 (C: Create)
    @PostMapping("/memos")
    public Memo createMemo(@RequestBody String content) {
        // 3️⃣앞뒤에 붙은 " 따옴표를 제거하는 처리 (브라우저 fetch 특성 때문)
        String cleanContent = content.replace("\"", "");
        // Memo memo = new Memo(content); //2️⃣
        Memo memo = new Memo(cleanContent); //3️⃣
        return memoRepository.save(memo);
    }

    // 2. 메모 전체 조회 (R: Read)
    @GetMapping("/memos")
    public List<Memo> getAllMemos() {
        return memoRepository.findAll();
    }

    // 3. 메모 삭제 (D: Delete)
    @DeleteMapping("/memos/{id}") // 주소 뒤에 번호를 붙여서 요청 (예: /memos/1)
    public String deleteMemo(@PathVariable Long id) {
        memoRepository.deleteById(id);
        return id + "번 메모가 삭제되었습니다!";
    }
}


// 1️⃣
// package com.example.demo;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// public class HelloController {

//     @GetMapping("/")
//     public String home() {
//         return "드디어 VS Code에서 스프링부트 성공!";
//     }
// }