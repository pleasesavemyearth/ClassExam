import java.util.*;
class Animals {
	
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animals {
	public void move() { // �޼��� �������̵�
		System.out.println("����� �����Դϴ�.");
	}	
	
	public void readBook() {
		System.out.println("å�� �д´�.");  //����� ���� ����
	}
	
}

class Tiger extends Animals {
	public void move() { // �޼��� �������̵�
		System.out.println("ȣ���̰� �����Դϴ�.");
	}	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �Ѵ�.");
	}
}

class Eagle extends Animals {
	public void move() { // �޼��� �������̵�
		System.out.println("�������� �����Դϴ�.");
	}	
	public void flying() {
		System.out.println("�������� ���ư���.");
	}
}


public class AnimalsTest { //���ϸ�� ������ Ŭ������ public�ʿ�(��1��)

	public static void main(String[] args) {
		AnimalsTest aTest = new AnimalsTest();
		
		Animals[] animalArr = new Animals[10]; // �迭 ��ü ����
		
		for ( int i = 0 ; i < 3 ; i++) {
			animalArr[i] = new Human();
		}
		for ( int i = 3 ; i < 5 ; i++) {
			animalArr[i] = new Tiger();
		}
		for ( int i = 5 ; i < 10 ; i++) {
			animalArr[i] = new Eagle();
		}
		
		for (int i = 0 ; i < 10 ; i++) {
			aTest.moveAnimal(animalArr[i]);
		}
		
		System.out.println("-------------");
		//move �޼��� ȣ��
		for (int i = 0; i < animalArr.length; i++) {
			//animalArr[i].move();
		}
		
		System.out.println("-------------");
		
//		Human a1 = new Human();
//		Tiger a2 = new Tiger();
//		Eagle a3 = new Eagle();  -> �̷��� ����� �޼��嵵 ���ϼ��� ����, �迭�� ���� ���� ���(Ÿ���� �ٸ��ϱ�) �����ϴ�.
//		                           //�׷���, �Ʒ��� ���� Ÿ���� ���� ������� �迭�� ����� �޼��嵵 �����Ͽ� �ҷ����� �ϴ°���!
//	
//		Animals a1 = new Human();
//		Animals a2 = new Tiger();
//		Animals a3 = new Eagle();
//
//		aTest.moveAnimal(a1); 
//		aTest.moveAnimal(a2);
//		aTest.moveAnimal(a3);
//		
//		}
	
		//-----------------------------------------------------------
		ArrayList<Animals> aniList = new ArrayList<Animals>();
		aniList.add(new Human());  //��ü �����ϸ鼭 �迭�� �߰�
		aniList.add(new Tiger());
		aniList.add(new Eagle());
	
	
		
		for (Animals item : aniList ) {
			item.move(); //�������� ���� ������ �޼��� ȣ��
		}
		for (int i = 0; i< aniList.size(); i++) {
			Animals item = aniList.get(i);
			if (item instanceof Human) {
				Human h = (Human)item; // �ٿ�ĳ����
				h.readBook(); //�ٿ�ĳ���� �Ǿ����Ƿ� ������ �޼��� ��밡��
			} else if (item instanceof Tiger) {
				Tiger t = (Tiger)item;
				t.hunting();
			} else if (item instanceof Eagle) {
				Eagle e = (Eagle)item;
				e.flying();
			} else {
				System.out.println("�˼����� ��������");
			}
		}
	} /*�߰�ȣ �ϳ� ������....����*/
	
	//-----------------------------------------------------------


	public void moveAnimal(Animals animal) {
		animal.move(); //������, ������ �ٸ� ���� �����Ѵ�. ������ move�� �Ȱ��� �޼���� ȣ���ϴ� ���̴�.
	}

}



