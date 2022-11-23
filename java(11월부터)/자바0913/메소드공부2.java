package 자바0913;

public class 메소드공부2 {
	//메소드는 기능
	//리턴타입이 void면 return을 명시하지 않는다.
	public static void 캐릭터를선택하다(String 캐릭터이름) {
		System.out.println("당신이 선택한 캐릭터 이름은 ?"+캐릭터이름);
	}
	public static void 아이템을먹다(String 아이템) {
		System.out.println(아이템+"을 먹었습니다.");
	}
	
	public static void main(String[] args) {
		//정의한 메소드를 불러온다( == 메소드 호출).
		캐릭터를선택하다("다우");
		아이템을먹다("UFO");
	}

}
