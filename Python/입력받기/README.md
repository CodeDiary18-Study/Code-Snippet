# 입력받기
## 기본
```python
# 기본
name = input()
n = int(input())
a,b = map(int, input().split())
arr = list(map(int,input().split()))
```  
<br><br>

## 빠른 입력
```python
# 빠른 입력
import sys
sys_arr = list(map(int,sys.stdin.readline().strip().split()))

# or
import sys
input = sys.stdin.readline
for _ in range(10000):
  n = input()
```  
<br><br>

## n줄 입력 받아 2차원 배열에 저장
- for문으로 저장
  ```python
  import sys
  data = []
  n = int(input())
  for i in range(n):
    data.append(list(map(int,sys.stdin.readline().split())))
  ```  
- 리스트 컴프리헨션을 이용해 저장
  ```python
  import sys
  n = int(input())
  data = [list(map(int, sys.stdin.readline().split())) for i in range(n)]
  
  # or
  data = [list(map(int, sys.stdin.readline().split())) for i in range(int(input()))]
  ```    
<br><br>
<hr>  

### More Info : [CLICK ME](https://covenant.tistory.com/141)
