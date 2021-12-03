import java.util.*;
public class CustomerTest1 {

	public static void main(String[] args) {
		// Ŭ���� ��� �׽�Ʈ
		//Customer cus = new Customer(); // ����Ŭ���� ��ü����
		//VIPCustomer vip = new VIPCustomer(); // ����Ŭ���� ��ü���� 
		//System.out.println(vip.bonusPoint); // ����Ŭ������ ������� ��밡��
		//System.out.println(vip.customerID); // protected�� ����Ǿ��� ��� ���ٰ���
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer a1 = new Customer(1001, "�̼���");
		Customer a2 = new Customer(1002, "�Ż��Ӵ�");
		Customer a3 = new GoldCustomer(1003, "ȫ�浿");
		Customer a4 = new GoldCustomer(1004, "������");
		Customer a5 = new VIPCustomer(1005, "������", 1234);
		
		customerList.add(a1);
		customerList.add(a2);
		customerList.add(a3);
		customerList.add(a4);
		customerList.add(a5);
		
		System.out.println("============================================================================");
		for (int i = 0; i < customerList.size(); i++) {
			Customer abc = customerList.get(i); // �־��� �ε����� ��ü ��ȯ
			System.out.println(abc.showCustomerInfo());
		}
		
		System.out.println("============================================================================");
		 for (Customer item : customerList) {
			System.out.println(item.showCustomerInfo());
		 }
		 
		System.out.println("============================================================================");
		 int price = 10000;
		 for (Customer item : customerList) {
			 int cost = item.calcPrice(price); // �ݾ��� ��ȯ�ǰ� ���ʽ��� ���ο� ������
			 System.out.println(item.getCustomerName() + " : �ݾ� : " + cost);
		 }
	
		 
		 
		 
		 
		 
	}
	
}
