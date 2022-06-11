# Ranking(순위)
- [RANK](#RANK)
- [DENSE_RANK](#DENSE_RANK)

<br><br>

## RANK
```sql
RANK() OVER([PARTITION BY 컬럼명1] ORDER BY 컬럼명2 [DESC])
```
- 같은 점수를 가질 때 공동 순위
- 공동 순위 뒤 다음 순위는 공동 순위만큼 건너뜀
- ```PARTITION BY```는 그룹별(ex.. 부서별, 학급별)로 각각 순위를 매기고 싶을 때 사용하면 됨
- (20, 30, 30, 40)에 높은 점수 순으로 RANK 함수를 적용하면 (4, 2, 2, 1)
- Example
  ```sql
  SELECT NAME, SCORE, RANK() OVER (ORDER BY SCORE DESC) AS RANK
  FROM TEST;
  ```

<br><br><br>

## DENSE_RANK
```sql
DENSE_RANK() OVER([PARTITION BY 컬럼명1] ORDER BY 컬럼명2 [DESC])
```
- 같은 점수를 가질 때 공동 순위
- 공동 순위 뒤 다음 순위는 뛰어넘지 않고 이어감
- ```PARTITION BY```는 그룹별(ex.. 부서별, 학급별)로 각각 순위를 매기고 싶을 때 사용하면 됨
- (20, 30, 30, 40)에 높은 점수 순으로 RANK 함수를 적용하면 (3, 2, 2, 1)
- Example
  ```sql
  SELECT NAME, SCORE, DENSE_RANK() OVER (ORDER BY SCORE DESC) AS RANK
  FROM TEST;
  ```

<br><br><br>

> ### 출처
- https://velog.io/@minwest/Mysql-RANK-%ED%95%A8%EC%88%98
- https://satisfactoryplace.tistory.com/193
- https://velog.io/@jjeom122/Mysql-rank%ED%95%A8%EC%88%98
