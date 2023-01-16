# 자료형\_기초

### 자료형(Data Type)

**기본 자료형(Primitive Type)**

boolean, char, byte, short, int, long, float, double 8가지 자료형으로 memory의 크기가 이미 정해져있다.

**참조 자료형(Reference Type)**

8가지 자료형 외 모든 것으로 주소값(참조값)을 가진다. 대표적으로 String 이 있다. 다른 장소에 값을 저장해두고 주소값을 변수에 저장하는 것이다.

### 형변환

**묵시적 형변환(Implicit Casting)**

범위가 큰 데이터 형에 좁은 데이터를 대입하는 경우 자동으로 형 변환이 적용된다. ex) int 안에 byte 값을 넣는 경우

**명시적 형변환(Explict Casting)**

범위가 좁은 데이터 형에 넓은 데이터 형을 대입하는 경우 (타입) 값 으로 형변환 연산자를 사용하여 강제로 변환해줘야한다.

### 연산자

**증감연산자**
++i : 전위형으로 먼저 값을 변화시키고 사용한다.(먼저 더함)
i++ : 후위형으로 먼저 변수값을 사용하고 그 다음 값을 변화시킨다.(나중에 더함)

```java
package arabiannight.tistory.com.java.test;

public class TestFor {
	public static void main(String[] args) {

		int i = 1;

		System.out.println(++i); // 먼저 +  ++i = 2
		System.out.println(i++); // 나중 +  i++ = 2

		System.out.println(i--); // 나중 -  i-- = 3
		System.out.println(--i); // 먼저 -  --i = 1

	}
}
```

**부정 연산자**
! : 논리 부정 연산자로 !true == false / !false == true이다.
~ : 비트 부정 연산자로 ~0 == 1 / ~1 == 0 이다.

**논리연산자** : and(&&), or(||), not(!) true/false 값을 리턴한다.

\***\*단락 평가(SCE : Short Circuit Evaluation)\*\***
논리 연산자 && 혹은 ||를 포함한 연산 결과 True/False에서 앞의 연산을 통해서 뒤의 연산 결과 전에 판단을 완료하는 것을 말한다.
→ A && B 일때 둘 다 참인지를 판단해야하기 때문에 A가 거짓이면 뒤를 확인하지 않는다.
→ A || B 일 때 앞이 참이면 뒤에 확인할 필요가 없기 때문에 확인하지 않는다.

**산술연산자** : +, -, \*, /, %
형변환 적용 → 산술연산자에서 실수와 정수의 연산에서 둘 중 하나가 double인 경우 둘 다 double로 바꿔주고, 둘 중 하나가 float인 경우 둘 다 float으로 바꿔준다. 정수와 정수의 연산인 경우 둘 중 하나가 long이면 둘 다 long로 바꿔준다. 아니면 둘 다 int형이다.

**삼항연산자** : 조건식 ? 식1 : 식2
항이 3개인 연산자로 조건식이 true면 식1 false면 식2가 실행된다.

**복합 대입 연산자** : +=, -=, \*=, /=
