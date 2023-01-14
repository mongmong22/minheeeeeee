# 자료형\_맵(Map)

대응관계를 쉽게 표현할 수 있게 해주는 자료형이다. Associative array, Hash 라고도 불린다. dictionary와 비슷하여 key와 value를 한 쌍으로 갖는다.

리스트나 배열처럼 순차적으로 값을 구하는 것이 아니기 때문에 인덱싱은 불가능하고 key값으로 value를 얻어낸다.

HashMap : 기본적인 map형태이다.

LinkedHashMap : 입력된 순서대로 데이터를 저장하는 특징이 있다.

TreeMap : key의 오름차순대로 데이터를 저장하는 특징이 있다.

### 관련 메서드

- put : Map에 key와 value를 추가할 수 있다.
  제네릭스<>를 이용해서 데이터타입을 지정해준다. (=리스트의 add기능)

```java
package dataType;
import java.util.HashMap;

public class Sample__Map {

	public static void main(String[] args) {
		//String값만 가질 수 있는 HashMap을 생성한다.
		HashMap<String, String> map = new HashMap<>();
		//put은 map에 key와 value를 추가한다.
		map.put("people", "사람");
		map.put("baseball","야구");
		map.put("basketball","농구");

	}

}
```

- remove : key값으로 map의 항목을 삭제하고 삭제한 value값이 뭔지 리턴한다.

```java
		System.out.println(map.remove("basketball"));   //농구 출력
```

- size : Map의 갯수를 리턴한다.

```java
System.out.println(map.size());  //2출력
```

- get : key에 해당하는 value값을 가져온다. 대응되는 값이 없는 경우 null이 출력된다.
- getOrDefault : get하고자 할 때 대응되는 값이 없는 경우 null 대신 디폴트값을 가져올 수 있다.

```java
		System.out.println(map.get("people"));   // 사람
		System.out.println(map.get("soccer"));   // null
		System.out.println(map.getOrDefault("people", "없어"));   //사람
		System.out.println(map.getOrDefault("soccer", "없어"));   //없어
```

- keySet : 모든 key값을 모아서 set자료형으로 리턴한다.

```java
		System.out.println(map.keySet());  //[baseball, people] 출력
```

- containsKey : 해당 key가 있는지 true/false 리턴한다.
