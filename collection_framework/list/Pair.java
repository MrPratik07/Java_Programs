package collection_framework.list;

public class Pair<X,Y> {
	
	X x;
	Y y;
	
	public Pair(X x,Y y) {
		this.x=x;
		this.y=y;
	}
	
	public void getdesc() {
		System.out.println(x+" "+y);
	}

}
