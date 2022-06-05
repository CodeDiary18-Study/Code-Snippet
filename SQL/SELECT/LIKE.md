# LIKE
```sql
WHERE 컬럼명 LIKE '해당하는 표현식'
```
- 문자열의 내용을 검색하기 위해 사용
- Wild Card(와일드 카드) 문자들과 함께 사용됨
  | 와일드 카드 | 설명 |
  |:---------:|:-----:|
  | % |문자가 없거나, 하나 이상의 문자에 아무 값이 들어가도 상관없을때 |
  | _ (언더바) | 하나의 문자에 어떤 값이 와도 상관 없을때 |
- 검색하려는 문자열이 와일드 카드(%, _ )라면 문자 앞에 역슬래시(\)를 넣어주면 됨

<br><br>
> ### Example
```sql
# '아'로 시작하는 데이터 검색
SELECT *
FROM TEST
WHERE NAME LIKE '아%';

# '스'로 끝나는 데이터 검색
SELECT *
FROM TEST
WHERE NAME LIKE '%스';

# 중간에 '디다'가 들어가는 데이터 검색
SELECT *
FROM TEST
WHERE NAME LIKE '%디다%';

# 두번째 글자가 `디'인 데이터 검색
SELECT *
FROM TEST
WHERE NAME LIKE '_디%';
```

<br><br>
> ### 출처
- http://www.tcpschool.com/mysql/mysql_operator_patternMatching
- https://blog.naver.com/PostView.naver?blogId=c6369&logNo=220731189128
- https://bramhyun.tistory.com/16
- https://bactoria.tistory.com/22
