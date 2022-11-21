package test2_1115;

import java.util.ArrayList;
import java.util.List;

import java_1115.member;

public class main1 {
	public static void main(String[] args) {
		
//		member m = new member();
//		
//		member[] arr = new member[5];
		//int[] a = new int[10]; - int 타입의 배열도 형식은 같다.
		
		List<member> list = new ArrayList<>();
		// 배열을 보다 쉽게 사용할 수 있도록 하는 기능.
		
		list.add(new member());
		list.get(0).성별="남자";
		list.get(0).아이디="end";
		list.get(0).주소="충남 계룡시";
		list.get(0).이름="성민";
		
//		arr[0] = new member();
//		arr[0].아이디 = "li"; // 빨간줄. 클래스 타입의 배열을 만들겠다는 뜻은 배열의 각 공간은 클래스타입의 참조변수 공간이기 때문.
//		arr[0].성별 = "여자";
//		arr[0].주소 = "대전 서구 둔산동";
//		arr[0].이름 = "윤재영";

//		for(int i=0; i<arr.length; i++)

//		Scanner sc = new Scanner(System.in);
//		
//		
//		// 배열 for문.
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = new member();
//			System.out.println("아이디 : ");
//			arr[i].아이디 = sc.nextLine();
//			System.out.println("이름 : ");
//			arr[i].이름 = sc.nextLine();
//			System.out.println("주소 : ");
//			arr[i].주소 = sc.nextLine();
//			System.out.println("성별 : ");
//			arr[i].성별 = sc.nextLine();
//		}
//		
//		for(member temp : arr)
//			temp.output();
//		

		// 컬렉션 적용시.
		
		
		
//		final int a = 10;
//		어디에서든 변경할수 없도록 하는 제어자.
//		a =20;
	
	}
}




/*
 * -제어자-
 * 	final - 변경할 수 없는
 * ** static : 
 * 
 * 	static 변수
 *  - 모든 인스턴스에 공통적으로 사용되는 클래스 변수
 *  - 클래스변수는 인스턴스를 생성하지 않고도 사용가능.
 *  - 클래스가 메모리에 로드될 때 생성된다.
 *  
 *  static 메소드
 *   - 인스턴스를 생성하지 않고도 호출이 가능한 static 메소드.
 *   -static 메소드 에서는 인스턴스의 변수와 인스턴스 메소드 사용불가.
 *   (이유: 만들어지는 시점이 서로 다르기 때문)
 *   
 *   abstarct - 추상적인, 추상화작업
 *   
 *   접근 제어자
 *   1. public - 제한 없이 사용가능, 클래스, 변수, 메소드
 *   2. default - 같은 패키지 에서만 사용가능.
 *   3. protected - 같은 패키지에서만 사용가능(단, 상속인 경우 예외)
 *   4. private - 같은 패키지라도 사용불가, 누구든 사용불가, 오직 해당 클래스 내부에서만 가능.
 * 	
 * 
 * -자바 변수 종류-  
 * 1. 지역 변수 : 메소드 내부에서 만들어진 변수.
 * 		{ 선언시 시작 } 선언시 종료.
 * 2. 인스턴스 변수 : 클래스 내부에 만들어진 멤버변수.
 * 클래스 객체 생성시 시작, 클래스 객체 종료시 종료.
 * 객체 수와 동일한 갯수.
 * ex) public String 아이디;
	public String 이름;
	public String 주소;
	public String 성별;
 * 3. 클래스 변수 :  static이 붙어있는 변수. 클래스 앞에도 붙을 수 있다.
 * 프로그램 로드시 시작, 프로그램 종료시 종료.
 * 객체 수와 상관없이 프로그램마다 한개씩만 존재.
 * ex) static int count;
 * 
 * 
*/
