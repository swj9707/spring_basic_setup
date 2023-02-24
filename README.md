# spring_basic_setup
Spring Boot Project 기초 셋업 아카이브 리포지토리 입니다. 
간단한 CRUD API 예시가 포함 되어있습니다. 공부에 참고 하시기 바랍니다. 

# Setup List
- BaseEntity, BaseImmutableEntity
  - BaseTimeEntity
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
