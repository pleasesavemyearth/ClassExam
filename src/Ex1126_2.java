
public class Ex1126_2 {

	public static void main(String[] args) {
		// �ƽ�Ű�ڵ� ���(�迭�� ���� �����ϰ� ����� �迭�� ���)
		char[] alpha = new char[26];
		char ch = '0'; // ������ �����K ����
		/*
		System.out.println(ch); // A
		System.out.println((int)ch); // 65
		ch++;
		System.out.println(ch);
		*/
		
		
		for(int i = 0 ; i < alpha.length ; i++, ch++) { // ���� / length(����?�� ����)
			alpha[i] = ch;
		}
		
		for(int i = 0 ; i < alpha.length ; i++) {
			System.out.println(alpha[i] + "---" + (int)alpha[i]);
		}
		
		
	}

}
