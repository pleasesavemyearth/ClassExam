
public class Person {
	String name; //�������
	int height;
	int weight;
	
	//�����ڰ� 1���� ���� ��� default �����ڰ� �����Ѵ�
	
	/*������ �ۼ� ��Ģ
	  Ŭ������� ����, ��ȯŸ���� ����(������ü�� ����), ��������� default������ �ʿ� */
	public Person() {
		
	}//�̷� �� �����⸦ �������
	
	//�����ε��� ������
	public Person(String pName) { //������ �̸��� ����, �Ű����� �ٸ�(����, Ÿ��, ����)
		name = pName; //��� �̸��� �Ű������� �Է¹޾Ƽ� personŬ������ �����ϴ� ������------�̰� hu2
	}
	
	//�����ε��� ������
	public Person(String pName, int pHeight, int pWeight) { //�̸�, Ű, �����Ը� �Ű������� �Է¹޴� ������---hu3
		name = pName;
		height = pHeight;
		weight = pWeight;
	}
	//�����ڴϱ� Ÿ���� ���°��� ���⼭���� �Ϲ����� �޼ҵ��̴�
	public String getName() {
		return name;
	}
	
	
	//Ű�� �����Ը� ���� ������ �� �ִ� �޼ҵ� �߰�
	public int getHeight() { //������ get �б�
		return height;
	}
	public int getWeight() {
		return weight;
	}
	
	
	//����, Ű, �����Ը� ������ �� �ִ� �޼ҵ� �߰� 
	public void setPerson(String pName, int pHeight, int pWeight) { //������ set ����
		name = pName;
		height = pHeight;
		weight = pWeight;
		return; // ���� ��ȯ �׷��� ���� ����
	}
	
	
	/*Car class ���� �� ���
	 �� �̸�, �ӵ��� ��������� / �� �̸����� �������� / �� �̸�, �ӵ��� �������� / �μ�(����) ���� ���� ���� / �� �̸�, �ӵ� ���� �б�/ �� �̸�, �ӵ� ���� ���� / ���̸�, �ӵ� ���� ���� / 
	 �־��� ������ �ӵ� ���� / �־��� ������ �ӵ� ���� / �μ����� �������� ��� �⺻�� ����(���̸��� �ӵ��� ���� '�ڵ���', 150 �̷���) / ������ Ŭ�������� ��ü�����ϰ� �׽�Ʈ(5��)*/
	
	
	
}
