package house;

public class tv extends house_item{

		public int inch;

 public tv(String brand, int price, int inch) {
	 super(brand, price);
	 this.inch = inch;
	 
 }
	public void buy() {
		System.out.println("tv 구매하였습니다.");	
			}

//		public int ch;
////	public int ch=2; // 명시적 초기화.
//
//	public int sound;
//
//	
//	static{ // 클래스 초기화 블럭 - 클래스 변수만 초기화.
//		
//	}
//	
//	{//인스턴스 초기화 블럭 - 인스턴스변수와 클래스 변수를 초기화
//		ch=10;
//		sound=8;
//		
//	}
//	public int sound;
//
//public tv(){
//	super();
//}
//public tv(int p) {
//	
//}
//
	 // ---------------------
	 
	 // super는 부모이다. super(b,p)는 부모클래스 생성자 호출.
	 // 기본적으로 자식 클래스에 생성자모드가 실행되면 부모클래스 또한 자동으로 실행.
	 // 메소드를 만들 때, super는 가장 최상단(위에) 있어야 한다.
	 // why? super는 부모이므로, 자식 클래스에서 가장 먼저 실행될 수 있게 해야 함.
	 // 객체 생성 시 객체의 초기화 순서는 부모->자식 순이므로.
 
}
