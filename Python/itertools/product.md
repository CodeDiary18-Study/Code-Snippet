# product
> ### product(iterable1, iterable2, ..., [repeat=1])
- **```중복 순열```** 및 **```곱집합```**
- 기본적으로 ```repeat``` 속성은 1

```python
from itertools import product

nums = [1, 3, 5]
print(list(product(nums)))
# [(1,), (3,), (5,)]

print(list(product(nums, repeat=2)))
# [(1, 1), (1, 3), (1, 5), (3, 1), (3, 3), (3, 5), (5, 1), (5, 3), (5, 5)]

chars = 'ABCD'
print(list(product(chars, repeat=3)))
# [('A', 'A', 'A'), ('A', 'A', 'B'), ('A', 'A', 'C'), ('A', 'A', 'D'),
#  ('A', 'B', 'A'), ('A', 'B', 'B'), ('A', 'B', 'C'), ('A', 'B', 'D'),
#  ('A', 'C', 'A'), ('A', 'C', 'B'), ('A', 'C', 'C'), ('A', 'C', 'D'),
#  ('A', 'D', 'A'), ('A', 'D', 'B'), ('A', 'D', 'C'), ('A', 'D', 'D'),
#  ('B', 'A', 'A'), ('B', 'A', 'B'), ('B', 'A', 'C'), ('B', 'A', 'D'),
#  ('B', 'B', 'A'), ('B', 'B', 'B'), ('B', 'B', 'C'), ('B', 'B', 'D'),
#  ('B', 'C', 'A'), ('B', 'C', 'B'), ('B', 'C', 'C'), ('B', 'C', 'D'),
#  ('B', 'D', 'A'), ('B', 'D', 'B'), ('B', 'D', 'C'), ('B', 'D', 'D'),
#  ('C', 'A', 'A'), ('C', 'A', 'B'), ('C', 'A', 'C'), ('C', 'A', 'D'),
#  ('C', 'B', 'A'), ('C', 'B', 'B'), ('C', 'B', 'C'), ('C', 'B', 'D'),
#  ('C', 'C', 'A'), ('C', 'C', 'B'), ('C', 'C', 'C'), ('C', 'C', 'D'),
#  ('C', 'D', 'A'), ('C', 'D', 'B'), ('C', 'D', 'C'), ('C', 'D', 'D'),
#  ('D', 'A', 'A'), ('D', 'A', 'B'), ('D', 'A', 'C'), ('D', 'A', 'D'),
#  ('D', 'B', 'A'), ('D', 'B', 'B'), ('D', 'B', 'C'), ('D', 'B', 'D'),
#  ('D', 'C', 'A'), ('D', 'C', 'B'), ('D', 'C', 'C'), ('D', 'C', 'D'),
#  ('D', 'D', 'A'), ('D', 'D', 'B'), ('D', 'D', 'C'), ('D', 'D', 'D')]
```
<br><br>

> ### 곱집합(Cartesian product)
- 곱집합이란? : [CLICK ME](https://www.scienceall.com/%EA%B3%B1%EC%A7%91%ED%95%A9product-set-2/)  
- **product 함수** 사용시
    ```python
    from itertools import product
    
    iterable1 = 'ABCD'
    iterable2 = 'xy'
    iterable3 = '1234'
    print(list(product(iterable1, iterable2, iterable3)))

    # 출력결과
    # [('A', 'x', '1'), ('A', 'x', '2'), ('A', 'x', '3'), ('A', 'x', '4'), 
    #  ('A', 'y', '1'), ('A', 'y', '2'), ('A', 'y', '3'), ('A', 'y', '4'), 
    #  ('B', 'x', '1'), ('B', 'x', '2'), ('B', 'x', '3'), ('B', 'x', '4'), 
    #  ('B', 'y', '1'), ('B', 'y', '2'), ('B', 'y', '3'), ('B', 'y', '4'), 
    #  ('C', 'x', '1'), ('C', 'x', '2'), ('C', 'x', '3'), ('C', 'x', '4'), 
    #  ('C', 'y', '1'), ('C', 'y', '2'), ('C', 'y', '3'), ('C', 'y', '4'), 
    #  ('D', 'x', '1'), ('D', 'x', '2'), ('D', 'x', '3'), ('D', 'x', '4'), 
    #  ('D', 'y', '1'), ('D', 'y', '2'), ('D', 'y', '3'), ('D', 'y', '4')]
    ```
- **for문**으로 구현시
    ```python
    iterable1 = 'ABCD'
    iterable2 = 'xy'
    iterable3 = '1234'
    cartesian = []
    for value1 in iterable1:
        for value2 in iterable2:
            for value3 in iterable3:
                cartesian.append((value1, value2, value3))
    print(cartesian)
    
    # 출력결과
    # [['A', 'x', '1'], ['A', 'x', '2'], ['A', 'x', '3'], ['A', 'x', '4'],
    #  ['A', 'y', '1'], ['A', 'y', '2'], ['A', 'y', '3'], ['A', 'y', '4'],
    #  ['B', 'x', '1'], ['B', 'x', '2'], ['B', 'x', '3'], ['B', 'x', '4'],
    #  ['B', 'y', '1'], ['B', 'y', '2'], ['B', 'y', '3'], ['B', 'y', '4'],
    #  ['C', 'x', '1'], ['C', 'x', '2'], ['C', 'x', '3'], ['C', 'x', '4'],
    #  ['C', 'y', '1'], ['C', 'y', '2'], ['C', 'y', '3'], ['C', 'y', '4'],
    #  ['D', 'x', '1'], ['D', 'x', '2'], ['D', 'x', '3'], ['D', 'x', '4'],
    #  ['D', 'y', '1'], ['D', 'y', '2'], ['D', 'y', '3'], ['D', 'y', '4']]
    ```  
