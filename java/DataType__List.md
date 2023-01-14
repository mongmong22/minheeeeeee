# 자료형\_리스트(List)

### ArrayList 만들기

1. add메서드를 활용하는 방법

```java
import java.util.ArrayList;

public class Sample__ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> pitches = new ArrayList<>(); // 제네릭스를 사용한 표현
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		System.out.println(pitches); //[138, 129, 142]

	}

}
```

1. 이미 배열이 존재하는 경우 Arrays.asList()를 사용하는 방법

```java
		String[] data = {"125", "dd", "854"};
		ArrayList<String> pitches2 = new ArrayList<>(Arrays.asList(data));
		System.out.println(pitches2);
```

1. String 배열 대신 String 자료형을 여러개 입력하여 생성하는 방법

```java
		ArrayList<String> pitches3 = new ArrayList<>(Arrays.asList("이렇게","따로","입력", "가능"));
		System.out.println(pitches3);
```

### 관련 메서드

- add / remove : 값을 추가/제거한다.
- size : ArrayList의 갯수를 리턴한다.
- get : 인덱스 값으로 값을 호출한다.
- contains : 해당 값이 있는지 ture/false를 리턴한다.
- sort : 리스트의 요소를 순서대로 정렬한다.
  오름차순 : Comparator.naturalOrder() / 내림차순 : Comparator.reverseOrder()

```java
import java.util.Comparator;

		ArrayList<String> pitches5 = new ArrayList<>(Arrays.asList("138","129","142"));
		pitches5.sort(Comparator.naturalOrder());
		System.out.println(result);  // [129, 138, 142] 출력
```

\***\*String.join\*\***

각 요소에 구분자를 끼워서 문자열로 만들 수 있다. 일반적인 문자열 배열에도 사용이 가능하다.
String.join을 사용하지 않으면 for구문 써서 문자열에 더하는 형식으로 처리해야하는 번거로움이 있다.

```java
		ArrayList<String> pitches4 = new ArrayList<>(Arrays.asList("138","129","142"));
		String result = String.join(":", pitches4);
		System.out.println(result);    //138:129:142
```
