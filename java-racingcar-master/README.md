# 🚀 자동차 경주 게임
## 기능 요구사항
[3단계]

- 초간단 자동차 경주 게임을 구현한다.
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0 에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우이다.
- 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.

<br>

[4단계]
- 각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
- 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분한다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다, 우승자는 한명 이상일 수 있다.

<br>

#### 실행 결과 (3단계 + 4단계)
- 위 요구사항에 따라 3대의 자동차가 5번 움직였을 경우 프로그램을 실행한 결과는 다음과 같다.
```
경주할 자동차 이름을 입력하세요 (이름은 (,)를 기준으로 구분)
pobi,crong,honux

시도할 회수는 몇 회 인가요?
5

실행결과
pobi : -
crong : -
honux : -

pobi : --
crong : -
honux : --


pobi : ---
crong : --
honux : ---

pobi : ----
crong : ---
honux : -----

pobi : -----
crong : ----
honux : ------

pobi, honux 가 최종 우승했습니다.

```

#### 힌트
- 값을 입력 받는 API 는 Scanner 를 이용한다.

```
Scanner scanner = new Scanner(System.in);
String value = scanner.nextLine();
int number = scanner.nextInt();
```
- 랜덤 값은 자바 java.util.Random 클래스의 nextInt(10) 메소드를 활용한다.


<br>

## 프로그래밍 요구사항
- indent(들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용
  - 예를들어 while 문 안에 if문이 있으면 들여쓰기는 2이다.
  - 힌트 : indent depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
- 함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.
  - 함수가 한가지 일만 잘 하도록 구현한다.
- 모든 로직에 단위 테스트를 구현한다. 단 UI(System.out.System.in) 로직은 제외
  - 핵심 로직을 구현하는 코드와 UI 를 담당하는 로직을 구분한다.
  - UI 로직을 ui.InputView, ui.ResultView 와 같은 클래스를 추가해 분리한다.
- 자바 코드 컨벤션을 지키면서 프로그래밍 한다.
  - 이 과정의 Code Style 은 Intellij idea Code Style Java 를 따른다.
  - Intellij idea Code Style Java 를 따르려면 code formatting 단축키 (Windows : Ctrl + Alt + L, Mac : (Option) + (Command) + L) 를 사용한다.
- else 예약어를 쓰지 않는다.
  - 힌트 : if 조건절에서 값을 return 하는 방식으로 구현하면 else를 사용하지 않아도 된다.
  - switch/case 도 허용하지 않는다.

<br>

## 기능 목록 및 commit 로그 요그사항
- 기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리해 추가한다.
- git의 commit 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위로 추가한다.

### AngularJs Commit Message Conventions 중
- commit message 종류를 다음과 같이 구분
```
feat (feature)
fix (bug fix)
docs (dcoumentaion)
style (formatting, missing semi colons, ..)
refactor
test
chor(maintain)
```