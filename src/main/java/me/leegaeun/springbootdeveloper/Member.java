package me.leegaeun.springbootdeveloper;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
//전체 인자를 가지는 생성자를 PROTECTED로 자동 생성
@AllArgsConstructor
//빌더패턴 추가
@Getter
@Entity
//DB 테이블과 링크될 클래스를 명시적으로 알려줌
public class Member {
    @Id
    //기본키
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //기본키 자동생성, 통신신하는 DBMS의 방식을 따름을 알림
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
}
