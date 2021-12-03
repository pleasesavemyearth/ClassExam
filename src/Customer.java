
public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	//����Ʈ ������
	public Customer() {
		initCustomer();
	}
	
	//�����ε��� ������
	public Customer(int customerID, String customerName){
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	//�����ڿ��� ����� �޼���
	private void initCustomer() { //�ܺο��� ���� �Ұ����ϵ���
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //���ʽ� ����Ʈ ������Ʈ, ���� ��ȯ
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + ":" + customerGrade + ":" + bonusPoint;
	}
	
	
	
}
