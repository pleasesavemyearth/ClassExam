
public class AnimalTest {
	
	public static void main(String[] args) {
	
		Animal as1 = new Animal(); //���� ����Ҷ� �׻� get�� �Ѵ�
		System.out.println(as1.getName() + "�� �����Դ� " + as1.getSize() + "kg �̰�, �ӵ��� " + as1.getSpeed() + "km �̴�."); //�߿��߿��߿���Ծ��Գ�������, get���� �ҷ��´�
		
		as1.setName("����"); //set���� ����
		as1.setSize(150);
		as1.setSpeed(20);
		System.out.println(as1.getName() + "�� �����Դ� " + as1.getSize() + "kg �̰�, �ӵ��� " + as1.getSpeed() + "km �̴�.");
		
		Animal as2 = new Animal("ȣ����");
		as2.setSize(200);
		as2.setSpeed(30);
		System.out.println(as2.getName() + "�� �����Դ� " + as2.getSize() + "kg �̰�, �ӵ��� " + as2.getSpeed() + "km �̴�.");
		
		as2.speedUp(30);
		System.out.println(as2.getName() + "�� �����Դ� " + as2.getSize() + "kg �̰�, �ӵ��� " + as2.getSpeed() + "km �̴�."); //�ӵ�����
		as2.speedDown(20);
		System.out.println(as2.getName() + "�� �����Դ� " + as2.getSize() + "kg �̰�, �ӵ��� " + as2.getSpeed() + "km �̴�."); //�ӵ��ٿ�		
		
		
		Animal as3 = new Animal("�ڳ���", 100);
		as3.setSpeed(50);
		System.out.println(as3.getName() + "�� �����Դ� " + as3.getSize() + "kg �̰�, �ӵ��� " + as3.getSpeed() + "km �̴�.");
		


	}
}
