package com.example.restfulwebservice.helloworld;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// lombok, Getter,Setter, toString, 생성자 관련 메서드가 자동으로 생성.
@Data
@AllArgsConstructor //모든 아규먼트에 대한 컨스트럭터가 만들어짐.
@NoArgsConstructor
public class HelloWorldBean {
    private String message;

    // 롬복 자동 생성
//    public String getMessage() {
//        return this.message;
//    }
//    public void setMessage(String msg) {
//        this.message = msg;
//    }
//    @AllArgsConstructor 해당 어노테이션이 자동으로 생성
//    public HelloWorldBean(String message) {
//
//    }
}
