
public class PersonTest {

	public static void main(String[] args) {
		// Person class test
		Person hu1 = new Person(); /*default ������, ���Ǿ������� ������ ���� �׷��� �����ε��� �����ڰ� �ϳ��̻� �����ϸ� default�����ڵ� ��������� ��
								     �� ������� �ϳ� ������ ������ ����*/
		Person hu2 = new Person("ȫ�浿"); //�Ű����� 1�� ������
		System.out.println(hu2.getName());
		
		//�߰��� �޼ҵ� ��� �׽�Ʈ
		Person hu3 = new Person("���", 170, 70); //���ڴ� �׳ɵ�, ���谡 3���������Ƿ� 3���� �־�� ��
		System.out.println("���� : " + hu3.getName() + ", Ű : " + hu3.getHeight() + ", ������ : " + hu3.getWeight()); 
		
		hu3.setPerson("���", 160, 80); //����, Ű, ������ ���� ��, set
		System.out.println("���� : " + hu3.getName() + ", Ű : " + hu3.getHeight() + ", ������ : " + hu3.getWeight()); 
		
		hu1.setPerson("�̵���", 150, 50); //h1�� ����ִ� ���¿��� �����۾��� ��, �� ��ü ����
		System.out.println("���� : " + hu1.getName() + ", Ű : " + hu1.getHeight() + ", ������ : " + hu1.getWeight()); 
		
		
	}

}
