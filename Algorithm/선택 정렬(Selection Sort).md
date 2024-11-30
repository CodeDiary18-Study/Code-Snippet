# 선택 정렬(Selection Sort)
- 선택 정렬은 버블 정렬(Bubble Sort)과 유사한 알고리즘  
- 해당 순서에 원소를 넣을 위치는 이미 정해져 있고, 어떤 원소를 넣을지 선택하는 알고리즘
```python
def selection_sort(arr):
    n = len(arr)
    for i in range(n - 1):
        min_index = i
        for j in range(i + 1, n):
            if arr[j] < arr[min_index]:
                min_index = j
        arr[min_index], arr[i] = arr[i], arr[min_index]
    return arr


print(selection_sort([1, 9, 3, 2, 7]))
```  
<br><br>
### More Info : [CLICK ME](https://computer-science-student.tistory.com/385)
