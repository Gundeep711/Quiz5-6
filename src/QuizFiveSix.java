import java.util.Scanner;

public class QuizFiveSix {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name :");
		String result=studying(sc.next());
		System.out.println(result);
		
		
		String result1=studying(null);
		System.out.println(result1);
		
		
	}
	
	public static String studying(String name)
	{
		
		if(name==null)
		{
			return "Nobody is studying";
		}
		else if(name.contains(','))
		{
			return name.substring(0, name.indexOf(','))+" and "+name.substring(name.indexOf(','))+" are stuying ";
		}
		else
		{
			return name+" is studying";
		}
	}
	
	public static boolean uppercase(String name)
	{
		char[] ch=name.toCharArray();
		for(int index=0;index<name.length();index++)
		if(ch[index]==name.toUpperCase())
		{
			return true;
		}
		else
		{
		return false;
		}
		
	}

}
