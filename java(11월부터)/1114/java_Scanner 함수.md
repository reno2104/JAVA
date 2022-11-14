<h2><b>Scanner. 사용법</b></h2>

<h3>1. import.java 출력하는 방법.</h3>
   ![](<./img/Scanner%20%EC%9E%85%EB%A0%A5%20%EB%B0%9B%EC%95%84%EC%98%A4%EB%8A%94%20%EB%B0%A9%EB%B2%95.JPG>)

---

<h3>2. 수업내용</h3>

```java
package test1;

import java.util.Scanner;

// import java.util.Scanner; - 직접 작성.

public class study1 {

	public static void main(String[] args) {


		// 출력하는 방법.
		Scanner sc = new Scanner(System.in);
				// sc : 변수
		// new scanner : scanner 함수에 공간이 생긴다.
		// 입력받아오기 : System.in
		// 빨간 밑줄 그어진 이유 : 현재 이 클래스에 없기 때문.
		// 다른 곳(class)에 있는 "import java.util.Scanner;"를 가져와야 밑줄이 사라짐.
	}
}
			/*
		int num;

		num = sc.nextInt(); // 정수로 입력할꺼야.
		// 실수는 nextFloat();, nextByte();, nextShort();, nextLong();
		byte b = sc.nextByte();
		short s = sc.nextShort();
		long l = sc.nextLong();
		float f = sc.nextFloat();
		double d = sc.nextDouble();
		boolean bool= sc.nextBoolean();
		char ch = sc.nextLine().charAt(0); // 문자 입력 방식만 다르다.

		// *** 문자열 은 '배열'(문자로 구성되어있는) 이다.
	*/

```

---

<h3>3. 문제풀이</h3>

```java

  		//문제1. 국어, 수학, 영어, 점수 입력 받아서 총점과 평균 출력하기.
	/*
		int 국어 = sc.nextInt();
		int 수학 = sc.nextInt();
		int	영어 = sc.nextInt();
		int 과목수 = 3;
		int sum=0; // 총합
		double avg=0; // 평균
		 sum = 국어 + 수학 + 영어;
		avg = sum / 과목수;

		System.out.println("총점은?"+sum);
		System.out.println("평균은?"+avg);

		*/


		// 문제1. 정답.
		int kor, mat, eng;
		System.out.println("국어점수 : ");
		kor = sc.nextInt();
		System.out.println("수학점수 : ");
		mat = sc.nextInt();
		System.out.println("영어점수 : ");
		eng = sc.nextInt();

		int total = kor+mat+eng;
		int avg = total/3;

		System.out.println("총점 : " +total + "평균"+avg);

```

![](<./img/sc.println()%ED%95%A8%EC%88%98%EB%A1%9C%20%EC%B4%9D%EC%A0%90%EA%B3%BC%20%ED%8F%89%EA%B7%A0%EA%B5%AC%ED%95%98%EA%B8%B0.JPG>)

---

4. 배열 메소드

```java
		// java에서의 배열
		// 자바스크립트 : const arr = [] , const arr2 = new array();

		//자바에서 1차원 배열 생성하기.
		// 타입[] 배열 이름. = new 타입[배열크기];
		// 배열의 index는 0부터 시작한다.


		// 예제 1)
		int[] score= new int[5]; // 5개의 공간을 가진 크기의 배열 생성.

		//java는 자바스크립트와 다르게 push가 아닌 index(공간)로 입력한다.
		score[0]=10;
		score[1]=20;
		score[2]=30;
		score[3]=40;
		score[4]=50;
		// score[5]=60; - 5개의 공간만 만들었기때문에 index의 범위를 벗어나면 반드시 '오류'가 뜬다.

		System.out.println(score[0]);

		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}



		// 예제2) 문자열 배열 만들기.
		String[] name = new String[3]; // 문자열 배열 만들기. 3: 총 3단어.

		for (int i=0; i<name.length; i++) {
			System.out.println("이름입력 : ");
			name[i] = sc.nextLine(); // sc.next(); 도 사용가능.
		}

		// 입력한 문자열 출력
		for (int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}

    		Arrays.sort(score); // import 생성 필수!
```

![](<./img/배열 예제1.JPG>)
![](<./img/배열 예제2.JPG>)
![](<./img/import java.util.array 생성.JPG>)

5. 배열 복사 메소드

````java

		// 배열과 배열을 복사시켜주는 메소드
		int[] temp=new int[10];
		// arraycopy(복사할 배열, 복사배열시작 index, 저장되는 배열, 저장 배열 시작인덱스, 갯수)
		System.arraycopy(score, 0, temp, 0, score.length);

		System.out.println(Arrays.toString(temp)); // 반복문 없이 실행 확인하는 방법.
    ```
````

![](<./img/arrays.sort&toString 사용법.JPG>)
