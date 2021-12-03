
public class VIPCustomer extends Customer {
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); //부모클래스와 생성자 호출( 디폴트 생성자는 자동으로 호출, 아닌거는 자동호출 안됨 )
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	// 메서드 오버라이딩
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //보너스 포인트 업데이트, 가격 반환
		return price - (int)(price * saleRatio);
	}
	
	// 메서드 오버라이딩
	public String showCustomerInfo() {
		return super.showCustomerInfo() + ":" + agentID;
	}
	
	
	
	
	
}
