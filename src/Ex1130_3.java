
public class Ex1130_3 {

	public static void main(String[] args) {

		Book[] bookArr1 = new Book[3];
		Book[] bookArr2 = new Book[3];
		
		bookArr1[0] = new Book ("1984", "��������"); // ��ü 3�� ����
		bookArr1[1] = new Book ("���̾�", "�츣���켼");
		bookArr1[2] = new Book ("��Ի���ΰ�", "���ù�");
		
		String[] strArr = {"�ڹ�", "�ȵ���̵�", "c", "�ڹٽ�ũ��Ʈ", "���̽�"}; // ��Ʈ���� ��ü�� ����ؾ� ��
		
		for (int i = 0 ; i <bookArr2.length ; i++) {
			bookArr2[i] = new Book();
		} //�̰� ���Ծ ���� ������.. ����Ʈ �����ڸ� ���� �ؾ� ��
		
		// ���� ���� (������ å�� ����)
		for (int i = 0 ; i < bookArr1.length ; i++) {
			bookArr2[i].setBookName(bookArr1[i].getBookName());
			bookArr2[i].setAuthor(bookArr1[i].getAuthor());
		}
		
		// ���� �纻 ���
		System.out.println("===����===");
		for (int i = 0 ; i < bookArr1.length ; i++ ) {
			bookArr1[i].showBookInfo();
		}
		
		System.out.println("===�纻===");
		for (int i = 0 ; i < bookArr2.length ; i++ ) {
			bookArr2[i].showBookInfo();
		}
		
		// ���� �� �纻�� 3��° å�� �ڹ� ȫ�浿���� ����
		bookArr2[2].setBookName("�ڹ�");
		bookArr2[2].setAuthor("ȫ�浿");
		
		// ���� �纻 ���
		System.out.println("===����===");
		for (int i = 0 ; i < bookArr1.length ; i++ ) {
			bookArr1[i].showBookInfo();
		}
		
		System.out.println("===�纻===");
		for (int i = 0 ; i < bookArr2.length ; i++ ) {
			bookArr2[i].showBookInfo();
		}
		
		// ������ 2��° å�� �ڹ� ������� ����
		bookArr1[1].setBookName("�ڹ�");
		bookArr1[1].setAuthor("���");
		
		// ���� �纻 ���
		System.out.println("===����===");
		for (int i = 0 ; i < bookArr1.length ; i++ ) {
			bookArr1[i].showBookInfo();
		}
		
		System.out.println("===�纻===");
		for (int i = 0 ; i < bookArr2.length ; i++ ) {
			bookArr2[i].showBookInfo();
		}
		
		for ( String abc : strArr ) {
			System.out.println(abc + " ");
		}
		System.out.println();
		for (int i = 0 ; i < strArr.length ; i++) {
			System.out.print(strArr[i]); //������ �����̳� �̰� �����̳� �����ϸ� �Ǵµ�.. �̰� ������
		}
		
		
		
		
		
		
	}

}
