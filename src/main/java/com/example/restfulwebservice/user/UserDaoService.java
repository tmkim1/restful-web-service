package com.example.restfulwebservice.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static Integer userCount = 3;

    static {
        users.add(new User(1, "taemin", new Date(),"pass1", "910121-2323222"));
        users.add(new User(2, "alice", new Date(), "pass2", "920121-2323222"));
        users.add(new User(3, "jodan", new Date(), "pass3", "930121-2323222"));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if(user.getId() == null) {
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for(User user : users) {
            if(user.getId().equals(id)) return user;
        }

        // statusCode 제어를 위한 예외 처리
        return null;
    }

    public User deleteById(int id) {
        // 리스트<클래스> -> 열거형으로 전환
        Iterator<User> iterator =  users.iterator();

        while(iterator.hasNext()) {
            User user = iterator.next();

            if(user.getId() == id) {
                iterator.remove();
                return user;
            }
        }

        return null;
    }

    public User updateById(int id,String name) {
        Iterator<User> iterator = users.iterator();

        while(iterator.hasNext()) {
            User user = iterator.next();

            if(user.getId() == id) {
                user.setName(name);
                return user;
            }
        }

        return null;
    }
}
