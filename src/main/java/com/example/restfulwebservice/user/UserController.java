package com.example.restfulwebservice.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private UserDaoService service; // new로 생성하지 않고 의존성 주입을 사용할거임.


    // 생성자 의존성 주입
    public UserController(UserDaoService service) {
        this.service = service;
    }

    // 전체 사용자 조회
    @GetMapping("/users")
    public List<User> retrieveAllUsers() {

        return service.findAll();
    }

    //Get /users/1 or /users/10 -> String // PathVariable 에서 타입을 int로 설정하면 자동으로 int로 받아와짐
    @GetMapping("/user /{id}")
    public User retrieveUser(@PathVariable int id) {
        return service.findOne(id);
    }


}
