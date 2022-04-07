# 선형 탐색(Linear Search)
- **순차 탐색**이라고도 함
- 일렬로 된 자료를 **왼쪽부터 오른쪽으로 차례대로 탐색**하는 것
```python
def linear_search(arr, search):  # for문 사용
    for i in range(len(arr)):
        if arr[i] == search:
            return True
    return False


linear_search([3, 110, 8, 13, 2], 5)  # False 반환
linear_search([3, 110, 8, 13, 2], 13)  # True 반환
```   
or  
```python
def linear_search(arr, search):  # while문 사용
    i = 0
    while i < len(arr):
        if arr[i] == search:
            return True
        i += 1
    return False


linear_search([3, 110, 8, 13, 2], 5)    # False 반환
linear_search([3, 110, 8, 13, 2], 13)   # True 반환
```
<br><br>
### More Info : [CLICK ME](https://computer-science-student.tistory.com/570)
