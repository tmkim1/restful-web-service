package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor // 디펄트 생성자 구현
//@JsonIgnoreProperties(value={"password","ssn"})
//@JsonFilter("UserInfo")
public class User {
    private Integer id;

    @Size(min=2, message = "Name은 2글자 이상 입력해주세요")
    private String name;
    @Past // 과거 날짜만 사용 가능
    private Date joinDate;

    //@JsonIgnore //response 반환 컬럼 항목에서 제외, 위에 처럼 클래스 위에 JsonIgoreProperties로 일괄 처리 가능.
    private String password;
    //@JsonIgnore
    private String ssn;
}
