# Counter
- 시퀀스 자료형의 데이터 요소 개수를 딕셔너리 형태로 반환하는 자료구조  
  → 리스트나 문자열과 같은 시퀀스 자료형 안의 요소 중 값이 같은 것이 몇 개 있는지 반환

<br><br>
> ### Counter()
문자열이나, 리스트의 요소를 카운팅하여 많은 순으로 딕셔너리형태로 리턴
```python
import collections

counter1 = collections.Counter("hello world")
# Counter({'l': 3, 'o': 2, 'h': 1, 'e': 1, ' ': 1, 'w': 1, 'r': 1, 'd': 1})

counter2 = collections.Counter([1, 5, 3, 5, 2, 1, 23, 5, 2])
# Counter({5: 3, 1: 2, 2: 2, 3: 1, 23: 1})
```
<br><br>

> ### update()
Counter의 값을 갱신
```python
import collections

counter = collections.Counter([100, 500, 300, 500, 100])  # Counter({100: 2, 500: 2, 300: 1})
counter.update([100, 200])
# Counter({100: 3, 500: 2, 300: 1, 200: 1})
```
<br><br>

> ### 데이터 접근과 수정
미등록 key에 접근한다고 해도 KeyError가 발생하지 않고 0을 반환
```python
import collections

counter = collections.Counter([1, 1, 2, 3, 1])  # Counter({1: 3, 2: 1, 3: 1})
counter[1]  # 3
counter[100]  # 0
counter[1] += 1
counter[1]  # 4
```

<br><br>
> ### most_common()
개수가 많은 순으로 정렬된 튜플 배열 리스트를 리턴  
괄호 속 숫자를 넣으면 상위 요소 몇개를 보여줄지 설정할 수 있음
```python
import collections

counter = collections.Counter([100, 500, 300, 500, 100])  # Counter({100: 2, 500: 2, 300: 1})
counter.most_common()  # [(100, 2), (500, 2), (300, 1),]

# or
collections.Counter([100, 500, 300, 500, 100]).most_common()  # [(100, 2), (500, 2), (300, 1)]

# ----
# 몇개 보여줄지 숫자를 넣어 설정
collections.Counter([100, 500, 300, 500, 100]).most_common(2)  # [(100, 2), (500, 2)]
```
<br><br>

> ### elements()
카운터 된 숫자만큼의 데이터를 리턴받을 수 있음
```python
import collections

counter = collections.Counter([1, 1, 2, 3, 1])  # Counter({1: 3, 2: 1, 3: 1})
print(list(counter.elements()))  # [1, 1, 1, 2, 3]

# 참고
print(list(counter))  # [1, 2, 3]
print(dict(counter))  # {1: 3, 2: 1, 3: 1}
```
<br><br>

> ### subtract()
요소를 빼는것을 의미하며 요소가 없는 경우는 음수의 값이 출력
```python
import collections

counter1 = collections.Counter("hello")  # Counter({'l': 2, 'h': 1, 'e': 1, 'o': 1})
counter2 = collections.Counter("halo")  # Counter({'h': 1, 'a': 1, 'l': 1, 'o': 1})

counter1.subtract(counter2)
# Counter({'e': 1, 'l': 1, 'h': 0, 'o': 0, 'a': -1})
```
<br><br>

> ### 산술/집합 연산
- 덧셈(+)
  ```python
  import collections

  counter1 = collections.Counter("hello")  # Counter({'l': 2, 'h': 1, 'e': 1, 'o': 1})
  counter2 = collections.Counter("halo")  # Counter({'h': 1, 'a': 1, 'l': 1, 'o': 1})

  counter1 + counter2  # Counter({'l': 3, 'h': 2, 'o': 2, 'e': 1, 'a': 1})
  ```
- 뺄셈(-)  
  subtract()함수와 달리 음수값은 출력하지 않음
  ```python
  import collections
  
  counter1 = collections.Counter("hello")  # Counter({'l': 2, 'h': 1, 'e': 1, 'o': 1})
  counter2 = collections.Counter("halo")  # Counter({'h': 1, 'a': 1, 'l': 1, 'o': 1})
  
  counter1 - counter2  # Counter({'e': 1, 'l': 1})
  ```
- 교집합(&)과 합집합(|)
  ```python
  import collections
  
  counter1 = collections.Counter("hello")  # Counter({'l': 2, 'h': 1, 'e': 1, 'o': 1})
  counter2 = collections.Counter("halo")  # Counter({'h': 1, 'a': 1, 'l': 1, 'o': 1})

  # 교집합
  counter1 & counter2  # Counter({'h': 1, 'l': 1, 'o': 1})

  # 합집합
  counter1 | counter2  # Counter({'l': 2, 'h': 1, 'e': 1, 'o': 1, 'a': 1})
  ```
