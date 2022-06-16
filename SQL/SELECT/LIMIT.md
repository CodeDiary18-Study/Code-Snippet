# LIMIT
```sql
SELECT * FROM 테이블
LIMIT N
```
- 출력하는 개수를 제한
- 상위 N개만 출력하고 싶다면 ```LIMIT N```을 사용
- 페이징 처리를 위해 사용하고 싶다면 ```LIMIT x, y```를 사용
  - x+1행부터 y개의 행으로 제한
  - 첫번째 행이면 x자리에 0을 넣어줘야 함
  - ```LIMIT y OFFSET x```로 변경해서 사용할 수 있음

<br><br>

> ### Example
```sql
# AGE 내림차순으로 정렬 후 상위 5개의 데이터만 조회
SELECT *
FROM 테이블
ORDER BY AGE DESC
LIMIT 5;


# 11행부터 15행까지의 데이터를 조회
# 방법1
SELECT *
FROM 테이블
LIMIT 10, 5;

# 방법2
SELECT *
FROM 테이블
LIMIT 5 OFFSET 10;
```

<br><br><br>

> ### 출처
- https://truman-show.tistory.com/8
- https://diaryofgreen.tistory.com/82
- https://zzang9ha.tistory.com/295
