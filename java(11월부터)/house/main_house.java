package house;

public class main_house {

	public static void main(String[] args) {
		//클래스의 객체(인스턴스) 생성 방법
		// 클래스명 참고변수명 = new 클래스명(); -> 클래스명()은 클래스 생성자메소드 호출이다.
		
		tv[] t = new tv[ ] {new tv("삼성", 1230000, 65), 
				new tv("LG", 1505000, 65),
				new tv("삼성", 890000, 55), 
				new tv("LG", 2240000, 75),
				new tv("삼성", 730000, 50)		};
		
		
		aircon[] air = new aircon[ ] {new aircon("휘센",1510510, 17),
				new aircon("캐리어",1619800, 25),
				new aircon("휘센",1587110, 30),
				new aircon("위니아",189000, 17),
				new aircon("비스포크",1878590, 19) };
		
		t[0].buy();
		air[0].buy();
		
//		tv t = new tv();
//		aircon air = new aircon();
//		air.brand ="휘센";
//		air.price = 1200000;
//		System.out.println(air.brand);
//		System.out.println(t.onoff);
//		
//		t.power();
//		t.power();
//		air.power();
		
//		tv t = new tv("삼성", 1230000);
//		tv t2 = new tv("LG", 985000);
//		
//		aircon air1 = new aircon("휘센", 940000);
//		aircon air2 = new aircon("위니아", 560000);
//		
////		aircon air3 = new aircon
//		
//		computer com1 = new computer("정수PC", 780000);
//		
//		System.out.println(t.toString());
		
	}

}

// 클래스 관계 - 상속, 포함.
// 상속 - 부모자식 관계 
/* 부모클래스 - 자식 1클래스
 * 			- 자식 2클래스
 * 			- 자식 3클래스
 * 
 * 상속관계 - 왜? 관리, 재활용성(자바의 상속이란 기존 클래스를 재사용하여 새로운 클래스를 작성하는 것)
 * 			코드의 중복성 제거, 프로그램 생산성과 유지보수 up.
 * 		- 다형성 구현을 위함.
 * 		-단일상속
 * 
 * 포함관계 - 코드를 재사용 가능한 방법. 상속과는 다른 관계
 * 포함은 다른 클래스를 자신의 ㅣ변수로 만들어 사용하는 방법.
 * 
 *  상속관계의 의미 : ~은 ~이다. (~is ~a) 에어컨은 가전제품이다. tv는 가전제품이다.
 *  포함관계의 의미 : ~은 ~을 가지고 있다.(~has ~a) 에어컨은 가전제품을 가지고 있다.
 *  										가전제품을 에어컨을 가지고 있다. (필수 x)
 *  										자동차는 타이어를 가지고 있다.
 *  
 */  
