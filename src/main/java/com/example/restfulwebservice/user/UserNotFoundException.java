package com.example.restfulwebservice.user;

// HTTP STATUS CODE
// 2xx -> ok
// 4xx -> client
// 5xx -> server

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) // 해당 어노테이션이 없으면 500번 에러가 발생, 정확한 상태 코드를 전달해주기 위해 ResponseStatus를 사용
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
