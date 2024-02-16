# 컨테이너(container)
> ### 컨테이너 제거
- 명령어에서 container 키워드는 생략될 수 있음
```bash
# 컨테이너 기본 삭제
docker rm ${컨테이너ID or 컨테이너명}
docker container rm ${컨테이너ID or 컨테이너명}

# 실행중인 컨테이너 강제 삭제
docker rm -f ${컨테이너ID or 컨테이너명}
docker container rm -f ${컨테이너ID or 컨테이너명}

# 실행중인 모든 컨테이너 일괄 (강제) 삭제
docker rm -f $(docker ps -aq)
docker container rm -f $(docker ps -aq)
```

<br><br>
