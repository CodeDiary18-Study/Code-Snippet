# 리스트(List)
> ### 데이터 삽입
- append(값)  
  - 기존 리스트에 값을 추가하는 함수
  - 추가되는 값은 기존 리스트의 마지막 위치에 삽입됨
  - example
    ```python
    L = []
    L.append(1)   # L = [1]
    L.append(2)   # L = [1, 2]
    L.append(3)   # L = [1, 2, 3]
    print(L)
    ```  
  <br>
- insert(인덱스, 값)
  - 리스트의 특정 위치의 인덱스를 지정하여 값을 삽입하는 함수
  - 추가된 값은 지정한 인덱스에 위치하고 기존의 값은 뒤로 밀림
  - 만일, 인덱스에 해당하는 값이 리스트의 길이보다 크다면 제일 마지막에 데이터가 삽입됨
  - example
    ```python
    L = [1, 3, 4, 5, 6]
    L.insert(1, 2)  # L = [1, 2, 3]
    L.insert(999, 8)  # L = [1, 2, 3, 4, 5, 6, 8]
    L.insert(-2, 7)  # L = [1, 2, 3, 4, 5, 6, 7, 8]
    ```  
  <br>
- extend(추가할 리스트)
  - 리스트에 다른 리스트 값을 추가하는 함수
  - 추가된 리스트는 기존 리스트의 마지막에 위치함
  - example
    ```python
    L = [1, 3, 5]
    L.extend([2, 4, 6])   # L = [1, 3, 5, 2, 4, 6]
    ```
  
<br><br>

> ### 2차원 리스트를 1차원 리스트로 만들기
- for문 사용
  ```python
  my_list = [[1, 2], [3, 4], [5, 6]]
  answer = []
  for element in my_list:
      answer += element
  ```  
- 그 외 방법
  ```python
  my_list = [[1, 2], [3, 4], [5, 6]]

  # 방법 1 - sum 함수
  answer = sum(my_list, [])

  # 방법 2 - itertools.chain
  import itertools
  list(itertools.chain.from_iterable(my_list))

  # 방법 3 - itertools와 unpacking
  import itertools
  list(itertools.chain(*my_list))

  # 방법 4 - list comprehension 이용
  [element for array in my_list for element in array]

  # 방법 5 - reduce 함수 이용 1
  from functools import reduce
  list(reduce(lambda x, y: x+y, my_list))

  # 방법 6 - reduce 함수 이용 2
  from functools import reduce
  import operator
  list(reduce(operator.add, my_list))
  ```

