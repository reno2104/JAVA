package 코딩테스트_준비;


public class 문제4 {

	public static void main(String[] args) {
		
	
	
	int[] array = {149, 180, 192, 170};
	int height = 167;
	int answer = 0;
	
	for(int i=0; i<array.length; i++) {
		int 학생키 = array[i];
		if(height < 학생키) {
			++answer;
		}
}
	System.out.println("머쓱이보다 키 큰 사람 수 : "+answer);

	}
}