package oops.encapsulation;

public class Student {
		private int age;
		private String name;
		
		
		public int getage() {
			return age;
		}
		
		public void setage(int age) {
			if(age>20) {
				System.out.println("your age is too old");
			}
			else {
			this.age= age;
			}
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			if(name=="") {
				System.out.println("please enter the name properly");
			}
			else {
			this.name = name;
			}
		}

	

}
