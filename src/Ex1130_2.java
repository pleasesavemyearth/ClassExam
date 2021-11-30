
public class Ex1130_2 {

	public static void main(String[] args) {
		// 깊은 복사 (일반적인 복사)
		// 객체 배열 처리
		Book[] bookArr1 = new Book[3]; // Book 객체를 저장할 배열변수 선언
		Book[] bookArr2 = new Book[3]; // Book 객체를 저장할 배열변수 선언
		
		
		bookArr1[0] = new Book ("태백산맥", "조정래"); // 생성
		bookArr1[1] = new Book ("데미안", "헤르만헤세");
		bookArr1[2] = new Book ("어떻게살것인가", "유시민");
		
		/*
		for (int i = 0 ; i <bookArr2.length ; i++) {
			bookArr2[i] = new Book(); // 일단 디폴트 생성자로 생성해둠
		}
		*/
		
		for (int i = 0 ; i < bookArr2.length; i++) {
			bookArr2[i] = new Book ("자바프로그래밍", "홍길동"); //아무거나 생성, 실행 된다
		}
		
		System.out.println("---원본---");
		for (int i=0 ; i < bookArr1.length ; i++) {
			bookArr1[i].showBookInfo(); // 원본
		}
		System.out.println("---사본---");
		for (int i=0 ; i < bookArr2.length ; i++) {
			bookArr2[i].showBookInfo(); // 이 자체가 출력문 , 사본	
		}
		
		
		
		// 깊은 복사
		for (int i = 0 ; i <bookArr1.length; i++) { // 원본 배열 길이만큼 배열 (저장)
			bookArr2[i].setBookName(bookArr1[i].getBookName());
			bookArr2[i].setAuthor(bookArr1[i].getAuthor());
		} 

		System.out.println("---원본---");
		for (int i=0 ; i < bookArr1.length ; i++) {
			bookArr1[i].showBookInfo(); // 원본
		}
		System.out.println("---사본---");
		for (int i=0 ; i < bookArr2.length ; i++) {
			bookArr2[i].showBookInfo(); // 이 자체가 출력문 , 사본	
		}
		
		
		
		bookArr1[0].setBookName("나목"); // 원본 수정
		bookArr1[0].setAuthor("박완서");
		
		System.out.println("---원본---");
		for (int i=0 ; i < bookArr1.length ; i++) {
			bookArr1[i].showBookInfo(); // 원본
		}
		System.out.println("---사본---");
		for (int i=0 ; i < bookArr2.length ; i++) {
			bookArr2[i].showBookInfo(); // 이 자체가 출력문 , 사본	
		}
		
		
		
	}

}
