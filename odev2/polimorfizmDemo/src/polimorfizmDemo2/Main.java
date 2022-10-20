package polimorfizmDemo2;

public class Main {

	public static void main(String[] args) {
//		EmailLogger emailLogger=new EmailLogger();
//		emailLogger.log("Log Mesajı");
		
		/*
		 * BaseLogger[] loggers=new BaseLogger[] {new FileLogger(),new EmailLogger(),new
		 * DatabaseLogger(),new ConsoleLogger()}; for(BaseLogger logger:loggers) {
		 * logger.log("Log Mesajı"); }
		 */
		
		CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
