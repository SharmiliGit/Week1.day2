package week1.day2.assignments;


//1. Create a class called Calculator with below methods
//a) add() with 2 int arguments and return the sum result
//b) sub() with 2 double arguments and return the diff result
//c) mul() with 2 double arguments and return the mul result
//d) div() with 2 int arguments and return the div result
//2. create main function and call the methods and print them

public class Calculator {
	
	public int add(int a, int b) {
		int add=a+b;
		return add;
		}

	public double sub(int a, int b) {
		double sub=a-b;
		return sub;
		}
	
	public double mul(int a, int b) {
		double mul=a*b;
		return mul;
		}
	
	public int div(int a, int b) {
		int div=a/b;
		return div;
		}
	
	public static void main(String[] args) {
		Calculator obj1=new Calculator();
		System.out.println("My calculations");
		System.out.println("The sum of int a and be is "+obj1.add(90,37) );
		System.out.println("The difference of double a and be is "+obj1.sub(90,37) );
		System.out.println("The multiplied value of double a and be is "+obj1.mul(80,97) );
		System.out.println("The quotient value of double a and be is "+obj1.div(1080,9) );
	}

}

