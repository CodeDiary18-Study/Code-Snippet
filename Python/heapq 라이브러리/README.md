# heapq 라이브러리
heapq 모듈은 ```이진 트리(binary tree)``` 기반의 ```최소 힙(min heap)``` 자료구조를 제공  
다익스트라 최단 경로 알고리즘을 포함해 다양한 알고리즘에서 ```우선순위 큐``` 기능을 구현하고자 할 때 사용  
<br><br>

> ### 라이브러리 선언
```python
import heapq
```
<br><br>

> ### 힙에 원소 추가
```heqpq.heappush()``` 메서드를 사용
```python
h = []
heapq.heappush(h, 50)
heapq.heappush(h, 10)
heapq.heappush(h, 30)
```
<br><br>

> ### 힙에서 원소 제거
```heqpq.heappop()``` 메서드를 사용
```python
heapq.heappop(h)  # 10 반환
heapq.heappop(h)  # 30 반환
heapq.heappop(h)  # 50 반환
```
<br><br>

> ### 리스트 데이터를 한번에 heap 형태로 변환
```heapq.heapify()``` 메서드를 사용
```python
h = [50, 10, 30]
heapq.heapify(h)
```

