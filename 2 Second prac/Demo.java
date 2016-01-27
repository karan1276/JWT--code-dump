import java.util.Scanner;
import java.lang.Math;
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
		System.out.print("Multiplication is : ");
		System.out.println(m.multi(a,b));
		System.out.print("Division is : ");
		System.out.println((double)m.div(a,b));
		System.out.print("Square root is : ");
		System.out.println((double)m.Csqrt(a));
		System.out.println("Mean Module");
		m.variance();
	}
}
class CustomMath{
	int[] args;
	int num;
	int add(int a, int b){
		return (a+b);
	}
	int sub(int a, int b){
		return (a-b);
	}
	int multi(int a, int b){
		return (a*b);
	}
	double div(int a, int b){
		return ((double)a/(double)b);
	}
	double Csqrt(int a){
		return ((double)Math.sqrt(a));
	}
	double mean(){
		System.out.println("How many Numbers will you enter");
		Scanner s = new Scanner(System.in);
		double sum=0;
		num =  s.nextInt();

		System.out.println("Enter the numbers:");
		args = new int[num]; 
		//inserting
		for(int i=0; i<num;i++){
			args[i] = s.nextInt();
			sum = sum + args[i];
		}
		sum = sum/num;
		//printing
			System.out.println("Mean of numbers is : "+sum);
		
		
		return sum;
	}
	double variance(){
		System.out.println("Entering Variance Fuction" );
		double avg = mean();
		double variance = 0;

		for(int i=0; i<num;i++){
			variance = variance  + Math.pow(args[i]-avg,2);
		}

		variance = variance / (num);
		System.out.println("Variance of numbers is : "+variance );
		return variance;	
	}
}