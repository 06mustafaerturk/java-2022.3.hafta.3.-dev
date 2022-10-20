package youtubeEgitim;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * CreditManager creditManager=new CreditManager(); creditManager.calculate();
		 * creditManager.save();
		 * 
		 * 
		 * Customer customer=new Customer(); customer.id=1; customer.city="Bursa";
		 * 
		 * 
		 * 
		 * 
		 * 
		 * CustomerManager customerManager=new CustomerManager(customer);
		 * customerManager.save(); customerManager.delete();
		 * 
		 * 
		 * Company company = new Company(); company.taxNumber="258963";
		 * company.companyName="Arçelik"; company.id=100;
		 * 
		 * CustomerManager customerManager2=new CustomerManager(new Person());
		 * 
		 * 
		 * 
		 * Person person=new Person(); person.firstName="Mustafa";
		 * person.nationalIdentity="";
		 * 
		 * 
		 * 
		 * Customer c1 =new Customer(); Customer c2=new Person(); Customer c3=new
		 * Company();
		 */
	
		CustomerManager customerManager=new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.giveCredit();
		
	}

}
