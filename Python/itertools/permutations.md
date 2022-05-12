# permutations
> ### permutations(iterable, r=None)
- iterable에서 원소 개수가 r개인 **```순열```** 생성
- r을 지정하지 않으면 iterable을 모두 사용하여 순열을 생성
```python
from itertools import permutations

nums = [1, 3, 5]
for i in permutations(nums, 2):
    print(i)
# (1, 3)
# (1, 5)
# (3, 1)
# (3, 5)
# (5, 1)
# (5, 3)



for i in permutations(nums):
    print(i)
# (1, 3, 5)
# (1, 5, 3)
# (3, 1, 5)
# (3, 5, 1)
# (5, 1, 3)
# (5, 3, 1)
```
<br><br>
