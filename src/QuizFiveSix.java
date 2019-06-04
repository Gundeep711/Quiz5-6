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
	
		else
		{
			return name+" is studying";
		}
	}

}
