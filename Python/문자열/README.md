# 문자열
파이썬 문자열 관련  
<br><br>  

## 문자 or 문자열이 어디있는지 찾기
- find 
  ```python
  문자열.find(찾을 문자)
  ```  
  찾는 문자가 처음 위치한 자리의 값을 반환하며, 찾는 문자가 없을 경우 -1을 출력  
  
  - example
    ```python
    'hello world'.find('h')
    # 0 반환
    'hello world'.find('x')
    # -1 반환
    ```  
  <br>
  
  > **참고**  
  > ```문자열```만 사용 가능  
  > 리스트, 튜플, 딕셔너리 자료형에서는 find 함수를 사용할 수 없음  
  > 만일 사용하게 되면 AttributeError 에러 발생  

  <br><br>
  
- index
  ```python
  문자열.index(찾을 문자)
  ```  
  찾는 문자가 처음 위치한 자리의 값을 반환하며, 찾는 문자가 없을 경우 ValueError 에러 발생  
  
  - example
    ```python
    'hello world'.index('h')
    # 0 반환
    'hello world'.index('x')
    # ValueError 에러가 발생
    ```  
  <br>
  
  > **참고**  
  > ```문자열, 리스트, 튜플``` 자료형에서 사용 가능  
  > 딕셔너리 자료형에서는 사용 불가
  > 만일 사용하게 되면 AttributeError 에러 발생

<br><br>
  
## 문자열 정렬
- ```ljust``` : 좌측정렬
- ```center``` : 가운데 정렬
- ```rjust``` : 우측 정렬
- example
  ```python
  '가나다라               ' # 좌측정렬
  '               가나다라' # 우측 정렬
  '       가나다라        ' # 가운데 정렬
  ```  
  - for문 사용하는 방법
    ```python
    ### 우측 정렬 예
    s = '가나다라'
    n = 7

    answer = ''
    for i in range(n-len(s)): # 문자열의 앞을 빈 문자열로 채우는 for 문
        answer += ' '
    answer += s
    ```  
  - ljust, center, rjust 사용
    ```python
    s = '가나다라'
    n = 7

    s.ljust(n) # 좌측 정렬
    s.center(n) # 가운데 정렬
    s.rjust(n) # 우측 정렬
    ```  
  <br><br>
  
