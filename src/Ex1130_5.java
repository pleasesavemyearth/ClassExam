import java.util.*;
public class Ex1130_5 {

	public static void main(String[] args) {
		// ArrayList Ŭ���� Ȱ��
		ArrayList<Book> library = new ArrayList<Book>(); // ���׸� Ÿ������ ����
		
		System.out.println("==============");
		for (int i = 0 ; i < library.size() ; i++) {
			//�ӽú����� ��ȯ
			Book book = library.get(i); // ��ü�� ��ȯ
			book.showBookInfo();
		}

		//Book abc = new Book("�¹���", "������");
		//library.add(abc);
		
		library.add(new Book("�¹���", "������")); //inline ��ü ����
		library.add(new Book("���̾�", "�츣���켼")); //inline ��ü ����
		library.add(new Book("��Ի���ΰ�", "���ù�")); //inline ��ü ����
		System.out.println("==============");
		for (int i = 0 ; i < library.size() ; i++) {
			//�ӽú����� ��ȯ
			Book book = library.get(i); // ��ü�� ��ȯ
			book.showBookInfo();
		}
		System.out.println("==============");
		for ( Book abc : library ) {
			abc.showBookInfo();
		}
		
	}

}
