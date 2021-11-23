
public class Score {
//멤버변수가 많아지면 프로그램이 꼬임, 멤머변수는 최소한으로 하고 메소드를 강화시켜야 함
	String name; 
	int korean;
	int english;
	int math;
	/*int sum;
	double avg; 좋지 않음*/
	
	public Score() { // 디폴트 생성자 (디폴트 = 인수가 없다는 뜻)
		name = "홍길동";
		korean = 70;
		english = 70;
		math = 70;
	}
	
	public Score(String pName, int pKorean, int pEnglish, int pMath) { // 오버로딩 생성자 (모든 정보)
		name = pName;
		korean = pKorean;
		english = pEnglish;
		math = pMath;
	}
	
	//메소드, set-void 쓰기 / get-타입 읽기
	public void setName(String pName) {
		name = pName;
	}
	public void setKorean(int pKorean) {
		korean = pKorean;
	}
	public void setEnglish(int pEnglish) {
		english = pEnglish;
	}
	public void setMath(int pMath) {
		math = pMath;
	}
	/*public void setSum(int pSum) {
		sum = pSum;
	}
	public void setAvg(int pAvg) {
		avg = pAvg;
	}*/
	
	public String getName() {
		return name;
	}
	public int getKorean() {
		return korean;
	}
	public int getEnglish() {
		return english;
	}
	public int getMath() {
		return math;
	}
	
	
	public int getSum() {
		return korean + english + math;
	}
	public double getAvg() {
		return getSum() / 3; // 또는 (double)getSum()/3 또는 getSum()/3.0
	}
	
	
	
	/* 이건 맞지만 좋지않음
	 public int getSum() { //여기서부터..~~
	 
		sum = korean + english + math;
		return sum; //return을 빼먹어서 나오지 않았었음
	}
	public double getAvg() {
		avg = ( korean + english + math) / 3;
		return avg;
	}*/


	/*메소드 정의 이건 오답
	public int sum() { //총점
		sum = korean + english + math;
		return sum;
	}
	
	public int avg() { //평균
		avg = ( korean + english + math) / 3;
	} 라고 해놓고 이렇게 적엇는데 위에라 중복되어서 이건 아니고 위에 처럼 하면 test값이 제대로 나옴*/
	
	
	
}
