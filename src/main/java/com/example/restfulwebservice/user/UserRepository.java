package com.example.restfulwebservice.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //데이터 베이스 저장소 관련 Bean임을 스프링 컨테이너에 전달
public interface UserRepository extends JpaRepository<User, Integer> {

}
