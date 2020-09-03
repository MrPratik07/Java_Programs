package comparablesandcomparators;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
	List<ComparablesComparators> students=new ArrayList<>();
	
	students.add(new ComparablesComparators(12,"Pratik"));
	students.add(new ComparablesComparators(12,"Pratik"));
	students.add(new ComparablesComparators(11,"Prakshan"));
	students.add(new ComparablesComparators(18,"Prashant"));
	students.add(new ComparablesComparators(17,"Pradeep"));
	Collections.sort(students,new SortByNamesThenMarks());
	students.forEach(System.out::println);
	
	

	}

}

class SortByNamesThenMarks implements Comparator<ComparablesComparators>{

	@Override
	public int compare(ComparablesComparators o1, ComparablesComparators o2) {
		if(o1.name.equals(o2.name)) {
			return o1.marks-o2.marks;
		}else {
			return o1.name.compareTo(o2.name);
		}
		
	}
	
}
