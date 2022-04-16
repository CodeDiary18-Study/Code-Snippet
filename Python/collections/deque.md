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
- maxlen 옵션 : 최대 길이 제한
  ```python
  deq = collections.deque([1, 2, 3], maxlen=2) # deque([2, 3], maxlen=2)
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
- ```extend()``` : deque의 끝에 데이터들을 추가 - list의 extend 기능과 같음
  ```python
  import collections

  deq = collections.deque([1, 2, 3])  # deque([1, 2, 3])
  deq.extend([4, 5])  # deque([1, 2, 3, 4, 5])
  ```
- ```extendleft()``` : deque의 앞에 데이터들을 추가
  ```python
  import collections

  deq = collections.deque([1, 2, 3])  # deque([1, 2, 3])
  deq.extendleft([0, -1])  # deque([-1, 0, 1, 2, 3, 4, 5])

<br><br>

> ### 데이터 제거 및 반환
- ```pop()``` : deque의 끝에 데이터 하나를 가져와서 반환 후, deque에서 삭제(만일, deque의 아무 데이터도 없다면 IndexError 일으킴)
  ```python
  import collections
  
  deq = collections.deque([1, 2, 3])  # deque([1, 2, 3])
  deq_pop = deq.pop()  # 3
  # deque([1, 2])
  ```
- ```popleft()``` : deque의 앞에 데이터 하나를 가져와서 반환 후, deque에서 삭제
  ```python
  import collections
  
  deq = collections.deque([1, 2, 3])  # deque([1, 2, 3])
  deq_popleft = deq.popleft()  # 1
  # deque([2, 3])
  ```
- ```clear()``` : deque의 모든 값들을 삭제
  ```python
  import collections
  
  deq = collections.deque([1, 2, 3])  # deque([1, 2, 3])
  deq.clear() # deque([])
  ```

<br><br>

> ### 데이터 위치 변경
- ```reverse()``` : 데이터를 뒤집어 버림
  ```python
  import collections
  
  deq = collections.deque([1, 2, 3])  # deque([1, 2, 3])
  deq.reverse() # deque([3, 2, 1])
  ```
- ```rotate()``` :  
  입력한 수 만큼 deque의 값들을 (오른쪽으로) 이동. 입력한 수가 음수라면 왼쪽으로 이동  
  ![image](https://user-images.githubusercontent.com/74449232/163684103-e57ad326-ca64-4bac-9bc0-eb32f6570bb3.png)  
  ```python
  import collections
  
  # 양수
  deq1 = collections.deque([1, 2, 3, 4, 5, 6])  # deque([1, 2, 3, 4, 5, 6])
  deq1.rotate(2)  # deque([5, 6, 1, 2, 3, 4])
  deq1.rotate(2)  # deque([3, 4, 5, 6, 1, 2])
  
  # 음수
  deq2 = collections.deque([1, 2, 3, 4, 5, 6])  # deque([1, 2, 3, 4, 5, 6])
  deq2.rotate(-2)  # deque([3, 4, 5, 6, 1, 2])
  deq2.rotate(-2)  # deque([5, 6, 1, 2, 3, 4])
  ```

<br><br>

> ### 데이터 세기
- ```count()``` : 입력한 값이 deque에 포함된 개수를 반환
  ```python
  import collections
  
  deq = collections.deque([1, 2, 3, 3, 5, 6])
  deq.count(3)  # 2
  deq.count(4)  # 0
  ```

