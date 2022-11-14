```java
package java_1114;
import java.util.ArrayList;
import java.util.List;

public class 제네릭과컬렉션즈 {
	public static void main(String[] args) {
		// 비전공, 문과생 할 거 없이 프로그래밍의 진입장벽을 낮춰준 것이 제네릭과 컬렉션즈다.
		// 컬렉션즈 : 자료구조(스택, 힙, 맵, 셋 ...)

		//배열
		int[] array = {5,7,6,10}; //배열 사용하는 방법1
		int[] array2 = new int[4]; // 배열 사용하는 방법2

		System.out.println("배열 0번째 값"+array[0]); // 배열 호출하는 방법.
		System.out.println("배열 0번째 값"+array[1]);


		//*** List (놓치면 spring이 힘들다.)
		 // <> : 제네릭 , List : 컬렉션즈
     		// List안에는 오직 Class만 올수 있다.
		List <Integer> list = new ArrayList<Integer>();
		// Integer : 정수(int)형을 담는 리스트
		list.add(10);
		list.add(20);

		System.out.println("0번째 값 : "+ list.get(0));
		System.out.println("1번째 값 : "+ list.get(1));

```

![](./img/%EC%A0%9C%EB%84%A4%EB%A6%AD%EA%B3%BC%20%EC%BB%AC%EB%A0%89%EC%85%98%EC%A6%88-%EB%B0%B0%EC%97%B41.JPG)

```java

		//List 길이 출력
		System.out.println(list.size());
		list.remove(1); // 1번쨰 요소삭제
		System.out.println(list.size()); // 삭제 후 출력시 나오는 화면



	// 문제 1. 5의 배수를 출력하시오.
		List <Integer> numberList = new ArrayList<Integer>();
		numberList.add(5);
		numberList.add(7);
		numberList.add(13);
		numberList.add(15);

		// 1번째 방법
		for(int i=0; i<numberList.size(); i++) {
			if(numberList.get(i)%5 == 0){
				System.out.println("for : "+numberList.get(i));
			}
}

		// 2번째 방법(향상된 for문(혹은 for each문 이라고 함.)을 이용한 로직구현
		//for 문에서 길이만큼 i에 배열리스트 index를 대입.
		for(int i : numberList) {
			if(i%5 ==0) {
				System.out.println("for each : "+i);
			}
		}

		 numberList = new ArrayList<Integer>();
		 numberList.add(50);
		 numberList.add(100);
		 numberList.add(300);
		 numberList.add(99);

     	}
}

```

![](./img/%EC%A0%9C%EB%84%A4%EB%A6%AD%EA%B3%BC%20%EC%BB%AC%EB%A0%89%EC%85%98%EC%A6%88-%EB%B0%B0%EC%97%B42.JPG)

```java
		 // 문제2. numberList 안에 있는 요소 총합 구하고, 100이상인 요소가 몇개인지도 출력하기.
		 //	(조건, for each문-향상된 조건문으로 풀기)


		 int sum = 0;
		 int cnt = 0;
		 for(int i : numberList) {
			 sum+=i;
			 if(i>=100) {
				 cnt++;
			 }
		 }
		 System.out.println(sum);
		 System.out.println(cnt);

     	// 정답
		 int sum = 0;
		 int count = 0;
		 for(int i : numberList) {
			 sum+=1;
			 if(i >=100) {
				 ++count; // 증감연산자를 앞에쓰든, 뒤를 쓰든 게임 개발자가 아니면 중요하지 않다.
			 }
		 }
		 System.out.println(count);
```

![](./img/%EC%A0%9C%EB%84%A4%EB%A6%AD%EA%B3%BC%20%EC%BB%AC%EB%A0%89%EC%85%98%EC%A6%88-%EB%B0%B0%EC%97%B43.JPG)

```java
		 // 문제 3. 아이스아메리카노가 몇번 나왔는지?
		 int count2 =0;
		for(String item : wordList) {
			System.out.println(item);
			//자바에서 문자비교는 equals.
			if(item.equals("아이스아메리카노")) {
				++count2;
		}
	}

```

image.png

```java
package java_1114;

public class 버거킹 {

	//필드변수(전역변수)
	String 버거종류;
	int 버거가격;
}

		버거킹 골드와퍼 = new 버거킹();
		골드와퍼.버거종류 = "치즈버거종류";
		골드와퍼.버거가격 = 9000;

		버거킹 프링글스 = new 버거킹();
		프링글스.버거종류 = "와퍼버거종류";
		프링글스.버거가격 = 9500;


		List<버거킹> 버거킹선화점 = new ArrayList<버거킹>(); //버거킹 클래스를 담는 리스트.
		버거킹선화점.add(골드와퍼);
		버거킹선화점.add(프링글스);

		// 버거킹 선화점에 있는 모든 종류를 출력
		for(버거킹 선화점 : 버거킹선화점) {
			System.out.println(선화점.버거종류);
		}
```

![](<./img/%EC%A0%9C%EB%84%A4%EB%A6%AD%EA%B3%BC%20%EC%BB%AC%EB%A0%89%EC%85%98%EC%A6%88-%EB%B0%B0%EC%97%B45(%ED%95%84%EB%93%9C%EB%B3%80%EC%88%98%20%EC%A7%80%EC%A0%95).JPG>)
![](./img/%EC%A0%9C%EB%84%A4%EB%A6%AD%EA%B3%BC%20%EC%BB%AC%EB%A0%89%EC%85%98%EC%A6%88-%EB%B0%B0%EC%97%B46.JPG)
