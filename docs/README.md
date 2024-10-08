# sailor-moon TDD study 2주차
## java-baseball-6 기능 목록
1. 랜덤으로 1~9로만 이루어진 서로 다른 세 자리 숫자를 생성한다.
   1. 랜덤값은 ``camp.nextstep.edu.missionutils.Randoms``의 ``pickNumberInRange()``를 활용한다.
2. 사용자가 입력한 값이 1~9로만 이루어진 서로 다른 세 자리의 숫자인지 검증한다.
   1. 사용자의 입력 값은 ``camp.nextstep.edu.missionutils.Console``의 ``readLine()``을 활용한다.
3. 랜덤으로 생성된 세 자리 숫자와 사용자가 입력한 세 자리 숫자를 비교한다.
   1. 같은 자리, 같은 숫자일 때 : 스트라이크
   2. 다른 자리, 같은 숫자일 때 : 볼
   3. 다른 자리, 다른 숫자일 때 : 낫싱
4. 비교한 결과값을 사용자에게 출력한다.
5. 사용자가 3스트라이크를 맞출 때까지 게임은 진행된다.
   1. 사용자가 3스트라이크를 맞췄다면 '3개의 숫자를 모두 맞췄습니다! 게임 종료' 메시지를 출력한 후 종료한다.
   2. 게임 종료 후 '게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.'를 출력하여 재진행/종료 중 사용자가 선택하도록 한다.
6. 사용자의 입력값이 1~9로만 이루어진 서로 다른 세 자리의 숫자가 아니거나, 게임 재진행/종료를 위한 1 또는 2가 아닌 경우 ``IllegalArgumentException``을 발생시킨 후 게임을 종료시킨다.
   1. 프로그램 종료 시 ``System.exit()``은 호출하지 않는다.

## 테스트 목록
1. 컴퓨터 랜덤 숫자 테스트 [✔]
   1. 세 자리 숫자인지 확인한다. [✔]
   2. 각 자리의 숫자가 1~9 사이인지 확인한다. [✔]
   3. 각 자리의 숫자가 중복되지 않는지 확인한다. [✔]
2. 사용자 입력 숫자 테스트 [✔]
   1. 세 자리 숫자 [✔]
      - 세 자리 숫자인지 확인한다. [✔]
      - 각 자리의 숫자가 1~9 사이인지 확인한다. [✔]
      - 각 자리의 숫자가 중복되지 않는지 확인한다. [✔]
   2. 게임 재진행 / 종료 숫자 [✔]
      - 1 또는 2인지 확인한다. [✔]
   3. 입력값이 요구와 다르다면 예외 처리하는지 확인한다. [✔]
3. 비교 테스트 [✔]
   1. 3스트라이크, 2스트라이크, 1스트라이크 [✔]
   2. 2볼 1스트라이크, 1볼 1스트라이크 [✔]
   3. 3볼, 2볼, 1볼 [✔]
   4. 낫싱 [✔]