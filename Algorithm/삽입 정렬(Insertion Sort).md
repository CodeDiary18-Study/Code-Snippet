# 삽입 정렬(Insertion Sort)
- 손안의 카드를 정렬하는 방법과 유사
    - 새로운 카드를 기존의 정렬된 카드 사이에 올바른 위치에 삽입
- **모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여, 자신의 위치를 찾아 삽입**함으로써 정렬을 완성하는 정렬 알고리즘
```python
def insertion_sort(arr):
    n = len(arr)
    for i in range(1, n):
        for j in range(i, 0, -1):
            if arr[j - 1] > arr[j]:
                arr[j - 1], arr[j] = arr[j], arr[j - 1]
            else:
                break
    return arr
```  
or  
```python
def insertion_sort(arr):
    n = len(arr)
    for i in range(1, n):
        j = i
        while j > 0 and arr[j - 1] > arr[j]:
            arr[j - 1], arr[j] = arr[j], arr[j - 1]
            j -= 1
    return arr
```  
or  
```python
def insertion_sort(arr):
    n = len(arr)
    for i in range(1, n):
        j = i
        now = arr[i]
        while j > 0 and arr[j - 1] > now:
            arr[j] = arr[j - 1]
            j -= 1
        arr[j] = now
    return arr


print(insertion_sort([1, 9, 3, 2, 7]))
```

<br><br>
### More Info : [CLICK ME](https://computer-science-student.tistory.com/559)
