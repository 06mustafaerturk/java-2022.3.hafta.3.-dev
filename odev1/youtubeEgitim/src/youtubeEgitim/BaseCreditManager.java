package youtubeEgitim;

public abstract class BaseCreditManager implements ICreditManeger {
	
	public abstract void calculate();
	
	
	public  void save() {
		System.out.println("Kaydedildi");
		
	}
	

}
