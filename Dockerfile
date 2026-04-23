# 1. 자바 실행 환경(JDK) 준비
FROM eclipse-temurin:17-jdk-alpine

# 2. 빌드된 결과물(jar 파일)을 서버 안으로 복사
COPY build/libs/*-SNAPSHOT.jar app.jar

# 3. 서버 실행 명령
ENTRYPOINT ["java","-jar","/app.jar"]