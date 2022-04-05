# 이진 탐색(Binary Search)
- 정렬된 리스트에 적용할 수 있는 간단한 ```고속 탐색 기법```이며 ```이분 탐색```이라고도 불림
- 정렬되어 있는 리스트에서 탐색 범위를 절반씩 좁혀가며 데이터를 탐색하는 알고리즘
- [업다운 게임](https://www.youtube.com/watch?v=0QKRZvQBAD8)과 같은 방식
<br>

> **재귀 함수**를 활용
```python
def binary_search(arr, search):  # 재귀 함수를 활용한 ver1
    n = len(arr)
    if n == 1:
        if arr[0] == search:
            return True
        else:
            return False
    if n == 0:
        return False

    mid = n // 2

    if arr[mid] == search:
        return True
    elif arr[mid] > search:  # 중간점의 값보다 찾고자 하는 값이 작은 경우
        return binary_search(arr[:mid], search)
    else:  # 중간점의 값보다 찾고자 하는 값이 큰 경우
        return binary_search(arr[mid + 1:], search)


arr = [3, 110, 8, 13, 2]
binary_search(sorted(arr), 7)  # False 반환
binary_search(sorted(arr), 13) # True 반환
```  
or  
```python
def binary_search(arr, search, start, end):  # 재귀 함수를 활용한 ver2
    if start > end:
        return False

    mid = (start + end) // 2
    if arr[mid] == search:
        return True
    elif arr[mid] > search:  # 중간점의 값보다 찾고자 하는 값이 작은 경우
        return binary_search(arr, search, start, mid - 1)
    else:  # 중간점의 값보다 찾고자 하는 값이 큰 경우
        return binary_search(arr, search, mid + 1, end)


arr = [3, 110, 8, 13, 2]
binary_search(sorted(arr), 7, 0, len(arr))  # False 반환
binary_search(sorted(arr), 13, 0, len(arr)) # True 반환
```  
<br><br>

> **반복문**을 활용
```python
def binary_search(arr, search):  # 반복문 활용한 ver1
    start, end = 0, len(arr) - 1

    while start <= end:
        mid = (start + end) // 2
        if arr[mid] == search:
            return True
        elif arr[mid] > search:  # 중간점의 값보다 찾고자 하는 값이 작은 경우
            end = mid - 1
        else:  # 중간점의 값보다 찾고자 하는 값이 큰 경우
            start = mid + 1
    return False


arr = [3, 110, 8, 13, 2]
binary_search(sorted(arr), 7)  # False 반환
binary_search(sorted(arr), 13) # True 반환
```  
or  
```python
def binary_search(arr, search, start, end):  # 반복문 활용한 ver2
    while start <= end:
        mid = (start + end) // 2
        if arr[mid] == search:
            return True
        elif arr[mid] > search:  # 중간점의 값보다 찾고자 하는 값이 작은 경우
            end = mid - 1
        else:  # 중간점의 값보다 찾고자 하는 값이 큰 경우
            start = mid + 1
    return False


arr = [3, 110, 8, 13, 2]
binary_search(sorted(arr), 7, 0, len(arr))  # False 반환
binary_search(sorted(arr), 13, 0, len(arr))  # True 반환
```  
<br>

**참고 : binary_search 함수의 반환값**
- True는 search에 해당하는 값이 존재하는 것을 의미
- False는 해당하는 값이 존재하지 않는 것을 의미



<br><br>
### More Info : [CLICK ME](https://computer-science-student.tistory.com/565)
