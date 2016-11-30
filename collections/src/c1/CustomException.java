package c1;

import java.util.Scanner;

public class CustomException extends Exception {

	int age;
	public void checkAge() throws InvalidAgeException
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter age:");
		age=sc.nextInt();
		if(age>=18)
		{
			if(age<25)
			{
				System.out.println("eligible"+age);
			}
			//throw new InvalidAgeException();
		}
		else
		{
			System.out.println("not Eligible"+age);
			throw new InvalidAgeException();

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomException c1=new CustomException();
		try
		{
			c1.checkAge();
		}
		catch(InvalidAgeException e)
		{
			System.out.println("Exception caught"+e);
		}
		
	}

}
