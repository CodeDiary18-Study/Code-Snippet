# 곱집합(Cartesian product)
> ### 곱집합이란? : [CLICK ME](https://www.scienceall.com/%EA%B3%B1%EC%A7%91%ED%95%A9product-set-2/)  
<br><br>

> ### for문
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
```  
```python
# 출력결과
[['A', 'x', '1'], ['A', 'x', '2'], ['A', 'x', '3'], ['A', 'x', '4'], 
 ['A', 'y', '1'], ['A', 'y', '2'], ['A', 'y', '3'], ['A', 'y', '4'], 
 ['B', 'x', '1'], ['B', 'x', '2'], ['B', 'x', '3'], ['B', 'x', '4'],
 ['B', 'y', '1'], ['B', 'y', '2'], ['B', 'y', '3'], ['B', 'y', '4'],
 ['C', 'x', '1'], ['C', 'x', '2'], ['C', 'x', '3'], ['C', 'x', '4'],
 ['C', 'y', '1'], ['C', 'y', '2'], ['C', 'y', '3'], ['C', 'y', '4'],
 ['D', 'x', '1'], ['D', 'x', '2'], ['D', 'x', '3'], ['D', 'x', '4'],
 ['D', 'y', '1'], ['D', 'y', '2'], ['D', 'y', '3'], ['D', 'y', '4']]

```  
<br><br>

> ### itertools.product 사용
```python
import itertools

iterable1 = 'ABCD'
iterable2 = 'xy'
iterable3 = '1234'
print(list(itertools.product(iterable1, iterable2, iterable3)))
```  
```python
# 출력결과
[('A', 'x', '1'), ('A', 'x', '2'), ('A', 'x', '3'), ('A', 'x', '4'), 
 ('A', 'y', '1'), ('A', 'y', '2'), ('A', 'y', '3'), ('A', 'y', '4'), 
 ('B', 'x', '1'), ('B', 'x', '2'), ('B', 'x', '3'), ('B', 'x', '4'), 
 ('B', 'y', '1'), ('B', 'y', '2'), ('B', 'y', '3'), ('B', 'y', '4'), 
 ('C', 'x', '1'), ('C', 'x', '2'), ('C', 'x', '3'), ('C', 'x', '4'), 
 ('C', 'y', '1'), ('C', 'y', '2'), ('C', 'y', '3'), ('C', 'y', '4'), 
 ('D', 'x', '1'), ('D', 'x', '2'), ('D', 'x', '3'), ('D', 'x', '4'), 
 ('D', 'y', '1'), ('D', 'y', '2'), ('D', 'y', '3'), ('D', 'y', '4')]
```
