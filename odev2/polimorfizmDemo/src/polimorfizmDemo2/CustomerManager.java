package polimorfizmDemo2;

public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger baseLogger) {
		this.logger=baseLogger;
		
	}
	public void add() {
		System.out.println("Müşteri Eklendi");
		this.logger.log("logologologo");
		  

		
	}
	
}
