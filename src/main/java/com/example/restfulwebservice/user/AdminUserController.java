package com.example.restfulwebservice.user;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminUserController {
    private UserDaoService service; // new로 생성하지 않고 의존성 주입을 사용할거임.


    // 생성자 의존성 주입
    public AdminUserController(UserDaoService service) {
        this.service = service;
    }

    // 전체 사용자 조회
    @GetMapping("/users")
    public List<User> retrieveAllUsers() {

        return service.findAll();
    }

    //Get /users/1 or /users/10 -> String // PathVariable 에서 타입을 int로 설정하면 자동으로 int로 받아와짐
    //Filter 적용을 위한 반환 타입 User => MappingJacksonValue 변경
    @GetMapping("/user/{id}")
    public MappingJacksonValue retrieveUser(@PathVariable int id) {
        User user = service.findOne(id);

        if(user == null) {
            throw new UserNotFoundException(String.format("ID[%s] not found ", id));
        }

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.
                filterOutAllExcept("id", "name", "joinDate", "password", "ssn");

        FilterProvider filters = new SimpleFilterProvider().addFilter("UserInfo",filter);

        MappingJacksonValue mapping = new MappingJacksonValue(user);
        mapping.setFilters(filters);

        return mapping;
    }

}
