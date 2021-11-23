
public class ScoreTest {

	public static void main(String[] args) {
		Score s1 =  new Score();
		System.out.println(s1.getName() + "의 국어 : " + s1.getKorean() + " , 영어 : " + s1.getEnglish() + " , 수학 : " + s1.getMath() + " , 총점 : " + s1.getSum() + " , 평균 : " + s1.getAvg());
		
		s1.setName("김삿갓"); //set생각을 못함 .,.쓰기
		s1.setKorean(93);
		s1.setEnglish(78);
		s1.setMath(81);
		System.out.println(s1.getName() + "의 국어 : " + s1.getKorean() + " , 영어 : " + s1.getEnglish() + " , 수학 : " + s1.getMath() + " , 총점 : " + s1.getSum() + " , 평균 : " + s1.getAvg());
		
		Score s2 = new Score("이도령", 84, 91, 79);
		System.out.println(s2.getName() + "의 국어 : " + s2.getKorean() + " , 영어 : " + s2.getEnglish() + " , 수학 : " + s2.getMath() + " , 총점 : " + s2.getSum() + " , 평균 : " + s2.getAvg());
		
		s2.setEnglish(99); //이도령의 영어점수 변경을 해야할 상황이다. 그래서 set으로 변경한후 결과를 테스트하였다. 이런 경우 때문에 멤버변수에 총점, 평균을 설정하는 것이 안좋음, 해버리면 결과값이 이상하게나올수있음
		System.out.println(s2.getName() + "의 국어 : " + s2.getKorean() + " , 영어 : " + s2.getEnglish() + " , 수학 : " + s2.getMath() + " , 총점 : " + s2.getSum() + " , 평균 : " + s2.getAvg());
	
	
	
	}

}
