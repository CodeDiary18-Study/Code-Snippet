# SELECT
> ### 기본 검색 구조
```sql
SELECT [컬럼명들]   -- (","를 통해서 구분)
FROM [테이블명]
WHERE [조건들]      -- (and, or 연산자를 통해서 구분)
ORDER BY [컬럼명들] -- (","를 통해서 구분)
```
<br><br>

> ### 그룹 제어
```sql
SELECT [GROUP BY에서 사용된 컬럼명들, 집계함수]
FROM [테이블명]
WHERE [조건들]
GROUP BY [컬럼명들]                  -- (","를 통해서 구분)
HAVING [GROUP BY절에 해당하는 조건들] -- (","를 통해서 구분)
ORDER BY [컬럼명들]
```

