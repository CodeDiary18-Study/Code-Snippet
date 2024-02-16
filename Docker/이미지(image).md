# 이미지(image)
> ### 이미지 제거
- 명령어에서 image rm 부분은 rmi(= rm + i(이미지))로 변경하여 입력될 수 있음
```bash
# 이미지 기본 삭제
docker rmi ${이미지ID or 이미지명}
docker image rm ${이미지ID or 이미지명}

# 모든 이미지 일괄 삭제
docker rmi $(docker images -q)
```

<br><br>
