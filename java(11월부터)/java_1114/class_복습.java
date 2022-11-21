package java_1114;

	class 월드컵{
		// class : html의 div와 같다.
		// div가 모이면 사이트가 되는 것처럼, class가 모이면 프로그램이 된다.
		String 출전국가;
		String 선수명단;
		String 개최지;
		
		
		// 생성자 : 리턴이 없는 메소드, 클래스 호출 시 초기화할때 사용
		// 생성자 이름은 클래스 이름과 동일해야 함.
		월드컵(String 출전국가, String 선수명단, String 개최지){
			
			//파라미터로 가져온 값을 필드변수에 대입하기
		this.출전국가 = 출전국가;
		this.선수명단 = 선수명단;
		this.개최지 = 개최지;
		}
		
		// 클래스 안에서 메소드 만들어보기
		// String : 리턴타입
		// 출전국가알아내기 : 메소드 이름
		// () : 파라미터 		
		
		String 출전국가알아내기() {
			return "우루과이";
		}
		String 개최지알아내기() {
			//자바에서 this는 현재 클래스를 의미.
			return this.개최지;
		}

		
		// 문제1. this를 이용해서 선수명단을 리턴하는 함수를 정의
		
		String 선수명단알아내기() {
			return this.선수명단;
		}
		
	}
public class class_복습 {
	//main 치고, ctrl+space, 엔터.
	public static void main(String[] args) {
		// 만든 클래스 main함수에 호출하기
		// 객체지향프로그래밍에서는 클래스 데이터 타입이다.
		월드컵 a = new 월드컵("프랑스","디디에 데샹외 몇명", "카타르");
		// new 월드컵(); 에러나는 이유 => 생성자에 파라미터 변수를 정의했기 때문
		// 파라미터 값을 정의해주면 에러가 지워짐.
		// 생성자는 함수와 동일하지만, 리턴타입이 없고 메소드 이름은 클래스 이름과 동일해야 함.
		
		System.out.println(a.개최지);
		System.out.println(a.선수명단);
		System.out.println(a.출전국가);
		
		//데이터 대입
		// 클래스에 오는 변수를 ***필드변수라고 한다.
		a.개최지 = "카타르";
		a.선수명단 = "대한민국 선수단";
		a.출전국가 = "대한민국";
		//데이터 출력하기
		System.out.println("개최지 ===> "+a.개최지);
		System.out.println("선수명단 ===> "+a.선수명단);
		System.out.println("출전국가 ===> "+a.출전국가);
		//ctrl+f11 실행
		
		
		//출전국가알아내기 메소드의 리턴타입은 String.
		String 출전국가 = a.출전국가알아내기(); //클래스에서 정의한 메소드 호출
		String 개최지 = a.개최지알아내기();
		
		System.out.println("메소드로 가져온 값 ===> " +출전국가);
		System.out.println("메소드로 가져온 값 ===> " +개최지);

	}
}
