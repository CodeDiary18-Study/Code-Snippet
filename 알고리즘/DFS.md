# DFS(Depth First Search)
- ```깊이 우선 탐색```
- 그래프에서 깊은 부분(자식들)을 우선적으로 탐색하는 방식
- ```스택``` 자료형을 사용하거나 ```재귀 함수```를 사용해 구현  
  <img src="https://user-images.githubusercontent.com/74449232/167086464-da9f8870-fdd0-49ed-bb04-bd44431eb3af.png" width=550>

<br><br>

> ### 스택 활용
- **기본**
  ```python
  def dfs(graph, start):
      visited, stack = list(), list()
      stack.append(start)
      while stack:
          node = stack.pop()
          if node not in visited:
              visited.append(node)
              stack.extend(graph[node]) # 방문했든 안 했든 연결된 노드 모두 추가
      return visited
  ```
  <br>
  
- **deque 활용**
  ```python
  from collections import deque
  
  def dfs(graph, start):
    visited, stack = list(), deque([start])
    while stack:
        node = stack.pop()
        if node not in visited:
            visited.append(node)
            stack.extend(graph[node])
    return visited
  ```

<br><br>

> ### 재귀 활용
- **기본**
  ```python
  def dfs(graph, v, visited, result):
      visited[v] = True
      result.append(v)

      for i in graph[v]:
          if not visited[i]:
              dfs(graph, i, visited, result)
      return result
  ```
  <br>
  
- **깊이(depth)까지 구하기**
  ```python
  def dfs(graph, v, depth, visited, result):
      visited[v] = True
      result.append((v, depth))

      for i in graph[v]:
          if not visited[i]:
              dfs(graph, i, depth + 1, visited, result)
      return result
  ```
<br><br>

**※ 참고 ※** : DFS를 스택과 재귀로 구현한 방식의 결과는 각각 다름
