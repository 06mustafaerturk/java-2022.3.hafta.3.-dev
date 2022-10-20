package youtubeEgitim;

public class CustomerManager {
	
	private Customer customer;
	private ICreditManeger creditManeger;
	
	public CustomerManager(Customer customer,ICreditManeger creditManeger) {
	this.customer=customer;	
	this.creditManeger=creditManeger;
	
	}
	 
	public void save() {
		System.out.println("Müşteri Kaydedildi: ");
	
	}
	
	public void delete() {
		System.out.println("Müşteri Silindi: ");
	
	}
	
	public void giveCredit() {
		creditManeger.calculate();
		System.out.println("Kredi Verildi: ");

	}
}
