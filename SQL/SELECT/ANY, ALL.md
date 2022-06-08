# ANY
- 여러개의 비교값 중 ```하나라도 만족하면 true 반환```
- IN과 다른점은 ```비교 연산자```를 사용한다는 점
```sql
컬럼명>=ANY(값1, 값2, 값3)
```
<br><br>

> ### 비교 연산자와 ANY
- ```> ANY``` : 최소값보다 크면
- ```>= ANY``` : 최소값보다 크거나 같으면
- ```< ANY``` : 최대값보다 작으면
- ```<= ANY``` : 최대값보다 작거나 같으면
- ```= ANY``` : **IN**과 같은 기능
- ```= ANY``` : **NOT IN**과 같은 기능

<br><br>

> ### Example
```sql
# 서브 쿼리의 AGE 중 최소값보다 큰 AGE를 가진 데이터 조회
SELECT *
FROM TEST
WHERE AGE > ANY(SELECT AGE FROM TEST WHERE ADDR='서울');

# AGE가 20보다 큰 데이터 조회
SELECT *
FROM TEST
WHERE AGE > ANY(20, 22, 31);
```

<br><br><br>

# ALL
- 전체 값을 비교해서 ```모두 만족해야 true 반환```
```sql
컬럼명>=ALL(값1, 값2, 값3)
```
<br><br>

> ### 비교 연산자와 ALL
- ```> ALL``` : 최대값보다 크면
- ```>= ALL``` : 최대값보다 크거나 같으면
- ```< ALL``` : 최소값보다 작으면
- ```<= ALL``` : 최소값보다 작거나 같으면
- ```= ALL``` : 서브 쿼리의 결과가 1건이면 괜찮지만 여러 건이면 오류가 발생
- ```!= ALL``` : 서브 쿼리의 결과가 1건이면 괜찮지만 여러 건이면 오류가 발생

<br><br>

> ### Example
```sql
# 서브 쿼리의 AGE 중 최대값보다 큰 AGE를 가진 데이터 조회
SELECT *
FROM TEST
WHERE AGE > ALL(SELECT AGE FROM TEST WHERE ADDR='서울');

# AGE가 31보다 큰 데이터 조회
SELECT *
FROM TEST
WHERE AGE > ALL(20, 22, 31);
```

<br><br><br>

> ### 출처
- https://carami.tistory.com/18
- https://aljjabaegi.tistory.com/14
- https://dlwjdcks5343.tistory.com/59
- https://ko.w3hmong.com/mysql/mysql_any_all.htm
