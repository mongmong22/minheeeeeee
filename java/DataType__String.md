# 자료형\_문자열(String / StringBuffer)

### 문자열(String)

`String a = "happy java"`와 `String b = new String("happy java")`에서 a, b 변수는 동일한 문자열 값을 갖게 되지만 완전히 동일하지는 않다. 첫번째 방식은 리터럴(literal) 표기라고 하는데 객체 생성없이 고정된 값을 그대로 대입하는 방법을 말한다. 좀 더 자세히 알아보면, 리터럴 표기법은 "happy java" 라는 문자열을 JVM의 intern pool 이라는 메모리 공간에 저장하고 다음에 다시 동일한 문자열이 선언될때는 cache 된 문자열을 리턴한다. 이와는 달리 두번째 방식은 항상 새로운 String 객체를 만든다.

**원시(primitive) 자료형**

int, long, double, float, boolean, char 자료형을 원시(primitive) 자료형 이르며 `new`키워드로 그 값을 생성할 수 없다.

### 문자열 포매팅(Formatting)

```java
// 1
System.out.println(String.format("I eat %d apples.",3))
System.out.println(String.format("I eat %s apples.", "five"))

// 2
int number = 10;
String day = "three";
System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number, day));

// 3
System.out.printf("I eat %d apples.", 3); //"I eat 3 apples." 출력

// 4. 부동소수의 경우 %f
// 5. %라는 문자를 그대로 넣고 싶은 경우 %%로 쓰면 된다.
// 6. 포매팅 연산자 %d와 %를 같이 쓸 때는 %%를 쓴다.
	//System.out.println(String.format("Error is %d%.", 98)); 오류!! %%로 쓰기!
```

1. `%d, %s` 을 문자열 안에 사용하기
2. 변수로 대입하기
3. System.out.printf(`%d, %s` 사용)

`String.format`과 `System.out.printf`의 차이는 전자는 문자열을 리턴하는 메서드이고 후자는 문자열을 출력하는 메서드라는 점이다. 상황에 맞게 선택하여 사용하자.

### 문자열 내장 메서드

- equal : a와 b가 동일한지 비교한다. 결과는 true/false 출력.  `==`
  은 사용하면 다른 결과가 나올 수도 있다.

```java
String a = "hello";
String b = new String("hello");
System.out.println(a.equals(b));  // true
System.out.println(a == b);  // false
```

- contains : 특정 문자열이 포함되어 있는지 여부 리턴

```java
String a = "Hello Java";
System.out.println(a.contains("Java")); // true 출력
```

- replaceAll : 특정 문자열을 다른 문자열로 바꾸고자 할 때 사용

```java
String a = "Hello Java";
System.out.println(a.replaceAl("java", "world")); //Hello world 출력
```

- split : 특정 구분자로 나눠서 배열로 리턴

```java
String a = "a:b:c:d"
String[] result = a.split(":") // result는 {"a","b","c","d"}
```

- toUpperCase : 문자열을 모두 대문자로 변경 (모두 소문자로 변경할 때는 toLowerCase를 사용)

```java
String a = "Hello Java";
System.out.println(a.toUpperCase()); // HELLO JAVA 출력
```

- indexOf : 문자열 가운데서 특정 문자열이 시작되는 위치(인덱스)를 리턴

```java
String a = "Hello Java";
System.out.println(a.indexOf("Java")); // 6 출력
```

- charAt : 문자열에서 특정 위치의 문자를 리턴

```java
String a = "Hello Java";
System.out.println(a.charAt(6)); // J 출력
```

- substring : 특정 부분을 뽑아낼 경우 사용

```java
String a = "Hello Java";
System.out.println(a.substring(0,4)); //Hell 출력
```

### StringBuffer

문자열을 추가하거나 변경 할 때 주로 사용하는 자료형.
String 자료형은 한 번 생성되면 그 값을 변경할 수 없지만 StringBuffer는 계속해서 문자열을 수정할 수 있다.

- append : 계속해서 문자열을 추가해 나갈 수 있다
- toString : StringBuffer를 String 자료형으로 변경.변환.

```java
StringBuffer sb = new StringBuffer();
sb.append("hello")
sb.append(" ")
sb.append("jump to java");
String result = sb.toString();
System.out.println(result); //"hello jump to java" 출력
```

- insert : 원하는 위치에 문자열 삽입이 가능하다.

```java
StringBuffer sb = new StringBuffer();
sb.append("jump to java");
sb.insert(0,"hello")
System.out.println(sb.toString());  //"hello jump to java" 출력
```

- substring : substring(시작위치, 끝위치) : StringBuffer 객체의 시작위치에서 끝위치까지의 문자를 뽑아낸다.
