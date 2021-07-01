package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel(description = "사용자 상세 정보를 위한 도메인 객체")
public class User {
    private Integer id;

    @Size(min=2, message = "Name은 2글자 이상 입력해주세요")
    @ApiModelProperty(notes = "사용자 이름을 입력해주세요.")
    private String name;
    @Past // 과거 날짜만 사용 가능
    @ApiModelProperty(notes = "사용자 등록일을 입력해주세요.")
    private Date joinDate;

    //@JsonIgnore //response 반환 컬럼 항목에서 제외, 위에 처럼 클래스 위에 JsonIgoreProperties로 일괄 처리 가능.
    @ApiModelProperty(notes = "사용자 암호를 입력해주세요.")
    private String password;
    //@JsonIgnore
    @ApiModelProperty(notes = "사용자 주민번호를 입력해주세요.")
    private String ssn;
}
