# 리스트(List)
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

