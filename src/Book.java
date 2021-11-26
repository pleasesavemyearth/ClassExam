
public class Book {
	// 멤버변수(속성)
	private String bookName; // private로 막으니 직접 접근 불가, get set으로 접근 가능
	private String author;
	
	// 생성자
	public Book() { // default생성자, 이게 없으면 에러나니까 만들어준거다
		
	}
	
	// 오버로딩된 생성자
	public Book(String bookName, String author) {
		this.bookName = bookName; //this는 멤버변수 가르킴
		this.author =  author;
	}
	
	// 메서드
	public String getBookName() { // public 타입 get변수이름(), get은 return함, get다음 변수이름은 대문자로 시작해야 함(그래서 항상 멤버변수는 소문자로시작함)
		return bookName;
	}
	public String getAuthor() { //get은 읽기만 하니까 매개변수가 없고 반환해야한다, set은 줘야 하니까 맞는 타입으로 매개변수가 있고 반환하지 않는다
		return author;
	}
	public void setBookName(String bookName) { // public void set변수이름(타입 멤버변수) 쓰고 멤버변수 = 매개변수
		this.bookName = bookName;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void showBookInfo() {
		System.out.println(getBookName() + ", " + getAuthor());
	}
	// 오버로딩된 메서드
	
	// 진입점(보통은 없다) public static void main
	
	
}
