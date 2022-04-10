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

<br><br>

> ### 10진법 숫자를 n진법으로 변환
- bin, oct, hex 함수 사용
  - ```bin()``` : 2진법
  - ```oct()``` : 8진법
  - ```hex()``` : 16진법
  - example
    ```python
    bin(10) # '0b1010'
    oct(10) # '0o12'
    hex(10) # '0xa'
    ```  
  <br>
- format 함수 사용
  - format(숫자, n진법 키워드)  
    n진법 키워드 : 'b'는 2진법, 'o'는 8진법, 'x' : 16진법
  - example
    ```python
    format(10,'b')  # '1010'
    format(10,'o')  # '12'
    format(10,'x')  # 'a'
    
    # 접두어 포함
    format(10,'#b')  # '0b1010'
    format(10,'#o')  # '0o12'
    format(10,'#x')  # '0xa'
    ```  
<br><br>
