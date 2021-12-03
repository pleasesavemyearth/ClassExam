import java.util.*;
public class CustomerTest1 {

	public static void main(String[] args) {
		// 클래스 상속 테스트
		//Customer cus = new Customer(); // 상위클래스 객체생성
		//VIPCustomer vip = new VIPCustomer(); // 하위클래스 객체생성 
		//System.out.println(vip.bonusPoint); // 상위클래스의 멤버변수 사용가능
		//System.out.println(vip.customerID); // protected로 선언되었을 경우 접근가능
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer a1 = new Customer(1001, "이순신");
		Customer a2 = new Customer(1002, "신사임당");
		Customer a3 = new GoldCustomer(1003, "홍길동");
		Customer a4 = new GoldCustomer(1004, "이율곡");
		Customer a5 = new VIPCustomer(1005, "김유신", 1234);
		
		customerList.add(a1);
		customerList.add(a2);
		customerList.add(a3);
		customerList.add(a4);
		customerList.add(a5);
		
		System.out.println("============================================================================");
		for (int i = 0; i < customerList.size(); i++) {
			Customer abc = customerList.get(i); // 주어진 인덱스로 객체 반환
			System.out.println(abc.showCustomerInfo());
		}
		
		System.out.println("============================================================================");
		 for (Customer item : customerList) {
			System.out.println(item.showCustomerInfo());
		 }
		 
		System.out.println("============================================================================");
		 int price = 10000;
		 for (Customer item : customerList) {
			 int cost = item.calcPrice(price); // 금액은 반환되고 보너스는 내부에 적립됨
			 System.out.println(item.getCustomerName() + " : 금액 : " + cost);
		 }
	
		 
		 
		 
		 
		 
	}
	
}
