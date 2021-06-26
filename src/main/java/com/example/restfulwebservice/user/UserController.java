package com.example.restfulwebservice.user;

import org.springframework.web.bind.annotation.*;

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

    // User 등록, @RequestBody 어노테이션을 사용하면 HTTP 요청 몸체를 자바 객체로 매핑하여 전달 받을수 있음
    @PostMapping("/users")
    public void createUser(@RequestBody User user) {
        User savedUser = service.save(user);
    }


}
