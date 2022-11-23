package 자바0929;

class 관장{ 
	public void 운동을하다() {
		System.out.println("운동하기 전에 운동장 뛰는게 맞는거야!");
	}
	public void 주먹을날리다() {
		System.out.println("라이트 훅");
		System.out.println("레프트 훅");
		System.out.println("어퍼 컷!");
	}
}
//extends : 상속
//@Override : 오버라이딩 (자식 클래스에서 재정의) 
//오버로딩 vs 오버라이딩
//*오버로딩 : 메소드 이름은 같으나, 파라미터 타입이 다르다~
//*오버라이딩 : 부모의 기능을 자식이 재정의함
class 제자 extends 관장{
	@Override
	public void 운동을하다() {
		System.out.println("관장님! 간단하게 스트레칭하고 운동에 집중하죠!");
	}
	@Override
	public void 주먹을날리다() {
		System.out.println("상대와 간격을 조절한다.");
		System.out.println("레프트 쨉을 날린다.");
		System.out.println("라이트 훅을 날린다.");
	}
	
}


public class 상속공부하기2 extends Object{
	//자바(객체지향언어)의 모든클래스는 기본적으로 Object클래스를 상속받는다.
	//부모없는 자식없음!
	//모든 클래스는 Object의 기능을 상속받는다.
	public static void main(String[] args) {
		관장 경호관장님 = new 관장();
		경호관장님.운동을하다();
		경호관장님.주먹을날리다();
		System.out.println("===========================");
		제자 현상원 = new 제자();
		현상원.운동을하다();
		현상원.주먹을날리다();
	}
}