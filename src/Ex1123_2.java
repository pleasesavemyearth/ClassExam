
public class Ex1123_2 {

	public static void main(String[] args) {
		/*인스턴스 생성해야 클래스 사용 가능
		//클래스명 변수명 = new 생성자
		//생성자를 생성안했을경우 디폴트생성자 자동으로 만들어짐, 디폴트생성자는 클래스명과 동일하고 매개변수가 없음
		첫선째 객체*/
		Ex1123_1 cal1 = new Ex1123_1(); //매개변수가 없다는건 바로 열고닫고, 클래스명 변수명 = new 생성자(근데 쓸 클래스명을 잘 생각)
		System.out.println(cal1.num1); //메서드 말고 속성으로 접근
		System.out.println(cal1.num1);
		System.out.println(cal1.result);
		System.out.println(cal1.add(10, 20)); // 변수명.메서드명(매개변수)
		
		
		int test = cal1.add(1, 1); //결과가 test에 반환, 
		System.out.println(test);
		
		//곱셈 결과
		/*int test1 = cal1.multiply(2,5); 
		System.out.println(test1); 아니다*/
		System.out.println(cal1.multiply(2, 5));
		
		System.out.println(cal1.num1); //num1 = n1 등 써줬더니 마지막 썻던 변수?들이 저장되어있음 
		System.out.println(cal1.num2);
		System.out.println(cal1.result); //마지막 실행을 결과로서 저장한다
		
		//두번째 객체 생성 및 테스트
		Ex1123_1 cal2 = new Ex1123_1(3, 5); //객체 생성 or 인스턴스 생성
		System.out.println(cal2.add());	
		System.out.println(cal2.subtract());
		System.out.println(cal2.multiply());
		System.out.println(cal2.divide());
		System.out.println(cal2.add(6,7));	
		
		
		//세번째 객체 생성 및 테스트
		Ex1123_1 cal3 = new Ex1123_1(10,5);
		/*System.out.println(cal3.num1 + " + " + cal3.num2 + " = " + cal3.add()); 오답 앞으로는 num1,,등에 접근 못하게 막을거기 때문에 get을 써서 해야함*/
		System.out.println(cal3.getNum1() + " + " + cal3.getNum2() + " = " + cal3.add());
		
		//네번째 객체 생성 및 테스트
		//디폴트 생성자로 생성 후 매개변수(9,10) 추가하고 곱셈출력 테스트
		//Ex1123_1 cal4 = new Ex1123_1(9,10); 디폴트니까 값을주면안댐, 오답
		Ex1123_1 cal4 = new Ex1123_1();
		cal4.setNum1(9); //1시트에서 set쓴거 이것들을 써 줘야 함, 디폴트 생성자하고...매개변수 안넣고 이거 쓰고 
		cal4.setNum2(10); //즉, set한뒤에 get한다
		System.out.println(cal4.getNum1() + " * " + cal4.getNum2() + " = " + cal4.multiply());
		
		
	}

}
