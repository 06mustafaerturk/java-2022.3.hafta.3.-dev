package overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] baseKrediManagers=new BaseKrediManager[] 
				{new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};
		
		for(BaseKrediManager krediManager:baseKrediManagers) {
			System.out.println(krediManager.hesapla(1000));
			
			
		}
		
	}

}
