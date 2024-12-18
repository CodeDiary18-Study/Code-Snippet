# Testing

## 성능 테스트(Performance Test)

- 특정 상황에서 시스템의 구성 요소가 어떻게 수행되는지 확인하기 위해 수행되는 테스트
- 성능 테스트를 통해 시스템의 자원의 사용량, 확장성, 신뢰성 등을 검증

  <img src="https://github.com/user-attachments/assets/10562168-eca9-4d28-9a93-09c405108c17" width=500>

<br><br>

### 성능 테스트의 종류

#### 부하 테스트(Load Test)

- 성능 테스트의 하위 집합으로 임계치 한계에 도달 할 때까지 시스템의 부하를 지속적으로 증가시켜 시스템을 테스트하는 것을 의미
- 부하 테스트는 유저의 수와 초당 API 요청 등을 증가시키며 시스템의 내구성을 테스트하고 결과를 모니터링하며 애플리케이션의 한계를 찾아내는 것을 목표로 함

<br>

#### 스트레스 테스트(Stress Test)

- 스트레스 테스트는 기존 자원에 초과 작업으로 과부하를 주는 다양한 활동을 수행하며 시스템을 무너졌을 때 어떤 동작을 보이는지 확인하는 테스트
- 시스템이 커버할 수 있는 대역폭 이상으로 과부하를 주며 과부하 상태일 때 모니터링 도구는 정상적으로 복구되는지, 시스템이 장애 조치를 하는지, 보안상의 문제가 발생하는지 등을 확인

<br><br>

## 참고

- [성능테스트, 부하테스트, 스트레스 테스트..무엇이 다를까?](https://seongwon.dev/ETC/20220919-%EC%84%B1%EB%8A%A5%ED%85%8C%EC%8A%A4%ED%8A%B8-%EB%B6%80%ED%95%98%ED%85%8C%EC%8A%A4%ED%8A%B8-%EC%8A%A4%ED%8A%B8%EB%A0%88%EC%8A%A4%ED%85%8C%EC%8A%A4%ED%8A%B8%EB%9E%80/)