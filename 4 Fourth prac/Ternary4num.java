import java.util.Scanner;

class Ternary4num{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int[] num = new int[4];
		int ans;
		System.out.println("Enter 4 numbers");
		//taking input
		for(int i =0; i<4;i++){
			num[i] = s.nextInt();	
		}
		
		ans = ( num[0]<num[1] ) ? ( (num[0]<num[2])?( (num[0]<num[3])?(num[0]):(num[3])):((num[2]<num[3])?(num[2]):(num[3])) ) 
					: ( (num[1]<num[2])?( (num[1]<num[3])?(num[1]):(num[3])):((num[2]<num[3])?(num[2]):(num[3])) ) ; 

		System.out.println("The Answer is : "+ans);
	}
}