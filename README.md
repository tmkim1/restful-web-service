# restful-web-service

활용 프레임워크 및 기술 
1. SpringBoot 
2. RestAPI 
3. JPA 

Restful WebService 구현

# Spring Boot
- DispatcherServletAutoConfiguration 
- ErrorMvcAutoConfiguration
- HttpMessageConvertersAutoConfiguration -> Json Convert

# lombok 
  - @Data: get, set, toString에 대한 메서드 자동 생성 
  - @AllArgsConstructor: 모든 아규먼트의 컨스트럭터 생성 (생성자)
  
# JavaBean 
  - String형이 아닌 JavaBean 클래스를 생성하여 View에 반환 시 JSON 형태로 자동으로 변환되어 반환 됨.  



# REST API
- [Response: XML 설정](https://tmkim.tistory.com/5)
- [Header를 이용한 버전관리](https://tmkim.tistory.com/4)
- [REST API Level3을 위한 HATEOS 설정](https://tmkim.tistory.com/6)


# RESTful API 설계 가이드 
- Consumer first
- 적절한 Status Code 반환 
- No Secure info in URI 
- Use plurals
  . 단건 조회라 하더라도 복수 형태로 표시 (/users/1)
- 동사형 보다는 명사형으로 사용 
- 비슷한 기능은 1가지 명칭으로 통일하여 Parameter를 바꿔주는 식으로 사용 


