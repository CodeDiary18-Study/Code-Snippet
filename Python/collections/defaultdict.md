# defaultdict
- defaultdict는 dict 타입의 값에 ```기본 값을 지정```할 수 있는 딕셔너리 클래스
- 딕셔너리(dict)에 존재하지 않는 키를 조회할 경우 발생하는 ```KeyError``` Exception이 발생하지 않음
- 존재하지 않은 값을 호출하면 기본값을 호출한 후 defaultdict자료형 변수에 해당 값이 기본값으로 설정되어 들어감

<br><br>

> ### 자료형으로 기본 값 설정
```int(정수), float(실수), bool(불), str(문자열), list(리스트), tuple(튜플), set(집합)...``` 등의 자료형으로 초기화  
```python
import collections

d1 = collections.defaultdict(int)  # int 자료형
d2 = collections.defaultdict(list)  # 리스트 자료형
d3 = collections.defaultdict(set)  # 집합 자료형
d4 = collections.defaultdict(bool)  # bool 자료형

# 데이터를 넣지 않았던 key 조회
print(d1[1])        # 0
print(d2['two'])    # []
print(d3[3])        # set()
print(d4['four'])   # False


# 데이터 넣기
d1['one'] = 1
d2[2].append('two')
d3['three'].add(3)
d4[4] = True

print(d1)  # defaultdict(<class 'int'>, {1: 0, 'one': 1})
print(d2)  # defaultdict(<class 'list'>, {'two': [], 2: ['two']})
print(d3)  # defaultdict(<class 'set'>, {3: set(), 'three': {3}})
print(d4)  # defaultdict(<class 'bool'>, {'four': False, 4: True})
```
<br><br>

> ### lambda로 기본 값 설정
```python
import collections

d1 = collections.defaultdict(lambda: 1)
d2 = collections.defaultdict(lambda: 'default value!')
d3 = collections.defaultdict(lambda: ['a'])

# 데이터를 넣지 않았던 key 조회
print(d1[1])      # 1
print(d2['two'])  # default value!
print(d3[3])      # ['a']


# 데이터 넣기
d1['one'] = 1
d2[2] = 'two'
d3[3].append('b')

print(d1)  # defaultdict(<function <lambda> at 0x000001F1DC8C7820>, {1: 1, 'one': 1})
print(d2)  # defaultdict(<function <lambda> at 0x000001F1DC8EE310>, {'two': 'default value!', 2: 'two'})
print(d3)  # defaultdict(<function <lambda> at 0x000001F1DC9B0700>, {3: ['a', 'b']})
```
