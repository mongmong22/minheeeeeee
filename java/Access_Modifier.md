# 접근제한자

### 패키지

패키지란 클래스와 관련 있는 인터페이스들을 모아두기(=모듈화) 위한 공간으로 프로그램의 많은 클래스를 관리하기 위해 패키지를 이용한다. PC에서 폴더를 이용하는 것과 마찬가지.

패키지의 구분은 .(dot) 연산자를 이용하고, 패키지 이름을 지을때는 시중에 나와있는 패키지들과 구분되게 지어야 한다. 일반적으로 소속이나 회사 도메인을 사용한다.

ex) com.ddubi.project*이름.module*이름

**패키지 사용시 장점**

효율적으로 파일 정리.관리가 가능하다.

패키지 단위로 접근제어가 가능하다.

클래스를 구별할 수 있어 클래스를 혼동하는 경우를 방지한다.

### 임포트 import

다른 패키지에 있는 클래스를 사용하기 위한 과정이다

서로 다른 패키지에 있는 클래스 중에서 하나를 골라서 쓰는 경우 import한

```java
import 패키지명.클래스명;
import 패키지명.*;  //해당 패키지 내 모든 클래스를 불러오는 것이지,
//하위 패키지까지 불러오는 것은 아니다. 하위 패키지에 있는 클래스를 쓰고 싶다면
import 패키지명.하위패키지.*(or클래스명);
================================================
package pkg1;    //현재 위치

import pkg1.pkg2.pkg3.Person;  //import한 패키지

public class PackageTest {
	public static void main(String[] args) {

		Person p1 = new Person();
		System.out.println(p1.pkg);



	}         // pkg1.pkg2.pkg3 출력
}
```

서로 다른 클래스에 있는 이름이 충돌하는 클래스를 두 개 이상 사용하고 싶은 경우 패키지명을 생략할 수 없고 패키지명.클래스명 으로 풀패키지이름을 써줘야한다.

```java
package pkg1;

import pkg1.pkg2.pkg3.Person;

public class PackageTest {
	public static void main(String[] args) {

pkg1.Person p1 = new pkg1.Person();
		pkg1.pkg2.Person p2 = new pkg1.pkg2.Person();
		pkg1.pkg2.pkg3.Person p3 = new pkg1.pkg2.pkg3.Person();
		Person p4 = new Person();

		System.out.println(p1.pkg);    //pkg1
		System.out.println(p2.pkg);    //pkg1.pkg2
		System.out.println(p3.pkg);    //pkg1.pkg2.pkg3
		System.out.println(p4.pkg);    //pkg1.pkg2.pkg3
	}
}
```

### 접근제한자

클래스, 멤버 변수, 멤버 메서드 등의 선언부에서 접근 허용 범위를 지정하는 역할의 키워드이다.

**접근제한자의 종류**

- public : 모두에게 공개
  클래스 같은 경우 public 또는 default(생략)만 가능하다. 패키지 밖에 있는 클래스 같은 경우에도 접근이 가능하다.
- protected : 같은 패키지에서만 접근이 가능하나 다른패키지의 클래스와 상속관계가 있으면 접근이 가능하다.
- (default) : 같은 패키지에서만 접근이 허용되는 것으로 접근제한자가 선언이 안 되어있는 경우 기본적으로 적용된다.
- private : 자신의 클래스에서만 접근이 허용. 클래스내에서만 사용할 수 있다.

```java
package test02_private;

// class는 public 아니면 default
public class Person {
	private String name;
	private int age;

	public static void main(String[] args) {
		Person p1 = new Person();
		// 자기자신이므로 접근 가능!
		p1.name = "박보라";

	}
}
==============================================
package test03_default;

// class는 public 아니면 default
public class Person {
	String name; // 접근제한자를 생략하면, 접근제한자가 default
	int age;

	public static void main(String[] args) {
		Person p1 = new Person();
		// 자기자신이므로 접근 가능!
		p1.name = "최돌이";

	}
}
------------------------------------------------
package test03_default;
import test03_default.Person;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		// 다른 클래스(PersonTest)에 있지만
		// 같은 패키지이므로 default 속성에 접근가능!
    // import 했더라도 다른 패키지에 있으면 default 속성에 접근불가.
		p1.name = "홍뚜비";

	}
}
```

**그 외 제한자**

- static : 클래스 레벨의 요소 설정한다. 인스턴스를 사용하지 않고도 해당 클래스멤버를 사용하기 위해 사용한다.
- final : 요소를 더 이상 수정할 수 없게 한다. 상수개념.
  final 클래스 : 상속금지
  final 메소드 : overriding 금지
  final 변수 : 값을 바꿀 수 없는 상수
- abstract : 추상 메서드 및 추상 클래스 작성.

**객체 모델링**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bd54b5e5-402d-44ee-9c09-7aac34629cf5/Untitled.png)

### 접근자(getter) 설정자(setter)

클래스에 선언된 변수 중에 접근제한에 의해서 접근할 수 없는 변수의 경우 다른 클래스에서 접근할 수 없기 때문에 접근하기 위한 메서드를 public으로 선언하여 사용한다.

값을 변경하는 것을 설정자 setter라고 하고, 값을 조회하는 것을 접근자 getter라고 한다.
(마우스 우클릭 → source → generate getters and setters에서 만들 수 있음)

**접근자 설정자 사용 이유**

멤버변수를 직접 고치는 것은 오류가 발생할 수도 있기 때문에 원데이터를 보호하기 위해 메서드를 활용하여 간접적으로 사용한다.(내가 나를 고치는 건 되는데 니가 나를 고치는건 안된다?)

메서드를 사용하면 그 값이 제대로 된 값인지 필터링을 한번 할 수 있다. 메서드 블록 안에 if를 사용해서 값이 음수면 return을 사용해서 종료하여 값을 받지 못하도록 설정 할 수도 있다. (변수 설정에 일정 조건을 두고 싶은 경우 사용한다)

### 싱글턴 패턴 Singleton Pattern

원래는 클래스로 객체를 무한하게 찍어낼 수 있지만, 싱글턴 패턴의 경우 클래스가 단 하나만의 객체를 만들 수 있게 하는 것이다. 그래서 생성자가 여러번 호출되도 최초 객체 생성 이후에는 최초 생성한 객체만 리턴한다.

ex) 회원목록을 관리하는 등의 경우 목록을 한번만 만들어두고 처음말들어둔 하나의 목록을 계속 활용하기 위해서 사용한다. 목록을 매번 생성 X. 무언가를 추가하더라도 그 처음만난 목록(객체)하나만 사용할 수 있다.

1. 생성자를 private로 막는다. (클래스 밖에서는 인스턴스를 못 만들어)
2. 클래스내에서 private로 자기자신의 인스턴스를 만든다. (나라도 일단 만들어서 가지고 있어)
3. 유일한 인스턴스에 접근 가능한 getter을 만든다.(public) → 메서드 리턴값은 1에서 만든 인스턴스(자기자신).
4. 3은 외부에서 접근하는 경로기 때문에 public이어야 한다. 또한 기본생성자를 막아놨기 때문에 외부에서 인스턴스를 만들 수 없기 때문에 static이어야 한다.
5. 그럼 static에서 non-static인 instance를 사용할 수 없기 때문에 2번도 static으로 만들어져야한다.

싱글턴에서는 추가로 객체를 생성할 수 없다. new로 객체를 생성하지않고 클래스명.메서드()로 이미 생성된 것을 불러오는 식으로 사용

```java
public class Person {

	// 싱글턴으로 바꾸기
	// 1. private으로 자기 자신을 만들기
	//   - static: 객체를 생성하지 않고, 클래스 이름으로 접근하기 위함
	private static Person instance = new Person();

	// 2. 생성자를 private으로 막기
	private Person() {
		this.name = "유일한사람";
		this.age = 12313;
	}

	// 3. 유일한 객체에 접근할 수 있는 통로 만들기
	public static Person getInstance() {
		return instance;
	}
 // private하게 기본생성자를 막아놨기 때문에 static이 없으면 밖에서 인스턴스를 만들 수 없다.
}
=============================================
사용시
//		Person p1 = new Person(); // X 싱글턴에서는 객체를 추가로 생성할 수 없음
		Person p1 = Person.getInstance();
		// p1.name = "김나나"; // private 멤버변수에 접근 불가!
		// p1.age = 30;
		System.out.println(p1.getName());        //유일한 사람
		System.out.println(p1.getAge());         // 12313
```

### 객체 배열 관리

DB대신 배열을 사용해서 객체의 정보를 저장하고 객체의 조회, 추가, 수정, 삭제를 구현하는 방법을 말하는데 이 때 싱글턴 패턴을 사용해서 정보 관리를 한다. (싱글턴패턴으로 배열을 만들어 활용)
