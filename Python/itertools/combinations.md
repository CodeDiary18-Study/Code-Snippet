# combinations
> ### combinations(iterable, r)
iterable에서 원소 개수가 r개인 **```조합```** 뽑기
```python
from itertools import combinations

nums = [1, 3, 5]
for i in combinations(nums, 2):
    print(i)

# (1, 3)
# (1, 5)
# (3, 5)
```
<br><br>

> ### combinations_with_replacement(iterable, r)
iterable에서 원소 개수가 r개인 **```중복 조합```** 뽑기
```python
from itertools import combinations_with_replacement

nums = [1, 3, 5]
for i in combinations_with_replacement(nums, 2):
    print(i)

# (1, 1)
# (1, 3)
# (1, 5)
# (3, 3)
# (3, 5)
# (5, 5)
```
