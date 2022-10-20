package kodlamaIODemo.core.logging;

public class EmailLogger implements ILogger{

	@Override
	public void log(String data) {
		System.out.println(data+" Email Yollandı");

		
	}

}
