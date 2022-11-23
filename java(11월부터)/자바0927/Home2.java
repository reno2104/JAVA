package 자바0927;

public class Home2 {

	public static void main(String[] args) {
		//클래스에 있는 변수 접근하고 대입하기
		영화관 a영화관 = new 영화관();
		//필드변수에 값 대입!
		a영화관.직원수 = 20;
		a영화관.set영화관위치("대전 둔산동");
		a영화관.set영화관이름("CGV 둔산점");
		a영화관.set개봉영화종류(new String[]{"늑대사냥", "공조2: 인터내셔날", "아바타 리마스터링"});
		
		System.out.println("직원 수 : "+ a영화관.직원수);
		System.out.println("영화관 위치 : "+ a영화관.get영화관위치());
		System.out.println("영화관 이름 : "+ a영화관.get영화관이름());
		System.out.println("개봉영화 종류 :"+ a영화관.get개봉영화종류()[0]);
		
		//b영화관 직원수 : 300, 
		//영화관 위치 : 대전 용전동, 
		//영화관 이름 : CGV 대전터미널점
		//개봉영화 : 헤어질결심, 한산, 토이스토리 버즈
		영화관 b영화관 = new 영화관();
		b영화관.직원수 = 300;
		b영화관.영화관위치 = "대전 용전동";
		b영화관.영화관이름 = "CGV 대전터미널점";
		b영화관.set개봉영화종류(new String[]{"헤어질결심", "한산", "토이스토리 버즈"});
		
		
	}
}