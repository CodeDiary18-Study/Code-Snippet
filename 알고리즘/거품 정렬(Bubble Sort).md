# 거품 정렬(Bubble Sort)
두 인접한 데이터를 비교해서, 앞에 있는 데이터가 뒤에 있는 데이터보다 크면, 자리를 바꾸는 정렬 알고리즘  
```python
def bubble_sort(arr):
    n = len(arr) - 1
    for i in range(n):
        for j in range(n - i):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
    return arr


print(bubble_sort([1, 9, 3, 2, 7]))
```  
<br><br>
### More Info : [CLICK ME](https://computer-science-student.tistory.com/355)
