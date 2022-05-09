# BFS(Breadth First Search)
- ```너비 우선 탐색```
- 가까운 노드부터 우선적으로 탐색하는 방식
- ```큐(Queue)``` 활용해서 구현
- 단순 검색 속도가 DFS보다 빠름  
  <img src="https://user-images.githubusercontent.com/74449232/167263417-0a649432-241d-4818-b7d0-cee336eb4fcb.png" width=350>

<br><br>

> ### 큐 활용
- **기본 1**  
  ```visited```에 방문한 노드들을 넣는 버전
  ```python
  from collections import deque
  
  def bfs(graph, start):
    visited, queue = list(), deque([start])
    while queue:
        node = queue.popleft()
        if node not in visited:
            visited.append(node)
            queue += graph[node]
    return visited
  ```  
  <br>
- **기본 2**  
  ```visited```를 방문 처리 용으로 사용하고 ```result```에 방문한 노드를 넣는 버전
  ```python
  from collections import deque, defaultdict
  
  def bfs(graph, start):
    result = list()
    visited, queue = defaultdict(bool), deque([start])
    while queue:
        node = queue.popleft()
        if not visited[node]:
            visited[node] = True
            result.append(node)
            queue += graph[node]
    return result
  ```  
  <br>
- **기본 3**
  ```python
  from collections import deque

  def bfs(graph, start):
      visited, queue = [start], deque([start])
      while queue:
          node = queue.popleft()
          for i in graph[node]:
              if i not in visited:
                  visited.append(i)
                  queue.append(i)
      return visited
  ```

<br><br>
-----
### More Info : [CLICK ME](https://computer-science-student.tistory.com/603)
