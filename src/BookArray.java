
public class BookArray {

	public static void main(String[] args) {
		// Book array test
		Book[] library = new Book[5]; // book 객체를 저장할 수 있는 배열객체 생성
	
		
		for(int i = 0; i < library.length; i++) { // 0~4에 저장되는데 저장될 값이 없어서 null값 뜬다
			System.out.println(library[i]);
		}
		

		library[0] = new Book("태백산맥", "조정래"); // 객체생성하여 배열에 저장
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생텍쥐페리");
		
		for (int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		for(int i = 0; i < library.length; i++) { // 객체를 저장한 메모기 공간 주소, 힙 영역, 이렇게 힙 영역. 메모리공간에 저장을 함
			System.out.println(library[i]);
		}
		
	}

}
