import java.util.*;
public class Ex1130_5 {

	public static void main(String[] args) {
		// ArrayList 클래스 활용
		ArrayList<Book> library = new ArrayList<Book>(); // 제네릭 타입으로 생성
		
		System.out.println("==============");
		for (int i = 0 ; i < library.size() ; i++) {
			//임시변수로 반환
			Book book = library.get(i); // 객체를 반환
			book.showBookInfo();
		}

		//Book abc = new Book("태백산맥", "조정래");
		//library.add(abc);
		
		library.add(new Book("태백산맥", "조정래")); //inline 객체 생성
		library.add(new Book("데미안", "헤르만헤세")); //inline 객체 생성
		library.add(new Book("어떻게살것인가", "유시민")); //inline 객체 생성
		System.out.println("==============");
		for (int i = 0 ; i < library.size() ; i++) {
			//임시변수로 반환
			Book book = library.get(i); // 객체를 반환
			book.showBookInfo();
		}
		System.out.println("==============");
		for ( Book abc : library ) {
			abc.showBookInfo();
		}
		
	}

}
