# 병합 정렬(Merge Sort)
- **합병 정렬**이라고도 하며, ```분할 정복``` 알고리즘의 하나
- 불안정 정렬인 퀵 정렬과 달리, 병합 정렬은 **안정 정렬**에 속함
- 전체 데이터를 가장 작은 단위로 분할한 후 분할한 데이터를 다시 병합하면서 정렬
```python
def merge_sort(arr):
    if len(arr) <= 1:  # 더이상 분할 불가
        return arr
    
    mid = len(arr) // 2
    
    # 재귀 호출로 분할 : Divide
    left = merge_sort(arr[:mid])
    right = merge_sort(arr[mid:])

    return merge(left, right)


def merge(left, right):
    sorted_list = []
    i, j = 0, 0
    
    # 나눠진 두 배열을 정렬 : Conquer
    while i < len(left) and j < len(right):
        if left[i] <= right[j]:
            sorted_list.append(left[i])
            i += 1
        else:
            sorted_list.append(right[j])
            j += 1
    
    # 비교후 남아있는 값 병합 : Merge
    sorted_list.extend(left[i:])
    sorted_list.extend(right[j:])
    
    return sorted_list
```  
or
```python
def merge_sort(arr):
    if len(arr) <= 1:  # 더이상 분할 불가
        return arr
    mid = len(arr) // 2

    left = merge_sort(arr[:mid])
    right = merge_sort(arr[mid:])

    return merge(left, right)


def merge(left, right):
    sorted_list = []
    while 0 < len(left) and 0 < len(right):
        if left[0] <= right[0]:
            sorted_list.append(left.pop(0))
        else:
            sorted_list.append(right.pop(0))

    sorted_list.extend(left + right)

    return sorted_list
```  
or  
```python
def merge_sort(arr):
    if len(arr) <= 1:
        return arr
    mid = len(arr) // 2

    left = merge_sort(arr[:mid])
    right = merge_sort(arr[mid:])

    sorted_list = []
    while 0 < len(left) and 0 < len(right):
        if left[0] <= right[0]:
            sorted_list.append(left.pop(0))
        else:
            sorted_list.append(right.pop(0))

    sorted_list.extend(left + right)

    return sorted_list
```
<br><br>
### More Info : [CLICK ME](https://computer-science-student.tistory.com/564)
