package c1;

public class Myclass1 {

	public static void m1()
	{
		try {
			String s=null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception caught here");
			throw e;
		}
	}
	public static void main(String args[])
	{
		try {
			m1();
		} catch (NullPointerException ex) {
			System.out.println("m1() rethrow the exception.Handled here");
		}
	}
}
