# n진법
> ### n진법으로 표기된 string을 10진법 숫자로 변환
- for문 사용
  ```python
  num = '3212'
  base = 5

  answer = 0
  for idx, number in enumerate(num[::-1]):
      answer += int(number) * (base ** idx)
  ```  
  <br>
- int 함수 사용
  ```python
  num = '3212'
  base = 5
  answer = int(num, base)
  ```
