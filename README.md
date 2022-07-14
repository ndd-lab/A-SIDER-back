# A-SIDER-back
A-SIDER back-end

## TODO_LIST

## Spring Security 

- CORS 설정
- 추후 에러페이지 생성
- WebSecurityConfigurerAdapter가 deprecated 되기 때문에 수정해야함 (https://www.inflearn.com/questions/547599)

## Config

- WebSocket
- Transaction (검색) VS TxAdvice
- Multipart WebConfig
- Swagger 
- slf4j + logback
- jacoco

## Entity

- Entity 설계
- BaseEntity는 클래스에 선언
  - 작성시간, 수정시간, 작성자, 수정자
  - Dto to Entity, Entity To Dto (빌더패턴 이용)
- repository dto entity 넘기는 방법 고민