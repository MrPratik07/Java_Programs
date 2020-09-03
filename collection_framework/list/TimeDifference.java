package collection_framework.list;

import java.util.*;

public class TimeDifference {

	public static void main(String[] args) {
	List<Integer> al=new ArrayList<>();
	List<Integer> ll=new LinkedList<>();
	gettimediff(al);
	gettimediff(ll);
	

	}
	
	static void gettimediff(List<Integer> list) {
		long start=System.currentTimeMillis();
		
		for(int i=0;i<100000;i++) {
			list.add(i);
		}
		
		long end=System.currentTimeMillis();
		long start1=System.currentTimeMillis();
		
		for(int i=0;i<100000;i++) {
			list.get(i);
		}
		
		long end1=System.currentTimeMillis();
		//add values
		System.out.println(list.getClass().getName()+"-->"+(end-start));
		
		//get values
		System.out.println(list.getClass().getName()+"-->"+(end1-start1));
	}
	
	

}
