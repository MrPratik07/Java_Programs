package importantquestions;

public class ReverseWords {

	public static void main(String[] args) {
	String a[]="my name is Pratik".split(" ");
	String s="";
	for(int i=a.length-1;i>=0;i--) {
		s+=a[i]+" ";
	}
	System.out.println(s);

	}

}
