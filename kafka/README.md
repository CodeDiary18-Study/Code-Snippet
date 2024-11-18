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

### 기본 메시지 송수신
```bash
# 토픽 생성
kafka-topics --create --topic my-topic --bootstrap-server broker:29092

# 메시지 보내기
kafka-console-producer --bootstrap-server broker:29092 --topic my-topic
# 메시지 입력 후 Enter 키를 누르면 메시지가 전송

# 메시지 소비하기
kafka-console-consumer --bootstrap-server broker:29092 --topic my-topic
# --from-beginning 옵션을 사용하면 토픽에 존재하는 모든 메시지를 소비
```

<br>

### key 값이 있는 메시지 송수신
```bash  
# 토픽 생성
kafka-topics --create --topic my-key-topic --bootstrap-server broker:29092

# 메시지 보내기
kafka-console-producer --bootstrap-server broker:29092 --topic my-key-topic \
 --property parse.key=true --property key.separator=,

# 메시지 소비하기
kafka-console-consumer --bootstrap-server broker:29092 --topic my-key-topic  \
 --property print.key=true --property print.value=true --from-beginning
```

### 여러 개의 파티션을 가지는 메시지 송수신
```bash
# 토픽 생성
kafka-topics --create --topic my-multi-topic --bootstrap-server broker:29092 --partitions 3
  
# 메시지 보내기
kafka-console-producer --bootstrap-server broker:29092 --topic my-multi-topic

# 메시지 소비하기
kafka-console-consumer --bootstrap-server broker:29092 --topic my-multi-topic \ 
 --from-beginning --property print.partition=true
# --property print.partition=true 옵션을 사용하면 파티션 번호를 출력

# 파티션별로 메시지 소비하기
kafka-console-consumer --bootstrap-server broker:29092 --topic my-multi-topic \ 
 --partition ${partition_number}
```
