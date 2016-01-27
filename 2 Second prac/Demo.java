import java.util.Scanner;
import java.lang.Math;
class Demo{
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		CustomMath cm = new CustomMath();
		boolean flag = true;
		int ch=0,a,b;
			
		while(flag){
			System.out.println("Enter you Choise");
			System.out.println("0. Exit");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Division");
			System.out.println("5. Square root");
			System.out.println("6. Mean");
			System.out.println("7. Variance");
			ch = s.nextInt();

			//System.out.println("Enter two Numbers");
			//int a = s.nextInt();
			//int b = s.nextInt();

			switch(ch){
				case 0:
					flag=false;
				break;
				case 1:
					System.out.println("Enter two Numbers");
					 a = s.nextInt();
					b = s.nextInt();
					System.out.println("Answer is: "+cm.add(a,b));
				break;
				case 2:
					System.out.println("Enter two Numbers");
					a = s.nextInt();
					b = s.nextInt();
					System.out.println("Answer is: "+cm.sub(a,b));
				break;
				case 3:
					System.out.println("Enter two Numbers");
					a = s.nextInt();
					b = s.nextInt();
					System.out.println("Answer is: "+cm.multi(a,b));
				break;
				case 4:
					System.out.println("Enter two Numbers");
					a = s.nextInt();
					b = s.nextInt();
					System.out.println("Answer is: "+cm.div(a,b));
				break;
				case 5:
					System.out.println("Enter one Numbers");
					a = s.nextInt();
					System.out.println("Answer is: "+cm.Csqrt(a));
				break;
				case 6:
					cm.mean();
				break;
				case 7:
					cm.variance();
				break;
				default:
					flag=false;
				break;
			}
		}

	
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