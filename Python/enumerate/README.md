# enumerate
- enumerate 함수는 순서가 있는 자료형(list, set, tuple, dictionary, string)을 입력으로 받아  
  인덱스 값을 포함하는 enumerate 객체를 돌려줌
- for문과 함께 사용하면 자료형의 현재 순서(index)와 그 값을 쉽게 알 수 있음

<br><br>

> ### for문에서 enumerate 사용하기
```python
for idx, ch in enumerate(['가', '나', '다']):
    print(idx, ch)

# 0 가
# 1 나
# 2 다
```
<br><br>

> ### enumerate의 시작 인덱스 값 변경
start 옵션을 사용하면 됨
```python
for idx, ch in enumerate(['가', '나', '다'], start=1):
    print(idx, ch)

# 1 가
# 2 나
# 3 다
```
<br><br><br>

---
### More Info : [CLICK ME](https://computer-science-student.tistory.com/583)
