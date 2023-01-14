# 자료형\_배열(Array)

자료형 타입 바로 옆에 `[]`기호를 사용하여 표현한다. 특정 자료형의 집합이라고 보면 된다. 배열은 길이가 고정되어 있다.

**배열의 생성** String[] / int[]

```java
// 배열을 생성할 때
int[] odds = {1, 3, 5, 7, 9};
String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};

String[] weeks = new String[7];  // 배열의 길이 설정
weeks[0] = "월";
weeks[1] = "화";
weeks[2] = "수";
weeks[3] = "목";
weeks[4] = "금";
weeks[5] = "토";
weeks[6] = "일";
  // String[] weeks = new String[];  // 길이에 대한 숫자값이 없으므로 컴파일 오류가 발
```

**배열의 출력** Arrays.toString
StringBuffer sb = new StringBuffer();
sb.append("hello")
sb.append(" ")
sb.append("jump to java");
String result = sb.toString();
System.out.println(result); //"hello jump to java" 출력

````

- insert : 원하는 위치에 문자열 삽입이 가능하다.

```java
StringBuffer sb = new StringBuffer();
sb.append("jump to java");
sb.insert(0,"hello")
System.out.println(sb.toString());  //"hello jump to java" 출력
````

- substring : substring(시작위치, 끝위치) : StringBuffer 객체의 시작위치에서 끝위치까지의 문자를 뽑아낸다.
