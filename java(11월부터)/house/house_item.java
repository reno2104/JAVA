package house;

public  abstract class house_item { // 추상메소드를 가지고 있다면 해당 클래스 또한 추상화 해야 한다.
//	public boolean onoff;
	public String brand;
	public int price;
	
	public house_item() {
		// 생성자 메소드. 메소드의 기본동작은 매서드 명으로 실행되어야 함.
		// 부모에게서 지정된 값이 자식에게 그대로 상속.
		// 다형성 = 다양한 여러가지 형태 성질을 가지는 것을 말함.
		// 자바 다형성 - 하나의 클래스로 여러 클래스를 표현 할 수 있는 방식.
		
//		onoff=false;
	}
	
	public house_item(String brand, int price) {
		this.brand = brand;
		this.price = price; // this 현재 생성되는 객체이다.
	}
	
	@Override // 출력.
	public String toString() {
		return "브랜드 : "+brand+", 금액 : "+price;
	}
	
	public abstract void buy();	// abstract : 추상메소드
	} // 상속관계라면 이 부분은 지우지 말고 남겨둬야 한다.
	// 부모는 자식이 가지고 있는 메소드들을 함께 가지고 있어야 한다.
	
// ** 추상메소드 : 껍데기만 있는 것.
/*
 * 추상클래스는 추상 메소드를 가질 수 있다.
 * 추상 클래스는 객체 생성이 불가능 하다.
 * 추상 메소드는 상속이 된다. (자식 클래스가 추상메소드를 가지게 된다.)
 * 
 * 추상화를 하는 이유
 * 1. 클래스의 중복성을제거
 * 2. 가독성 증가
 * 3. 에러율 감소
 * 4. 유지보수 시간 단축
 */

//	public void power() {
//	 onoff = !onoff; // 논리 연산자. not. 부정한다.
//	 if(onoff) 
//		 System.out.println("전원 on");
//		 else
//			 System.out.println("전원 off");
//	 
//	}

}
