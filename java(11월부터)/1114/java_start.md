<h2><b>이클립스 실행 및 pakage, class 생성.</b></h2>

1. 이클립스 실행
2. 왼쪽 목록의 src - 오른쪽 마우스 클릭
3. pakage 선택 - 이름 작성
   (패키지는 여러개 생성가능. 단, 이름은 서로 다르게 해야됨.)
4. pakage 오른쪽 마우스 클릭 - class 생성
   ( pakage마다 하위 class는 이름이 달라야 되지만, 다른 pakage마다 같은 이름의 class 생성 가능. \*폴더를 생각하면 됨.)

   ![](./img/class%20%EC%83%9D%EC%84%B1%EC%8B%9C%20public%20static%20%EC%83%9D%EC%84%B1%EB%B2%95.JPG)

5. 경로를 확인하고 싶을 때.
   ![](./img/console%20%EA%B2%BD%EB%A1%9C.JPG)

   ***

6. console이 보이지 않을 떄 찾는 방법.
   ![](./img/%EA%B2%BD%EB%A1%9C%EC%B0%BE%EA%B8%B01.JPG)
   ![](./img/%EA%B2%BD%EB%A1%9C%EC%B0%BE%EA%B8%B02.JPG)

   ***

7. 수업내용

```java
package test1;

public class study2 {

	public static void main(String[] args) {

		// *** 금일은 자바스크립트와 다른 부분. 기능들을 설명할 예정.


//		주석 사용법

		//	한줄 주석

		/*
		 *
		 *  여러줄 주석
		 */



		System.out.println("나는 자바다. 너는?"); //기본적인 출력방식. ""는 문자열 인식한다. 확인시, f11.
		//console 보이게 하는 방법. <상위 메뉴바 window - show view>


		//	단축키.
		System.out.println(); // sout(등록해야 함). 혹은 sysout 입력 후 ctrl+space.

		//출력 방법.
		System.out.println("출력방법1");
		System.out.print("출력방법2");
		// ln (o) : print line(한줄로 출력해라.) .줄바꿈(Enter) 기능.
		// ln (x) : 그냥 출력해라.
		System.out.printf("출력방법3");

		System.out.printf("%d %f %s \n 줄바꿈도 된다. \n\n ㅋ",100, 3.14, "자바");
		// f: 데이터 형식에 맞춰 작성.
		// 따옴표 : 앞 - "실제출력되는 부분". 뒤 - "데이터".
		// %d : 정수
		// %f : 실수
		// %s : 문자열
		// + : 문자열과 변수를 합쳐주는 기능

		//예시)
		System.out.println("  " +100+"  "+3.14+" 자바 ");
		System.out.println("줄바꿈도 된다.");


		//예시)
		int age = 34;
		System.out.println("너는 " +age +" 살이냐? ");

		// 자바 데이터 타입
		/*	정수 타입 - byte, short, int , long
		 * 	실수 타입 - float, double
		 *	문자 타입 - char
		 *	논리 타입 - boolean
		 */

		int num;
```

이어서 Scanner.md 파일에 있음.
