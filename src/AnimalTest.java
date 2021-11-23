
public class AnimalTest {
	
	public static void main(String[] args) {
	
		Animal as1 = new Animal(); //이제 출력할땐 항상 get을 한다
		System.out.println(as1.getName() + "의 몸무게는 " + as1.getSize() + "kg 이고, 속도는 " + as1.getSpeed() + "km 이다."); //중요중요중요안함안함내가안함, get으로 불러온다
		
		as1.setName("사자"); //set으로 쓴다
		as1.setSize(150);
		as1.setSpeed(20);
		System.out.println(as1.getName() + "의 몸무게는 " + as1.getSize() + "kg 이고, 속도는 " + as1.getSpeed() + "km 이다.");
		
		Animal as2 = new Animal("호랑이");
		as2.setSize(200);
		as2.setSpeed(30);
		System.out.println(as2.getName() + "의 몸무게는 " + as2.getSize() + "kg 이고, 속도는 " + as2.getSpeed() + "km 이다.");
		
		as2.speedUp(30);
		System.out.println(as2.getName() + "의 몸무게는 " + as2.getSize() + "kg 이고, 속도는 " + as2.getSpeed() + "km 이다."); //속도증가
		as2.speedDown(20);
		System.out.println(as2.getName() + "의 몸무게는 " + as2.getSize() + "kg 이고, 속도는 " + as2.getSpeed() + "km 이다."); //속도다운		
		
		
		Animal as3 = new Animal("코끼리", 100);
		as3.setSpeed(50);
		System.out.println(as3.getName() + "의 몸무게는 " + as3.getSize() + "kg 이고, 속도는 " + as3.getSpeed() + "km 이다.");
		


	}
}
