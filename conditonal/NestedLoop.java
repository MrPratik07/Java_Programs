package conditonal;

public class NestedLoop {

public static void main(String[] args) {
int a=1,b=8,c=5;
if(a>b) 
{
if(a>c) 
{
	System.out.print(a);
}
else 
{
	System.out.print(c);
}
}
else 
{
if(b>c) 
{
	System.out.print(b);
}
else 
{
	System.out.print(c);
}
}
			
}
}


