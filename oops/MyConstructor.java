package oops;

class Vehicle{
	int wheels;
	int headlight;
//  Default constructor looks like this	
//	Vehicle(){
//		wheels=4;
//	}
	
// paramaterized constructor	
	Vehicle(int count_wheels){
		this.wheels=count_wheels;
		headlight=2;
	}
}

public class MyConstructor {
	MyConstructor(){
		//System.out.println("object is created");
	}

	public static void main(String[] args) {
		
		MyConstructor obj=new MyConstructor();
		Vehicle car=new Vehicle(10);
		Vehicle car1=new Vehicle(5);
		System.out.println(car.wheels+" wheels");
		System.out.println(car1.wheels+" wheels");
		System.out.println(car1.headlight+" headlights");

	}

}
