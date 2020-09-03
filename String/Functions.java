package String;

public class Functions {

	public static void main(String[] args) {
	String name="Pratik";
	String name1=new String("Pratik");
	System.out.println(name.length());
	System.out.println(name.charAt(0));
	System.out.println(name.substring(2));
	System.out.println(name.substring(0, 2));
	System.out.println(name.contains("r"));
	System.out.println(name.equals(name1));
	System.out.println(name.isEmpty());
	System.out.println(name.concat(" Gaikwad"));
	System.out.println(name.replace("P","H"));
	System.out.println(name.indexOf("P"));
	System.out.println(name.toLowerCase());
	System.out.println(name.toUpperCase());
	
	
	String surname="  gaikwad";
	System.out.println(surname.trim());
	
	
	String cars="Swift,ertiga,breeza,alto";
	String allcars[]=cars.split(",");
	
	for(String c:allcars) {
		System.out.print(c+" ");
	}

	}

}
