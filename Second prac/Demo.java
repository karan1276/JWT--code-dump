import java.util.*;
class Demo{
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		System.out.println("Enter two Numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		CustomMath m = new CustomMath();
		System.out.print("Sum is : ");
		System.out.println(m.add(a,b));
		System.out.print("Sub is : ");
		System.out.println(m.sub(a,b));
	}
}
class CustomMath{
	int add(int a, int b){
		return (a+b);
	}
	int sub(int a, int b){
		return (a-b);
	}
}