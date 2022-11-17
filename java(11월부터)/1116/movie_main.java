package move;

import java.io.BufferedReader;
import java.io.FileReader;

public class move_main {

	public static void main(String[] args) {
		
		// 파일 불러오기,저장하기
		// 파일 읽어오기는 반드시 예외처리가 필요하다
		// new feredReader() 가 실제로 파일을 불러오고 BufferedReader 에 뿌린다
		// 
		String path = "c:/test/movie.txt";
		
		// 예외 처리
		// try 안에 있는 구문이 오류만 catch 한다, 오류 날 수 있는것만 try에 넣는다
		try {
			BufferedReader file = new BufferedReader(new FileReader(path) );
		
		// Exception e - 오류를 회피 하기 위한 예외처리에 사용되는 클래스 중 최상위 클래스
		}catch(Exception e){
			System.out.println("파일 없다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		// new 로 새로운 공간을 만들어 주고 moveVo 객체를 초기화 한다
//		new moveVo();
//		
//		moveVo[] moo = new moveVo[4];
//		moo[0] = new moveVo("아이언맨1",2008,12);
//		moo[1] = new moveVo("아이언맨2",2010,12);
//		moo[2] = new moveVo("아이언맨3",2013,12);
//		moo[3] = new moveVo("가디언즈 오브 갤럭시",2014,12);
//		
//		for(moveVo data : moo)
//			data.out();
	}
	
}

/*
 영화 총 4개 입력 하여 출력까지  
 */
