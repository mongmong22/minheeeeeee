# [Java] 입출력방법 Scanner를 사용해서 입력받기

알고리즘 문제를 풀기 위해서 백준 사이트에 가입했다. “Hello world”를 겨우 겨우 출력했는데, 다음 문제부터 곧바로 막혔다. 입력은 도대체 어떻게 받아서 처리하는거지…..??

## Scanner

입력되는 값을 받아 토큰(공백, 줄바꿈, 탭)을 기준으로 값을 읽는다.

1. Scanner 클래스는 java.util 패키지에 포함되어 있어 먼저 import를 통해 호출해주어야한다.
   (이클립스에서 ctrl + shift + O 를 하면 필요한 클래스를 불러올 수 있다)

```java
import java.util.Scanner;
```

2. 객체의 생성 : Scanner클래스를 사용하는 객체 를 생성한다. 이름은 주로 sc, scan, in, input 등을 많이 사용한다. System.in은 사용자에게 입력을 받기 위한 것으로 괄호안에 써주어야한다.

```java
		Scanner sc = new Scanner(System.in);
```

3. 메서드를 사용하여 값을 읽어온다.

```java
		int T = sc.nextInt();
```

### 메서드

- **sc.next()** : String을 읽어온다
- **sc.nextLine()** : String을 줄단위로 읽어온다
- **sc.nextInt()** : int값을 읽어온다
- **sc.nextBoolean()** : boolean값을 읽어온다
- **sc.nextByte() / nextShort() / nextLong() / nextFloat() / nextDouble() :** 각 자료형에 해당하는 값을 읽어온다.
