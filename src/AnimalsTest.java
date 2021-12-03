import java.util.*;
class Animals {
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animals {
	public void move() { // 메서드 오버라이딩
		System.out.println("사람이 움직입니다.");
	}	
	
	public void readBook() {
		System.out.println("책을 읽는다.");  //리드북 새로 생성
	}
	
}

class Tiger extends Animals {
	public void move() { // 메서드 오버라이딩
		System.out.println("호랑이가 움직입니다.");
	}	
	public void hunting() {
		System.out.println("호랑이가 사냥을 한다.");
	}
}

class Eagle extends Animals {
	public void move() { // 메서드 오버라이딩
		System.out.println("독수리가 움직입니다.");
	}	
	public void flying() {
		System.out.println("독수리가 날아간다.");
	}
}


public class AnimalsTest { //파일명과 동일한 클래스는 public필요(단1개)

	public static void main(String[] args) {
		AnimalsTest aTest = new AnimalsTest();
		
		Animals[] animalArr = new Animals[10]; // 배열 객체 생성
		
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
		//move 메서드 호출
		for (int i = 0; i < animalArr.length; i++) {
			//animalArr[i].move();
		}
		
		System.out.println("-------------");
		
//		Human a1 = new Human();
//		Tiger a2 = new Tiger();
//		Eagle a3 = new Eagle();  -> 이렇게 만들면 메서드도 통일성이 없고, 배열을 만들 수도 없어서(타입이 다르니까) 불편하다.
//		                           //그래서, 아래와 같이 타입을 같이 묶어놓고 배열도 만들고 메서드도 공유하여 불러오고 하는거지!
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
		aniList.add(new Human());  //객체 생성하면서 배열에 추가
		aniList.add(new Tiger());
		aniList.add(new Eagle());
	
	
		
		for (Animals item : aniList ) {
			item.move(); //다형성에 의해 각각의 메서드 호출
		}
		for (int i = 0; i< aniList.size(); i++) {
			Animals item = aniList.get(i);
			if (item instanceof Human) {
				Human h = (Human)item; // 다운캐스팅
				h.readBook(); //다운캐스팅 되었으므로 독립된 메서드 사용가능
			} else if (item instanceof Tiger) {
				Tiger t = (Tiger)item;
				t.hunting();
			} else if (item instanceof Eagle) {
				Eagle e = (Eagle)item;
				e.flying();
			} else {
				System.out.println("알수없는 오류란다");
			}
		}
	} /*중괄호 하나 빠져서....에러*/
	
	//-----------------------------------------------------------


	public void moveAnimal(Animals animal) {
		animal.move(); //다형성, 실제로 다른 일을 실행한다. 각각의 move를 똑같은 메서드로 호출하는 셈이다.
	}

}



