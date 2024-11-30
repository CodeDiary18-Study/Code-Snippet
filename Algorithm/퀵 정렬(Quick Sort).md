# 퀵 정렬(Quick Sort)
- ```분할 정복``` 알고리즘의 하나로, 평균적으로 **매우 빠른 수행 속도**를 자랑하는 정렬 방법
  - 합병 정렬(Merge Sort)과 달리 퀵 정렬은 리스트를 **비균등하게 분할**
- **불안정 정렬**에 속하며, 다른 원소와의 비교만으로 정렬을 수행하는 **비교 정렬**에 속함
- 기준점(pivot, 피벗)을 정해서, 기준점보다 작은 데이터는 왼쪽(left)에, 큰 데이터는 오른쪽(right)으로 배치

```python
def quick_sort(arr):
    if len(arr) <= 1:  # 더이상 분할 불가
        return arr

    pivot = arr.pop(0)  # 기준(피벗)을 첫번째 데이터로 함
    left, right = [], []

    for data in arr:
        if pivot > data:
            left.append(data)
        else:
            right.append(data)
    
    return quick_sort(left) + [pivot] + quick_sort(right)
```  
or  
```python
def quick_sort(arr):
    if len(arr) <= 1:  # 더이상 분할 불가
        return arr

    pivot = arr[0]  # 기준(피벗)을 첫번째 데이터로 함

    left = [data for data in arr[1:] if pivot > data]
    right = [data for data in arr[1:] if pivot <= data]

    return quick_sort(left) + [pivot] + quick_sort(right)
```

<br><br>
### More Info : [CLICK ME](https://computer-science-student.tistory.com/563)
