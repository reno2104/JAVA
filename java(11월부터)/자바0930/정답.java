package 자바0930;

public class 정답 {

	public static int getEnglishWord(String word) {
		String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		for(int i=0; i<arr.length; i++) {
			System.out.println(word);
			if(arr[i].equals(word)) {
				return numArr[i];
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		/*
		 *  "one4seveneight"	1478
			"23four5six7"	234567
			"2three45sixseven"	234567
			"123"	123
		 */
		String s = "one4seveneight";
		String word = "";
		int answer = 0;
		
		for(int i=0; i<s.length(); i++) {
			int ascii = s.charAt(i);
			if(ascii >= 48 && ascii <= 57) {
				System.out.println(i+" 번째는 숫자입니다.");
			}else {
				word += Character.toString(s.charAt(i));
				if(word.length() >= 3) {
					int englishWord = getEnglishWord(word);
					System.out.println(englishWord);
					
				}
			}
		}
		System.out.println("결과는 : "+answer);
	}
}