package corejava;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Calculator");
		
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		
		
		System.out.println("The addition of "+a+" and "+b+" is : " +(a+b));
		System.out.println("The substraction of "+a+" and "+b+" is : " +(a-b));
		System.out.println("The multiplication of "+a+" and "+b+" is : " +(a*b));
		if (b==0)
		System.out.println("Divided by 0 is not possible");
		else
		System.out.println("The division of "+a+" and "+b+" is : " +(a/b));
		

	}

}
