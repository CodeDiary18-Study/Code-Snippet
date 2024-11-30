# 계수 정렬(Counting Sort)
- 특정한 조건이 부합될 때만 사용할 수 있음
  - 데이터의 크기 범위가 제한된 경우
  - 데이터가 양의 정수인 경우
  - 가장 큰 데이터와 가장 작은 데이터의 차이가 100만을 넘지 않는 경우
- 데이터 수가 많더라도 중복된 값이 많이 분포돼있는 배열을 정렬할 때 효과적이고 빠른 정렬 알고리즘
- ```카운팅 정렬```이라고도 함
- 선택, 삽입, 퀵 정렬처럼 데이터를 비교하며 위치를 변경하는 **비교 기반의 정렬 알고리즘이 아님**

<br><br>

> ### 리스트 자료형(배열)을 활용
```python
def counting_sort(arr):
    max_arr = max(arr)
    count = [0] * (max_arr + 1)
    sorted_arr = list()
    
    for i in arr:	# 카운팅
        count[i] += 1

    for i in range(max_arr + 1):
        for _ in range(count[i]):
            sorted_arr.append(i)
    return sorted_arr
```
<br><br>

> ### 딕셔너리 자료형
```python
def counting_sort(arr):
    count = dict()
    sorted_arr = list()
    
    for i in arr:
        if i in count:
            count[i] += 1
        else:
            count[i] = 1

    for i in sorted(count.keys()):
        for _ in range(count[i]):
            sorted_arr.append(i)
    return sorted_arr
```
```python
# collections 모듈의 defaultdict를 활용한 버전
from collections import defaultdict


def counting_sort(arr):
    count = defaultdict(int)
    sorted_arr = list()
    
    for i in arr:
        count[i] += 1

    for i in sorted(count.keys()):
        for _ in range(count[i]):
            sorted_arr.append(i)
    return sorted_arr
```
<br><br>
### More Info : [CLICK ME](https://computer-science-student.tistory.com/587)
