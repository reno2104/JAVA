package house;

public class tv extends house_item{
	public int inch;
	
	public tv() {}
	public tv(String brand, int price, int inch) {
		super(brand,price);  //super - super는 부모이다. , super(b,p) 는 부모클래스 생성자 호출
		           //super는 자식 클래스생성자에서 가장먼저 실행될수 있게 해야한다.
		           // 객체 생성시 객체의 초기화 순서는  부모 ->자식 순이기때문에
		this.inch = inch;
	}
	
	public void buy() {
		System.out.println("TV 구매하였습니다.");
	}
}


/*
 * 
 * public int ch=2; // 명시적 초기화
	public int sound;
	
	
	static{ // 클래스 초기화 블럭 - 클래스변수만 초기화
		
	}
	
	{ // 인스턴스 초기화 블럭 - 인스턴스변수와  클래스 변수 를 초기화
		ch=10;
		sound=8;
	}
	
 	변수의 초기화
 	변수초기화 방법
 		1. 생성자메서드를 통해 초기화
 			- 생성자 메서드 객체 생성시 실행
 		
 		2. 초기화블럭을 통한 초기화
 			- 초기화블럭은 프로그램 이 로드된 뒤에  딱한번 실행
 
 		3. 명시적 초기화
 		
 	변수 초기화 순서
 	인스턴스 변수 초기화 순서
 	    명시적초기화 -> 초기화 블럭 -> 생성자메서드
 	
 	클래스 변수 초기화 순서
 		명시적초기화 -> 초기화 블럭
 
 */













