package importantquestions;

public class Anagram {

	public static void main(String[] args) {
	String s="silent";
	String s1="listens";
	boolean isanagram=false;
	
	boolean visited[]=new boolean[s1.length()];
	
	if(s.length()==s1.length()) {
	
	for(int i=0;i<s.length();i++) {
		isanagram=false;
		char c_s=s.charAt(i);
		for(int j=0;j<s1.length();j++) {
			if(s1.charAt(j)==c_s && !visited[j]) {
				visited[j]=true;
				isanagram=true;
				break;
				
			}
		}
		if(!isanagram) {
			break;
		}
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
