package c1;

public class Ae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("method return->"+m());
	
	}
	static String m()
	{
		try
		{
			int i=10/0;
		}
		catch(ArithmeticException a)
		{
			return "catch";
		}
		finally
		{
			return "finally";
		}
	}

}
