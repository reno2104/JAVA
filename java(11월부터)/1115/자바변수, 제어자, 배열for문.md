<h2>1.제어자 </h2>

```java
-제어자-
 * 	final - 변경할 수 없는
 * ** static :
 *
 * 	static 변수
 *  - 모든 인스턴스에 공통적으로 사용되는 클래스 변수
 *  - 클래스변수는 인스턴스를 생성하지 않고도 사용가능.
 *  - 클래스가 메모리에 로드될 때 생성된다.
 *
 *  static 메소드
 *   - 인스턴스를 생성하지 않고도 호출이 가능한 static 메소드.
 *   -static 메소드 에서는 인스턴스의 변수와 인스턴스 메소드 사용불가.
 *   (이유: 만들어지는 시점이 서로 다르기 때문)
 *
 *   abstarct - 추상적인, 추상화작업
 *
 *   접근 제어자
 *   1. public - 제한 없이 사용가능, 클래스, 변수, 메소드
 *   2. default - 같은 패키지 에서만 사용가능.
 *   3. protected - 같은 패키지에서만 사용가능(단, 상속인 경우 예외)
 *   4. private - 같은 패키지라도 사용불가, 누구든 사용불가, 오직 해당 클래스 내부에서만 가능.
```

<h2>2. 자바변수 </h2>

```java
 * -자바 변수 종류-
 * 1. 지역 변수 : 메소드 내부에서 만들어진 변수.
 * 		{ 선언시 시작 } 선언시 종료.
 * 2. 인스턴스 변수 : 클래스 내부에 만들어진 멤버변수.
 * 클래스 객체 생성시 시작, 클래스 객체 종료시 종료.
 * 객체 수와 동일한 갯수.
 * ex) public String 아이디;
	public String 이름;
	public String 주소;
	public String 성별;
 * 3. 클래스 변수 :  static이 붙어있는 변수. 클래스 앞에도 붙을 수 있다.
 * 프로그램 로드시 시작, 프로그램 종료시 종료.
 * 객체 수와 상관없이 프로그램마다 한개씩만 존재.
 * ex) static int count;
```

![](./img/%EC%A0%91%EA%B7%BC%20%EC%A0%9C%EC%96%B4%EC%9E%90%20%EC%A2%85%EB%A5%98.JPG)

<h2>3.배열 for문 </h2>

```java
		Scanner sc = new Scanner(System.in);

    	// 배열 for문.
    	for(member temp : arr) {
    		temp = new member();
    		System.out.println("아이디 : ");
    		temp.아이디 = sc.nextLine();
    		System.out.println("이름 : ");
    		temp.이름 = sc.nextLine();
    		System.out.println("주소 : ");
    		temp.주소 = sc.nextLine();
    		System.out.println("성별 : ");
    		temp.성별 = sc.nextLine();
    	}
```

![](./img/%EB%B0%B0%EC%97%B4%20%EC%A0%84%EC%9A%A9%20%EB%B0%98%EB%B3%B5%EB%AC%B8.JPG)
![](./img/%EB%B0%B0%EC%97%B4%20%EC%A0%84%EC%9A%A9%20%EB%B0%98%EB%B3%B5%EB%AC%B8%20%EC%82%AC%EC%9A%A9%EB%B2%95.JPG)
![](./img/%EB%B0%B0%EC%97%B4%20%EC%A0%84%EC%9A%A9%20%EB%B0%98%EB%B3%B5%EB%AC%B8%20%EC%82%AC%EC%9A%A9%EB%B2%951.JPG)

<h2>4.배열 for문에서 제네릭과 컬렉션으로 만들기 </h2>

```java
import java.util.ArrayList;

		List<member> list = new ArrayList<>();
		// 배열을 보다 쉽게 사용할 수 있도록 하는 기능.

		list.add(new member());
		list.get(0).성별="남자";
		list.get(0).아이디="end";
		list.get(0).주소="충남 계룡시";
		list.get(0).이름="성민";

		---
			public member() {} // 생성자 메소드
	public member(String 아이디, String 이름, String 주소, String 성별) {
		this.성별 = 성별;
		this.아이디 = 아이디;
		this.이름 = 이름;
		this.주소 = 주소;
```

![](<./img/%EB%B0%B0%EC%97%B4%20%EC%A0%84%EC%9A%A9%20%EB%B0%98%EB%B3%B5%EB%AC%B8%20%EC%82%AC%EC%9A%A9%EB%B2%952(%EC%A0%9C%EB%84%A4%EB%A6%AD%EA%B3%BC%20%EC%BB%AC%EB%A0%89%EC%85%98).JPG>)
![](<./img/%EB%B0%B0%EC%97%B4%20%EC%A0%84%EC%9A%A9%20%EB%B0%98%EB%B3%B5%EB%AC%B8%20%EC%82%AC%EC%9A%A9%EB%B2%953(%EC%A0%9C%EB%84%A4%EB%A6%AD%EA%B3%BC%20%EC%BB%AC%EB%A0%89%EC%85%98).JPG>)

