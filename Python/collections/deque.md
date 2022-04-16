# deque
- deque는 double-ended queue의 줄임말
- deck(덱)으로 발음함
- 리스트 객체도 비슷한 작업들을 제공하지만, deque는 빠른 고정 길이 작업에 최적화됨
- 양방향(앞과 뒤에서)으로 데이터를 처리할 수 있는 queue형 자료구조를 의미  
  ![image](https://user-images.githubusercontent.com/74449232/163682353-dc0e7653-518a-4391-a674-fa0b4399ebaa.png)  

<br><br>

> ### deque 생성
```python
import collections

deq1 = collections.deque() # 빈 deque 생성
deq2 = collections.deque([1, 2, 5]) # 리스트 데이터
```
<br><br>

> ### 데이터 삽입
- ```append()``` : deque의 끝(오른쪽)에 데이터를 추가
  ```python
  import collections
  
  deq = collections.deque([1, 2, 3])  # deque([1, 2, 3])
  deq.append(4)  # deque([1, 2, 3, 4])
  ```
- ```appendleft()``` : deque의 앞(왼쪽)에 데이터를 추가
  ```python
  import collections
  
  deq = collections.deque([1, 2, 3])  # deque([1, 2, 3])
  deq.append(0)  # deque([0, 1, 2, 3])
  ```
- ```extend()``` : deque의 끝(오른쪽)에 데이터들을 추가 - list의 extend 기능과 같음
  ```python
  import collections

  deq = collections.deque([1, 2, 3])  # deque([1, 2, 3])
  deq.extend([4, 5])  # deque([1, 2, 3, 4, 5])
  ```
- ```extendleft()``` : deque의 앞(왼쪽)에 데이터들을 추가
  ```python
  import collections

  deq = collections.deque([1, 2, 3])  # deque([1, 2, 3])
  deq.extendleft([0, -1])  # deque([-1, 0, 1, 2, 3, 4, 5])

<br><br>

