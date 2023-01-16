# 조건문\_if 문 / switch-case 문

### **if(조건식) {실행문}**

조건식 : 값이 true / false 형태로 나올 수 있는 것이어야한다.
**if** 조건식이 참일 경우 중괄호 안에 값을 실행하는데, 만일 그 문장이 한문장이면 중괄호를 생략할 수도 있다.
조건식이 거짓인 경우 else의 실행문을 실행한다.

**else**를 안쓰고 if만 가지고 작성하는 경우 결과는 차이가 없으나, 컴퓨터가 작동하는 방식은 차이가 있다.

**else if** if를 중첩하여 사용할 수 있으나 식이 복잡해 질 수 있어 else if를 주로 사용하기도 한다. if문이 참이 아닐경우 다시 한번 조건을 확인한다.

```java
int N2 = 12;
		if(N2 % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}

//		else 라고 하는 것은 단독으로 쓰일 수 없음.

//		홀짝을 판별해라
		int N2 = 12;

		if(N2 % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}

//		else 라는 것을 내가 몰랐어..
//		if (N2 % 2 == 0) {}
//		if (N2 % 2 == 1) {}
```

### switch/case 문

if문과 비슷하지만 좀 더 정형화 된 조건 판단문으로 입력받은 변수의 값에 따라 실행문이 결정된다.

조건문(수식)에 들어갈 수 있는 변수의 타입은 byte, short, char, int, String, enum 이 가능하다.

**switch/case 문의 구조**

```java
switch(수식) {
    case 값1: ...
         break;
    case 값2: ...
         break;
    ...
    default: ...
         break;
}
```
