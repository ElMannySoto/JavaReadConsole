import java.util.Scanner;


public class MyMainClass{
	
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		String nationality;
		int age;
		int i = 1, j=2, k=3;

		System.out.println("---------------------------------");
		System.out.print("Enter your nationality: ");
		nationality = scanner.nextLine();
		System.out.println("Nationality = " + nationality);

		System.out.println("---------------------------------");

		System.out.print("Enter your age: ");
		age = scanner.nextInt();
		System.out.println("Age = " + age);
	
		System.out.println("---------------------------------");
		
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
		System.out.println("---------------------------------");
		System.out.println("i = " + i + ", j = " + j + ", k = " + k);
		
		
	}
	
}