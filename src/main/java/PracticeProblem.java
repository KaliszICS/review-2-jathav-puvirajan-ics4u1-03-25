import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		Scanner in = new Scanner(System.in);
		//prompt
		System.out.print("In: ");
		//input
		String string = in.nextLine();
		//what we do with the input
		System.out.println(string);
		
	}

	public static void q2() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		//input
		int n1 = in.nextInt();
		in.nextLine();
		System.out.print("In: ");
		//input
		int n2 = in.nextInt();
		in.nextLine();
		//what we do with the input
		System.out.println(n1/n2);
		System.out.println(n1%n2);
		
	}

	public static void q3() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		//input
		String string = in.nextLine();
		//what we do with the input
		System.out.println(string + " was the text you wrote");
		
	}

	public static void q4() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		//input
		int n1 = in.nextInt();
		in.nextLine();
		//what we do with the input
		System.out.println(n1*5);
		
	}

	public static void q5() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		//input
		boolean n1 = in.nextBoolean();
		in.nextLine();
		//what we do with the input
		System.out.println(n1 + " is a boolean");
		
	}

	public static void q6() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		//input
		double n1 = in.nextDouble();
		in.nextLine();
		//what we do with the input
		System.out.println(n1 - 3.2);
		
	}

}
