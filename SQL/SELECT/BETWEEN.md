# BETWEEN A AND B
- A와 B를 포함한 그 사이의 모든 값에 해당하는지 여부를 조건으로 함
- 숫자, 문자, 날짜 등 관련해서 사용
- 참고 : BETWEEN을 사용하는 것보다 부등호를 사용해서 조회하는 것이 빠름
<br><br>
> ### 숫자 범위 검색
```sql
SELECT *
FROM A
WHERE AGE BETWEEN 20 AND 100; # AGE 컬럼의 값이 20이상 100이하 조회
```

<br><br>
> ### 날짜 범위 검색
```sql
SELECT *
FROM A
WHERE DATE(HIRE_DATE) BETWEEN '2022-01-01' AND DATE'2022-12-31';
# HIRE_DATE가 2022-01-01부터 2022-12-31까지 포함되는 것 출력
```


<br><br><br>
> ### 출처
- https://kwonnam.pe.kr/wiki/database/mysql/between
- https://gent.tistory.com/282
