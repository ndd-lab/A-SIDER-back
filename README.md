# A-SIDER-back
A-SIDER back-end

## TODO_LIST

## Spring Security

-[X] CORS 설정
-[ ] 추후 에러페이지 생성
-[ ] WebSecurityConfigurerAdapter가 deprecated 되기 때문에 수정해야함 (https://www.inflearn.com/questions/547599)

## Config

-[ ] WebSocket 지금이아닌 직접 사용하기 시작할때 추가하는것이 좋을듯
-[X] Transaction (검색) VS TxAdvice 서비스별로 트랜잭션 선언하는게 나을듯 why? 소스코드의 트랜잭션의 경계가 명확해짐
-[X] Multipart WebConfig 스프링 부트는 multipart객체 존재
-[x] Swagger 
-[x] slf4j + logback
-[ ] jacoco 모르겠음 ㅎ;;

## Entity

- Entity 설계
- BaseEntity는 클래스에 선언
  - 작성시간, 수정시간, 작성자, 수정자
  - Dto to Entity, Entity To Dto (빌더패턴 이용)
  - **위의 방법을 기본적으로 사용하되 때에 따라 유동적으로 변경**
- repository dto entity 넘기는 방법 고민