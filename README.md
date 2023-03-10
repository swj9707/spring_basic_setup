# spring_basic_setup
Spring Boot Project 기초 셋업 아카이브 리포지토리 입니다.  
간단한 CRUD API 예시가 포함 되어있습니다. 공부에 참고 하시기 바랍니다. 

# Setup List
- BaseEntity, 
  - BaseTimeEntity
    - 생성 시간, 수정 시간 자동생성
  - BaseImmutableEntity
    - 생성 시간 자동생성
  - BaseEntity
    - 생성 및 수정시간, 생성 한 유저, 수정한 유저 데이터 저장 기능
- 전역 응답 객체
- 전역 에러처리 (RestControllerAdvice)
- 전역 에러객체
- 커스텀 에러 Enum
- Swagger UI
- CORS 에러 방지 WebMvcConfig 셋업
- Dockerfile
- MySQL, Redis 등이 포함 된 Docker Compose
  - MySQL 초기 데이터
- Docker Compose 관리 목적의 Makefile
  - Makefile 을 이런 용도로 쓰시면 안됩니다....
  - make 명령어 사용 가능하도록 셋업 해야 사용 가능합니다. 

# Features
- 유저 정보 입력 및 조회 기능
- 상품 등록 기능
- 상품 조회 기능
- 상품 카테고리 등록 기능
- 상품 카테고리별 조회 기능

# How to use?
- Docker Compose 를 통해 컨테이너들을 실행시키면 자동으로 MySQL과 매핑 된 데이터 파일들에 의해 기초 셋업이 진행됩니다. 
- http://localhost:8080/swagger-ui/index.html 에 접속하셔서 API 테스트 진행 해보시면 됩니다. 
