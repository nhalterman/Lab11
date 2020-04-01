package unl.cse.trucks;

public class ListTester {

    public static void main (String[] args){

    	//TODO: Test cases should be made here
    	
    	System.out.println("Truck 1 License Plate: ABC 123");
    	System.out.println("Truck 2 License Plate: DEF 456");
    	System.out.println("Truck 3 License Plate: GHI 789");
    	System.out.println("Lists:");
    	System.out.println("");
    	
    	System.out.println("Adds truck 1 to beginning and truck 2 at the end");
    	TruckList tl = new TruckList();
    	Truck t = new Truck.Builder().licensePlate("ABC 123").build();
    	Truck t2 = new Truck.Builder().licensePlate("DEF 456").build();
    	Truck t3 = new Truck.Builder().licensePlate("GHI 789").build();
    	tl.addToStart(t);
    	tl.addToEnd(t2);
    	tl.print();
    	System.out.println("");
    	
    	System.out.println("Gets the size of the list");
    	System.out.println(tl.getSize());
    	System.out.println("");
    	
    	System.out.println("Adds third truck to the start of the list");
    	tl.addToStart(t3);
    	tl.print();
    	System.out.println("");
    	
    	System.out.println("Removes third truck from the beginning of the list");
    	tl.remove(0);
    	tl.print();
    	System.out.println("");
    	
    	System.out.println("Adds third truck to the end of the list");
    	tl.addToEnd(t3);
    	tl.print();
    	System.out.println("");
    	
    	System.out.println("Gets truck 2 in the middle of the list");
    	tl.getTruck(2).print();
    	System.out.println("");
    	
    	System.out.println("This one clears the list");
    	tl.clear();
    	tl.print();

	}
}
