
public class Ex1123_1 {
	//사칙연산기
	int result; //연산결과저장, 멤버변수
	int num1; //계산에 사용되는 왼쪽 속성
	int num2; //오른쪽 속성
	//디폴트 생성자를 반드시 구현(내용은 없어도 됨)
	public Ex1123_1() { //디폴트 생성자
		
	}
	
	
	//생성자가 없는 상태에서 코드를 부여하면 디폴트 생성자가 생김 //인수가 생기면 오버로딩된 생성자
	//생성자(클래스명과 동일, 반환타입 없음, 나머지는 메서듸 정의 방법과 동일 을 암기)->이 규칙에 허용되지 않으면 다 메서드
	public Ex1123_1(int n1, int n2) { //이건 디폴트 생성자임, 최소한 값 3개는 다루려고 함으로 
		//반환타입 없으니 리턴도 없다
		//여기에 멀쓰냐면 속성에다가 정보를 주는것이다
		num1 = n1;
		num2 = n2; //이 문장이 필요
		//값 2개받아ㅓㅅ 멤버변수에 딱 저장
	}
	
	//set쓰기 get읽기
	//데이터 쓰기, result는 결과로만 얻어지니까 set은 쓰면안된다 주의주의주의주의) set은 void, get은 타입이 있어야함
	public void setNum1(int n1) {
		num1 = n1;
	}
	
	public void setNum2(int n2) {
		num2 = n2;
	}
	
	//데이터 읽기 //타입이 왜 int야 하냐 //result해도되지만 어차피 결과로 나오니까 안해도 된다
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}
	
	//메서드 ??????????왜이렇게하지
	public int add() {
		result = num1+num2;
		return result;
	}
	
	public int subtract() {
		result = num1-num2;
		return result;
	}
	
	public int multiply() {
		result = num1 * num2;
		return result;
	}
	
	public int divide() {
		result = num1 / num2;
		return result;
	}
	
	
	//덧셈 메서드 (오버로딩이 된)
	public int add(int n1, int n2) { /*호출하기위한 명칭을 add라고 함, 반환타입 정수형(int add), 공개되야 호출할수있다 (public)
	즉, public 반환타입 메서드명(매개변수 리스트)*/
		num1 = n1; //왼쪽 속성, 오른쪽 지역변수 지역변수는 임시적인 느낌이어서
		num2 = n2;
		result = num1 + num2; //덧셈실행
		return result; //int선언하고있는데 아무것도 안주니까 리턴쓰면 오류가 안난다
	}
	
	
	//뺄셈 메서드
	public int subtract(int n1, int n2) { //n1, n2는 지역변수, 메서드 내부에서만 인식할 수 있는 변수
		num1 = n1; 
		num2 = n2;
		result = n1 - n2;
		return result;
	}
	
	
	//곱셈 메서드
	public int multiply(int n1, int n2) {
		num1 = n1; 
		num2 = n2;
		result = n1 * n2;
		return result;
	}
	
	
	//나눗세 메서드
	public int divide(int n1, int n2) {
		num1 = n1; 
		num2 = n2;
		result = n1 / n2;
		return result;
	}
	
	
	
}
