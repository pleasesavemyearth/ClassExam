
public class Ex1130_3 {

	public static void main(String[] args) {

		Book[] bookArr1 = new Book[3];
		Book[] bookArr2 = new Book[3];
		
		bookArr1[0] = new Book ("1984", "조지오웰"); // 객체 3개 생성
		bookArr1[1] = new Book ("데미안", "헤르만헤세");
		bookArr1[2] = new Book ("어떻게살것인가", "유시민");
		
		String[] strArr = {"자바", "안드로이드", "c", "자바스크립트", "파이썬"}; // 스트링도 객체로 취급해야 함
		
		for (int i = 0 ; i <bookArr2.length ; i++) {
			bookArr2[i] = new Book();
		} //이걸 빼먹어서 에러 났었음.. 디폴트 생성자를 생성 해야 함
		
		// 깊은 복사 (지정된 책을 복사)
		for (int i = 0 ; i < bookArr1.length ; i++) {
			bookArr2[i].setBookName(bookArr1[i].getBookName());
			bookArr2[i].setAuthor(bookArr1[i].getAuthor());
		}
		
		// 원본 사본 출력
		System.out.println("===원본===");
		for (int i = 0 ; i < bookArr1.length ; i++ ) {
			bookArr1[i].showBookInfo();
		}
		
		System.out.println("===사본===");
		for (int i = 0 ; i < bookArr2.length ; i++ ) {
			bookArr2[i].showBookInfo();
		}
		
		// 복사 후 사본의 3번째 책을 자바 홍길동으로 업뎃
		bookArr2[2].setBookName("자바");
		bookArr2[2].setAuthor("홍길동");
		
		// 원본 사본 출력
		System.out.println("===원본===");
		for (int i = 0 ; i < bookArr1.length ; i++ ) {
			bookArr1[i].showBookInfo();
		}
		
		System.out.println("===사본===");
		for (int i = 0 ; i < bookArr2.length ; i++ ) {
			bookArr2[i].showBookInfo();
		}
		
		// 원본의 2번째 책을 자바 김삿갓으로 업뎃
		bookArr1[1].setBookName("자바");
		bookArr1[1].setAuthor("김삿갓");
		
		// 원본 사본 출력
		System.out.println("===원본===");
		for (int i = 0 ; i < bookArr1.length ; i++ ) {
			bookArr1[i].showBookInfo();
		}
		
		System.out.println("===사본===");
		for (int i = 0 ; i < bookArr2.length ; i++ ) {
			bookArr2[i].showBookInfo();
		}
		
		for ( String abc : strArr ) {
			System.out.println(abc + " ");
		}
		System.out.println();
		for (int i = 0 ; i < strArr.length ; i++) {
			System.out.print(strArr[i]); //위에걸 쓸것이냐 이걸 쓸것이냐 선택하면 되는데.. 이걸 권장함
		}
		
		
		
		
		
		
	}

}
