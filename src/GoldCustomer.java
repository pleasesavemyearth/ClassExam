
public class GoldCustomer extends Customer {

	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName); //�θ�Ŭ������ ������ ȣ��( ����Ʈ �����ڴ� �ڵ����� ȣ��, �ƴѰŴ� �ڵ�ȣ�� �ȵ� )
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;	
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //���ʽ� ����Ʈ ������Ʈ, ���� ��ȯ
		return price - (int)(price * saleRatio);
	}
	// showCustomerInfo() �޼���� ����Ŭ���� �״�� ���	
	
}
