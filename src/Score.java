
public class Score {

	String name;
	int korean;
	int english;
	int math;
	int sum;
	int avg;
	
	public Score() { // ����Ʈ ������ (����Ʈ = �μ��� ���ٴ� ��)
		name = "ȫ�浿";
		korean = 70;
		english = 70;
		math = 70;
	}
	
	public Score(String pName, int pKorean, int pEnglish, int pMath) { // �����ε� ������ (��� ����)
		name = pName;
		korean = pKorean;
		english = pEnglish;
		math = pMath;
	}
	
	//�޼ҵ�, set-void ���� / get-Ÿ�� �б�
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
	public void setSum(int pSum) {
		sum = pSum;
	}
	public void setAvg(int pAvg) {
		avg = pAvg;
	}
	
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
	public int getSum() { //���⼭����..~~
		sum = korean + english + math;
		return sum;
	}
	public int getAvg() {
		avg = ( korean + english + math) / 3;
		return avg;
	}


	/*�޼ҵ� ����
	public int sum() { //����
		sum = korean + english + math;
		return sum;
	}
	
	public int avg() { //���
		avg = ( korean + english + math) / 3;
	} ��� �س��� �̷��� �����µ� ������ �ߺ��Ǿ �̰� �ƴϰ� ���� ó�� �ϸ� test���� ����� ����*/
	
	
	
}
