# 자료형\_집합(set)

중복을 허용하지 않는다. mapr과 마찬가지로 순서가 없기때문에 인덱싱으로 값을 얻을 수 없다.

중복을 제거하는 필터역할로 사용하기 유용하다. 특히나 교집합, 합집합, 차집합 등을 구하는 때에 유용하게 사용할 수 있다.

### 관련 메서드

- add / remove : 값을 추가/제거한다.

```java
public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("jump");
        set.add("To");
        set.add("Java");
        System.out.println(set);  // [Java, To, jump] 출력

				set.remove("To");
				System.out.println(set);  // [Java, jump] 출력

}
```

- addAll :한꺼번에 여러개의 값을 추가한다.

```java
			 set.addAll(Arrays.asList("let's","go"));
       System.out.println(set);   // [play, Java, To, jump, let`s] 출력
```

### 교집합, 합집합, 차집합 구하기

```java
import java.util.Arrays;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
      // set 2개 생성
				HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
				HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

				HashSet<Integer> intersection = new HashSet<>(s1);
				intersection.retainAll(s2); //교집합 수행
				System.out.println(intersection); // [4, 5, 6] 출력

        HashSet<Integer> union = new HashSet<>(s1);  // s1으로 union 생성
        union.addAll(s2); // 합집합 수행
        System.out.println(union);  // [1, 2, 3, 4, 5, 6, 7, 8, 9] 출력

        HashSet<Integer> substract = new HashSet<>(s1);  // s1으로 substract 생성
        substract.removeAll(s2); // 차집합 수행
        System.out.println(substract);  // [1, 2, 3] 출력
    }
}
```

- retainAll : 공통 요소만 남기고 나머지는 제거하여 교집합을 구할 수 있다.
- addAll : 집합전체를 추가한다. 중복항목은 알아서 제거되므로 합집합을 수행할 수 있다.
- removeAll : 해당 집합에 있는 것은 지우므로, 차집합 수행이 가능하다.
