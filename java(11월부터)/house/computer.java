package house;

public class computer extends house_item{

	public String vga;
	
	public computer() {}

public computer(String brand, int price, String vga) {
	super(brand, price);
	this.vga = vga;
}

	public void buy() {
	System.out.println("컴퓨터 구매하였습니다.");	
	}


}

/*
	변수의 초기화
	변수초기화 방법
	
	1. 생성자 메소드를 통해 초기화
		1) 생성자 메소드 객체 생성시마다 실행.
	2. 초기화블럭을 통한 초기화
		1) 인스턴스 초기화 블럭
		2) 초기화블럭은 프로그램이 로드된 뒤에 딱 한번만 실행.
	3. 명시적 초기화
	
	
	**변수의 초기화 순서
	 1. 인스턴스 변수 초기화 순서
	  - 명시적 초기화 > 초기화 블럭 > 생성자 메소드
	  
	 2. 클래스 변수 초기화 순서
	  - 명시적 초기화 > 초기화 블럭
*/
