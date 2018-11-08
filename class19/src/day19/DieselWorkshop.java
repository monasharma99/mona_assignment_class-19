package day19;

public class DieselWorkshop extends Mechanical{

	public void info() {
		System.out.print("it's a ");	
		
		}
	
	public static void main(String[] args) {
		DieselWorkshop DW = new DieselWorkshop();
		DW.info();
		DW.engine();
		
	}

}