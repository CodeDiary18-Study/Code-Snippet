# Alias(별칭)
- 데이터, 컬럼, 테이블, 서브쿼리, WHERE절 등에 사용 가능
- ```AS 별칭``` 형식으로 사용하면 됨
- AS는 ```생략 가능```해 띄어쓰기만으로도 별칭 지정 가능
- 만약 별칭의 **중간에 공백이 있다면** ```작은 따옴표(' ')```로 감싸줘야 함
- Example
  ```sql
  # 컬럼명에 별칭 사용
  SELECT name as '이름', age as 나이, grade 학년, math_score '수학 점수' FROM A_CLASS;
  
  # 기존 컬럼명 | 별칭
  # =====================
  # name       | 이름
  # age        | 나이
  # grade      | 학년
  # math_score | 수학 점수
  ```
  ```sql
  # 테이블에 별칭 사용
  SELECT A.name, A.age
  FROM A_CLASS A    # A_CLASS라는 테이블을 A라는 별칭으로 지정
  WHERE A.age>=10;
  ```






<br><br><br>
> ### 출처
- 우재남, 『이것이 MySQL이다』, 한빛출판네트워크
- https://royzero.tistory.com/68
