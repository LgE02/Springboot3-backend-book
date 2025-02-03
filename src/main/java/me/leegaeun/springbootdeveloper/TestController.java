package me.leegaeun.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
//라우터 역할, http 요청과 메소드를 연결
public class TestController {
    @Autowired //TestService 빈 주입
    //다른 클래스의 객체를 주입받는다
    TestService testService;

    @GetMapping("/test")
    public List<Member> getAllMembers() {
        List<Member> members = testService.getAllMembers();
        return members;
    }

}
