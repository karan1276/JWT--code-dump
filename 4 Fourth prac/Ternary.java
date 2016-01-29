import java.util.Scanner;

class Ternary{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		System.out.println("Enter two numbers");

		int x = s.nextInt();
		int y = s.nextInt();
		int ans = ( x>y ) ? (x%y) : (y%x) ; 

		System.out.println("The Answer is : "+ans);
	}
}