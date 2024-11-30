FROM openjdk:11-slim

# WAR 파일 다운로드 URL 설정
# https://github.com/naver/ngrinder/releases 에서 원하는 버전의 WAR 파일 URL을 설정
ARG WAR_FILE_TARGET_URL=https://github.com/naver/ngrinder/releases/download/ngrinder-3.5.9-p1-20240613/ngrinder-controller-3.5.9-p1.war

# curl 설치
RUN apt-get update && apt-get install -y curl && rm -rf /var/lib/apt/lists/*

# 네트워크에서 WAR 파일 다운로드
RUN curl -fL -o /app.war ${WAR_FILE_TARGET_URL}

ENTRYPOINT ["java", "-jar", "/app.war"]
