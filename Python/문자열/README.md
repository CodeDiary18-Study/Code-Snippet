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
  
