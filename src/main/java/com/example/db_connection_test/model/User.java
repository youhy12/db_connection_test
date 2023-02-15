package com.example.db_connection_test.model;

import jakarta.persistence.*;
import lombok.*;

@Entity //DB의 테이블을 뜻함 [ Spring Data JPA 에서는 반드시 @Entity 어노테이션을 추가해야함]
@Table(name = "user") //DB 테이블의 이름을 명시 [ 테이블 명과 클래스 명이 동일한 경우 생략가능 ]
@Getter //Lombok의 Getter를 이용해 Getter 메소드를 생성하고 @Builder를 이용해서 객체를 생성할 수 있게처리한다.
@Builder //@Builder를 이용하기 위해 @AllArgsContructor 와 @NoArgsContructor를 같이 처리해야 컴파일 에러가 발생하지 않음
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
   //@GeneratedValue(strategy = GenerationType.IDENTITY) //Primary Key의 키 생성 전략(Strategy)을 설정하고자 할 때 사용
    private String id;

    private String name;
    private String email;

}
