package movie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;



public class movie_main {

	public static <movieVo> void main(String[] args) {
		
		List<movieVo> list = new ArrayList<>();
		
		// 파일 불러오기,저장하기
		// 파일 읽어오기는 반드시 예외처리가 필요하다
		// new feredReader() 가 실제로 파일을 불러오고 BufferedReader 에 뿌린다
		// 
		String path = "c:/test/movie.txt";
		
		// 예외 처리
		// try 안에 있는 구문이 오류만 catch 한다, 오류 날 수 있는것만 try에 넣는다
		try (BufferedReader file = new BufferedReader(new FileReader(path) )){
			

			
			
		while(true) {		
			String line = file.readLine();
			if(line == null) break;
			// null 값이 나올떄 까지 반복. 이후 null 이 나오면 break로 종료.
			String[] temp = line.split(" ");
			// 띄어쓰기를 기준으로 값이 문자열 배열로 나옴.
			movieVo data = new movieVo(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));
			
			list.add(data);
		}
		
		// file.close();
		// 만일 하나 오류가 날 수도 있기때문에 마무리를 지어줘야 한다.
		// 계속 열려있기만 할 뿐 닫지를 않으므로 최종 본에 대해서만 저장이 되기에 기존 열려있는 것들에게서 오류가 난다.
		// try (BufferedReader file = new BufferedReader(new FileReader(path) )) 을 이용하면,
		// close를 안써도 된다. 이 기능은 '자동 반환 기능'이다.
		
		// Exception e - 오류를 회피 하기 위한 예외처리에 사용되는 클래스 중 최상위 클래스
		}catch(Exception e){
			System.out.println("파일 없다");
		}
		
		
		for(movieVo data : list)
				System.out.println(data.toString());
		
		
		
		
		
		
		
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
