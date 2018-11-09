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

/*Excellent Mona! You have implemented perfect solution. In Management and Mechanical you can avoid creating main method
 *  as it is not required there. 
 */
