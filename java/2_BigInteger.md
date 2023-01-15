# [Java] BigInteger 무한한 크기의 정수

백준 1271번 : 엄청난 부자2

[1271번: 엄청난 부자2](https://www.acmicpc.net/problem/1271)

[solve.ac](http://solve.ac) 사이트를 통해 난이도 낮은 것 부터 쭉쭉 풀어다가고 있었다. 그러다 찾아온 위기... 런타임에러가 계속 나서 찾아보니 수의 범위가 너무 큰 것이 문제였다.
| 자료형 | 표현범위 |
| --- | --- |
| int | -2147483648 ~ 2147483647 |
| long | -9223372036854775808 ~ 9223372036854775807 |

long으로만 해도 웬만한 수는 다 다룰 수 있지만 10의 1000승 이라는 수는 그 범위를 초과하기 때문에 더 큰 수를 표현하는 방법이 필요하다. 이렇게 거의 무한에 가까운 수를 표현할 때 BigInteger릏 사용할 수 있다.

## BigInteger

무한한 수에 가까운 매우 큰 정수를 문자열로 처리하여 아무리 큰 수라도 담을 수 있다.

1. BigInteger 클래스는 java.math 패키지에 포함되어 있다.

```java
import java.util.BigInteger;
```

1. 객체의 생성 : BigInteger을 초기화 하기 위해서는 문자열 값을 넘겨주어야 한다.

```java
		BigInteger bigNum = new BigInteger("22");
		BigInteger bigNum2 = new BigInteger("32");
```

1. 문자열이기 때문에 Int형처럼 계산할 수 없고, 메서드를 사용하여 연산을 처리한다.

```java
		 System.out.println(bigNum.add(bigNum2);
```

### 메서드

- **bigNum.add(bigNum2)** : 더하기 +
- **bigNum.subtract(bigNum2)** : 빼기 -
- **bigNum.multiply(bigNum2)** : 곱하기 \*
- **bigNum.divide(bigNum2)** : 나누기 /
- **bigNum.remainder(bigNum2)** : 나머지 %
- **bigNum.compaewTo()** : 두 개의 수를 비교해서 크면 1, 더 작으면 -1, 같으면 0을 리턴한다.

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigInteger n = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();

		sc.close();

		System.out.println(n.divide(m));
		System.out.println(n.remainder(m));

	}

}
```
