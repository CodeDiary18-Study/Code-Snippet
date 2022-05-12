# 다익스트라(Dijkstra)
- 다이나믹 프로그래밍을 활용한 대표적인 ```최단 경로 탐색``` 알고리즘
- 특정한 노드에서 출발해 연결되어 있는 다른 모든 노드로 가는 ```최단 경로```를 구하기 위한 알고리즘
- 0보다 작은 값을 가지는 음의 간선이 없어야 정상적으로 동작
- 보통 ```우선 순위 큐```를 구현하기 위해 사용되는 ```heapq``` 라이브러리를 활용해서 구현
- GPS 소프트웨어의 기본 알고리즘으로 채택

<br><br>

> ### heapq 활용
```python
import heapq
from collections import defaultdict


def dijkstra(graph, start):
    distance = defaultdict(lambda: int(1e9))
    distance[start] = 0
    h = []
    heapq.heappush(h, (distance[start], start))

    while h:
        now_dist, now_node = heapq.heappop(h)  # dist : 거리, node : 노드

        if distance[now_node] < now_dist:  # 기존 거리 보다 멀다면 고려할 필요 없음
            continue
        
        for next_node, next_dist in graph[now_node].items():
            cost = distance[now_node] + next_dist
            if cost < distance[next_node]:
                distance[next_node] = cost
                heapq.heappush(h, (cost, next_node))

    return dict(distance)
```
```python
# 예시 데이터
data = {
    'A': {'B': 8, 'C': 1, 'D': 2},
    'B': {},
    'C': {'B': 5, 'D': 2},
    'D': {'E': 3, 'F': 5},
    'E': {'F': 1},
    'F': {'A': 5}
}

print(dijkstra(data, 'A'))  # {'A': 0, 'B': 6, 'C': 1, 'D': 2, 'E': 5, 'F': 6}
```
