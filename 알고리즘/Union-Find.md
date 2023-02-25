# Union-Find
- 합집합 찾기 알고리즘

<br>

```python
def find_parent(parent, x):  # 특정 원소가 속한 집합 찾기
    if parent[x] != x:  # 루트 노드가 아니라면, 루트 노드를 찾을 때까지 재귀적으로 호출
        parent[x] = find_parent(parent, parent[x])
    return parent[x]


def union(parent, a, b):  # 두 원소가 속한 집합 합치기
    a = find_parent(parent, a)
    b = find_parent(parent, b)

    if a < b:
        parent[b] = a
    else:
        parent[a] = b


# example
N = 7
parent = [i for i in range(N)]  # 부모 테이블 초기화

union(parent, 1, 2)
union(parent, 2, 3)
union(parent, 4, 5)
union(parent, 5, 6)

print('1과 3은 연결되어 있나요?', find_parent(parent, 1) == find_parent(parent, 3))  # True
print('1과 5는 연결되어 있나요?', find_parent(parent, 1) == find_parent(parent, 5))  # False
print('1과 6은 연결되어 있나요?', find_parent(parent, 1) == find_parent(parent, 6))  # False
```
