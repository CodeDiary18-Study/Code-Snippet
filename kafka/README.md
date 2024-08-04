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

<br>
