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


		
	}

}
