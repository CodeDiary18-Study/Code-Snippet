# Error & Exception
<img src="https://github.com/user-attachments/assets/206c07c2-8d30-4d43-9af1-bb0537097366" width="500px" />

- Java에서 실행 시(runtime) 발생할 수 있는 오류를 `에러(error)`와 `예외(exception)`로 구분

<br>

## Error
- 에러(error) : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
- 메모리 부족(OutOfMemoryError)이나 스택오버플로우(StackOverflowError)와 같이 일단 발생하면 복구할 수 없는 심각한 오류 → 예측 불가

<br>

## Exception
- 예외(exception) : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류
- 개발자가 구현한 프로그램 로직 상에 처리할 수 없는 입력이 주어지거나, 참조 정보가 잘못되어 정상적인 프로세스를 완료할 수 없는 상황에 발생
- 예외 처리(Error Handling) : 예외가 발생했을 때 프로그램이 비정상적으로 종료되는 것을 막고, 정상적인 실행 상태로 복구하는 것
  - 애플리케이션 로직에서는 Throwable이 아닌 Exception을 정확히 명시하여 예외 처리를 해야 개발자가 처리 가능한 Exception 하위 클래스 오류만 예외 처리

<br>

### Checked Exception & UnChecked Exception
- Checked Exception : 컴파일 시점에 확인되는 예외
  - 컴파일러가 예외 처리를 강제하는 예외
  - `Exception` 클래스를 상속받아 구현한 예외 클래스
  - 예외 발생시 rollback 되지 않고 트랜잭션이 커밋됨
  - 종류. IOException, SQLException ...
- UnChecked Exception : 컴파일 시점에 확인되지 않고 실행 시점에 확인되는 예외
  - `RuntimeException` 클래스를 상속받아 구현한 예외 클래스
  - 예외 발생시 rollback 함
  - 종류. NullPointerException, ArrayIndexOutOfBoundsException ...

<br><br>

### Reference
- [Java Checked Exception, Unchecked Exception](https://velog.io/@daydream/Java-Checked-Exception%EA%B3%BC-Unchecked-Exception)
- [자바 에러(Error) 와 예외 클래스(Exception) 💯 이해하기](https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EC%97%90%EB%9F%ACError-%EC%99%80-%EC%98%88%EC%99%B8-%ED%81%B4%EB%9E%98%EC%8A%A4Exception-%F0%9F%92%AF-%EC%B4%9D%EC%A0%95%EB%A6%AC)
