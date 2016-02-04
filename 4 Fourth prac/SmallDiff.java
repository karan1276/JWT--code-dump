import java.util.*;
import java.lang.Math;
class SmallDiff{
	public static void main(String[] args){
            
		Scanner s = new Scanner(System.in);
                int[] num = new int[10];
                int diff;//smallest diff will be sotred here
                int index;
                
                System.out.println("Enter 10 numbers");
                //taking input
                for(int i=0; i<10; i++){
                    num[i] = s.nextInt();
                }
                
                diff=num[0];
                index=0;
                for(int i=0; i<9; i++){
                    if(diff>Math.abs(num[i]-num[i+1])){
                        index = i;
                        diff = Math.abs(num[i]-num[i+1]);
                    }
                }
                System.out.println("Numbers with smallest diffrentce are at "+index+" and "+(index+1));
	}
}