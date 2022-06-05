# IN
```sql
# 컬럼이 값1, 값2, 값3의 값 중 하나 이상과 일치한다면
WHERE 컬럼명 IN ('값1', '값2', '값3');

# 컬럼이 값1, 값2, 값3의 값 중 아무것도 일치하지 않는다면
WHERE 컬럼명 NOT IN('값1', '값2', '값3');
```
- 연속된 값이 아니라 **이산적인 값**을 위해 사용됨
- 집합 내부에 값이 존재하는지 여부 확인
- IN 연산자가 **OR 연산자보다 실행 속도가 빠름**
- IN 연산자에 다른 SELECT문을 넣을 수 있음

<br><br>

> ### Example
```sql
SELECT *
FROM CLASS_A
WHERE ADDRESS IN ('서울', '부산', '제주도');

# OR을 사용한다면
SELECT *
FROM CLASS_A
WHERE ADDRESS='서울' OR ADDRESS='부산' OR ADDRESS='제주도';
```
```sql
# NOT IN 사용시
# ADDRESS가 서울, 부산, 제주도가 아닌 값에 대해 조회
SELECT *
FROM CLASS_A
WHERE ADDRESS NOT IN ('서울', '부산', '제주도');
```

<br><br>

> ### 출처
- 우재남, 『이것이 MySQL이다』, 한빛출판네트워크
- https://velog.io/@inyong_pang/MySQL-IN-%EC%A1%B0%EA%B1%B4
- https://inforyou.tistory.com/28
