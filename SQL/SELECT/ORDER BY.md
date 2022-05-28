# ORDER BY
- SELECT로 데이터를 조회할 때, ```ORDER BY```를 사용해 지정된 컬럼을 기준으로 정렬할 수 있음
- ```ASC(오름차순)```과 ```DESC(내림차순)``` 두 가지 정렬 방법이 있음
  - ASC 또는 DESC를 입력하지 않았다면, 기본인 오름차순(ASC)으로 정렬됨

<br><br>

> ### 오름차순 정렬
```sql
SELECT * FROM 테이블 ORDER BY 컬럼1 ASC;
# or
SELECT * FROM 테이블 ORDER BY 컬럼1;
```
<br><br>

> ### 내림차순 정렬
```sql
SELECT * FROM 테이블 ORDER BY 컬럼1 DESC;
```
<br><br>

> ### 여러 컬럼으로 정렬
```sql
SELECT * FROM 테이블 ORDER BY 컬럼1, 컬럼2 DESC, 컬럼3 ASC;
# 컬럼1을 오름차순, 컬럼2를 내림차순, 컬럼3을 오름차순으로 정렬
```
<br><br>

> ### FIELD()
```FIELD()```를 사용해 특정한 값을 우선적으로 정렬할 수 있음
```sql
SELECT * FROM 테이블 ORDER BY FIELD(컬럼1, 우선 정렬할 값, 두번째 정렬할 값, 세번째...);
```
<br><br><br>

> ### 출처
- https://extbrain.tistory.com/51
- https://jabstorage.tistory.com/30
- https://java119.tistory.com/78
