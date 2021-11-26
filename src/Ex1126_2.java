
public class Ex1126_2 {

	public static void main(String[] args) {
		// 아스키코드 출력(배열에 먼저 저장하고 저장된 배열을 출력)
		char[] alpha = new char[26];
		char ch = '0'; // 저장을 시작핳 문자
		/*
		System.out.println(ch); // A
		System.out.println((int)ch); // 65
		ch++;
		System.out.println(ch);
		*/
		
		
		for(int i = 0 ; i < alpha.length ; i++, ch++) { // 저장 / length(원소?의 길이)
			alpha[i] = ch;
		}
		
		for(int i = 0 ; i < alpha.length ; i++) {
			System.out.println(alpha[i] + "---" + (int)alpha[i]);
		}
		
		
	}

}
