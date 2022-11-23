package movie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class movie_main {

	public static void main(String[] args) {
		
		List<movieVo> list = new ArrayList<>();
		
		String path="c:/test/movie.txt";
		
		try( BufferedReader file = new BufferedReader(new FileReader(path)) )
		{
		
			while(true) {
				String line = file.readLine();
				if(line==null) break;
				String[] temp = line.split(" ");
				movieVo data = new movieVo(temp[0], 
						Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));
				list.add(data);
			}
			
		//	file.close();
		
		}catch(Exception e) {
			System.out.println("파일 없다");
		}
		
		
		
		for(movieVo data : list)
			System.out.println(  data.toString() );
		

		
//		
//		movieVo[] arr = new movieVo[4];
//		arr[0] = new movieVo("한산",2022,15);
//		arr[1] = new movieVo("한산",2022,15);
//		arr[2] = new movieVo("한산",2022,15);
//		arr[3] = new movieVo("한산",2022,15);
//		
//		for(movieVo data :arr)
//			data.out();
	}

}


/*
 영화 총 4개 입력 하여  출력까지
 
*/