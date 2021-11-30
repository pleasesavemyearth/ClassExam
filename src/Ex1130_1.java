
public class Ex1130_1 {

	public static void main(String[] args) {
		// 배열 복사
		int[] array1 = {10,20,30,40,50};
		int[] array2 = {1,2,3,4,5};
		
		for(int i=0;i<array2.length;i++) {
			System.out.print(array2[i] + " ");
		} 
		System.out.println();
		// 기본타입의 복사는 톡립적(int, double, float, char,...)
		System.arraycopy(array1, 0, array2, 1, 4);
		for(int i=0;i<array2.length;i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		array1[2] = 300; //배열1 수정
		//배열1 확인 (수정됨)
		for(int i=0;i<array2.length;i++) {
			System.out.println(array1[i] + " ");
		}
		System.out.println();
		// 배열2 리스트하면 변화없음
		for (int i = 0 ; i < array2.length; i++) {
			System.out.println(array2[i] + " ");
		}
		System.out.println();
		
		//------------------------------------------------------------
		// 객체 배열 처리
		Book[] bookArr1 = new Book[3]; // Book 객체를 저장할 배열변수 선언
		Book[] bookArr2 = new Book[3]; // Book 객체를 저장할 배열변수 선언
		
		// Book aaa; // 선언
		// aaa = new Book("aaa", "bbb"); // 생성
		
		bookArr1[0] = new Book ("태백산맥", "조정래"); // 생성
		bookArr1[1] = new Book ("데미안", "헤르만헤세");
		bookArr1[2] = new Book ("어떻게살것인가", "유시민");
		
		System.out.println("---원본---");
		for (int i=0 ; i < bookArr1.length ; i++) {
			bookArr1[i].showBookInfo(); // 원본
		}
		
		System.arraycopy(bookArr1, 0, bookArr2, 0, 3); // 얕은 복사
		
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

