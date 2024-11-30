# nGrinder

## Architecture

<img src="https://github.com/naver/ngrinder/wiki/assets/Architecture-29bb2.png" width="600">

<br><br>

## Setting

```bash
# ngrinder controller 실행
docker compose up controller

# ngrinder agent 실행
docker compose up --scale agent=${실행할 agent 수}
# docker compose up --scale agent=3
```
