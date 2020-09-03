package importantquestions;

public class Anagram2 {

	public static void main(String[] args) {
	String a="cat";
	String b="tac";
	boolean isanagram=true;
	int[] array1=new int[256];
	int[] array2=new int[256];
	for(char c:a.toCharArray()) {
		int index=(int) c;
		array1[index]++;
		
	}
	for(char c:b.toCharArray()) {
		int index=(int) c;
		array2[index]++;
		
	}
	
	for(int i=0;i<256;i++) {
		if(array1[i] !=array2[i]) {
			isanagram=false;
		}
	}
	
	if(isanagram) {
		System.out.println("it is anagram");
	}
	else {
		System.out.println("not a anagram");
	}

	}

}
