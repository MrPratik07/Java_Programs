package oops.abstraction;

public class RepairShop {
	
	public static void repaircar(Wagonr car) {
		System.out.println("car is repaired");
		
	}
	
	public static void repaircar(Audi car) {
		System.out.println("car is repaired");
		
	}
	
	public static void main(String args[]) {
		Wagonr wagonr=new Wagonr();
		Audi audi=new Audi();
		repaircar(wagonr);
		repaircar(audi);
	}

	
}

