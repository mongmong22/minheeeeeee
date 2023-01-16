# 반복문\_for 문 / while 문

### for 문

**for (초기식; 조건식; 증감식) {반복 수행할 문장}**

조건식 값이 true인 경우 → 반복문을 수행하고 → 증감식을 수행한다.

조건식이 false이면 바로 반복문이 종료된다.

반복횟수를 정확히 아는 경우 for문을 주로 사용하고 반복횟수를 알 수 없는 경우 while을 주로 쓴다.

필요하지 않은 부분은 생략할 수 있는데 for(;;)와 같이 쓰는 경우 무한루프가 실행된다.

```java
package day2;

public class 반복문 {
	public static void main(String[] args) {
		//for(초기식; 조건식; 증감식){ 반복할 내용 }

		for(int i = 1, j = 10; i<=10; i++, j+=2) {
			System.out.println(i);
			System.out.println(j);
		}
	}
}

// 1 10 2 12 3 14 .... 이렇게 결과가 나올것..
```

```java
//for-each
		int[] nums = {1,2,3,4,5};

//		for(요소 하나하나를 받을 친구:반복할 수 있는 친구)
		for(int i :nums) {
			System.out.println(i);
		}
		for(int i :nums) {
			i = 2;
		}

// 1.for안에서만 처리되는 것이기 때문에

		for(int i : nums) {
			System.out.println(i);
		}
// 2.2 2 2 2 2 가 아니라 원래대로 1 2 3 4 5로 출력된다

		for(;;) {
			System.out.println("무한");
		}
```

### while 문

조건문이 참일 동안 while문의 수행문을 반복한다.

```java
while(조건식){ }
	//반복횟수를 정확히 알지 못할 때

		int i = 0;
		while(i < 5) {
			System.out.println(i);
		}
-------------------------------------------------
		int i = 0;
		while(i <= 5) {
			System.out.println(++i);
		}
		System.out.println(i);
```

**do-while문**

처음 한번은 참, 거짓 상관없이 블록내용을 먼저 수행하고, 그 다음 부터 조건문을 확인하여 반복한다.

```java
do {
	반복 수행할 문장
} while (조건문)
```

### \***\*break / continue\*\***

\***\*break :\*\*** 강제로 반복문을 빠져나가야 할 때 사용한다. (조건문을 아예 끝냄) \***\*continue :\*\*** while문을 빠져나가는 대신 반복문의 맨 처음(조건문)으로 돌아가게 하고 싶은 경우 사용한다. (얘만 빼고 다시 실행해봐)

**break label; / continue label;**

```java
구구단 5단까지 출력을 할껀데 4단이 되면 이제 출력을 멈춰
		outer : for (int i = 2; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				if( i == 4)
					break outer;
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
		}
```

outer 라는 for 문을 break하는 것으로 이중for문 등 반복문이 중첩되는 경우에서 break할 반복문을 지정할 수 있음. 위의 코드의 경우 label이 없다면 if문이 속한 두번째 for문만 깨질 것이다.
