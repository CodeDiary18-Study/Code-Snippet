# DISTINCT
```sql
SELECT DISTINCT 컬럼 FROM 테이블;
```
- ```중복된 데이터를 제거```
- ```범주```를 확인할 때 사용됨

<br><br>

> ### Example
```sql
# 컬럼 범주 조회
SELECT DISTINCT 컬럼 FROM 테이블;

# 조건에 맞는 컬럼 범주 조회
SELECT DISTINCT 컬럼 FROM 테이블 WHERE 조건식;

# 컬럼 범주의 수 조회
SELECT COUNT(DISTINCT 컬럼) FROM 테이블;
```

<br><br><br>

> ### 출처
- https://extbrain.tistory.com/109
- https://webruden.tistory.com/739
