
public class BookArray {

	public static void main(String[] args) {
		// Book array test
		Book[] library = new Book[5]; // book ��ü�� ������ �� �ִ� �迭��ü ����
	
		
		for(int i = 0; i < library.length; i++) { // 0~4�� ����Ǵµ� ����� ���� ��� null�� ���
			System.out.println(library[i]);
		}
		

		library[0] = new Book("�¹���", "������"); // ��ü�����Ͽ� �迭�� ����
		library[1] = new Book("���̾�", "�츣�� �켼");
		library[2] = new Book("��� �� ���ΰ�", "���ù�");
		library[3] = new Book("����", "�ڰ渮");
		library[4] = new Book("�����", "�������丮");
		
		for (int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		for(int i = 0; i < library.length; i++) { // ��ü�� ������ �޸�� ���� �ּ�, �� ����, �̷��� �� ����. �޸𸮰����� ������ ��
			System.out.println(library[i]);
		}
		
	}

}
