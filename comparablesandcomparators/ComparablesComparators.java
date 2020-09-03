package comparablesandcomparators;

public class ComparablesComparators implements Comparable<ComparablesComparators>{
	
	int marks;
	String name;
	public ComparablesComparators(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "ComparablesComparators [marks=" + marks + ", name=" + name + "]";
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(ComparablesComparators o) {
	if(this.marks>o.marks) return 1;
	if(this.marks<o.marks) return -1;
		return this.name.compareTo(o.name);
	}
	
	

}
