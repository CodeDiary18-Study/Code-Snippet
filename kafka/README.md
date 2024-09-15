# kafka

### Docker Compose로 Kafka 실행하기
[confluent kafka](https://github.com/confluentinc/cp-all-in-one/blob/7.6.2-post/cp-all-in-one/docker-compose.yml)에서 제공하는
docker-compose 파일을 활용하여 Kafka를 실행
```bash
docker-compose up -d
```

<br>

### kafka cli를 실행할 수 있는 컨테이너 접속
```bash
docker exec -it broker /bin/bash
```

### 토픽 생성/조회
```bash
# 토픽 생성(default partition 1, replication-factor 1)
kafka-topics --create --topic my-topic --bootstrap-server broker:29092 

# 토픽 목록 보기
kafka-topics --list --bootstrap-server broker:29092

# 토픽 상세 정보 보기
kafka-topics --describe --topic my-topic --bootstrap-server broker:29092

# 토픽 삭제
kafka-topics --delete --topic my-topic --bootstrap-server broker:29092
```

<br>
