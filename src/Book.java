
public class Book {
	// �������(�Ӽ�)
	private String bookName; // private�� ������ ���� ���� �Ұ�, get set���� ���� ����
	private String author;
	
	// ������
	public Book() { // default������, �̰� ������ �������ϱ� ������ذŴ�
		
	}
	
	// �����ε��� ������
	public Book(String bookName, String author) {
		this.bookName = bookName; //this�� ������� ����Ŵ
		this.author =  author;
	}
	
	// �޼���
	public String getBookName() { // public Ÿ�� get�����̸�(), get�� return��, get���� �����̸��� �빮�ڷ� �����ؾ� ��(�׷��� �׻� ��������� �ҹ��ڷν�����)
		return bookName;
	}
	public String getAuthor() { //get�� �б⸸ �ϴϱ� �Ű������� ���� ��ȯ�ؾ��Ѵ�, set�� ��� �ϴϱ� �´� Ÿ������ �Ű������� �ְ� ��ȯ���� �ʴ´�
		return author;
	}
	public void setBookName(String bookName) { // public void set�����̸�(Ÿ�� �������) ���� ������� = �Ű�����
		this.bookName = bookName;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void showBookInfo() {
		System.out.println(getBookName() + ", " + getAuthor());
	}
	// �����ε��� �޼���
	
	// ������(������ ����) public static void main
	
	
}
