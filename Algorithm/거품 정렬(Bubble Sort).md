# 거품 정렬(Bubble Sort)
- 두 인접한 데이터를 비교해서, 앞에 있는 데이터가 뒤에 있는 데이터보다 크면, 자리를 바꾸는 정렬 알고리즘
- 정렬 과정
  1. 1회전에 첫번째 원소와 두번째 원소를 비교, 두번째 원소와 세번째 원소를 비교, ... (마지막-1)번째 원소와 마지막 원소의 대소를 비교하며 정렬
  2. 1회전을 수행하고 나면 가장 큰 원소가 맨 뒤로 이동  
     따라서 2회전에서는 맨 마지막 원소를 제외하고 1번 과정을 다시 수행하여 두번째로 큰 수를 맨 뒤에서 두번째로 정렬  
     정렬을 1회전씩 수행하다 보면 모든 수는 정렬됨

<br>

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
