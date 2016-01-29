import java.util.*;
class EvenOdd{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int store,size;
		boolean flag=true;
		String ch; 
		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();

		System.out.println("Enter numbers, press e to exit");

		while(flag){
			ch = s.next();
			
			if(ch.equals("e"))//exit condition
				break;

			try{
				store = Integer.parseInt(ch);
				if(store%2==0){
					even.add(store);
				}
				else{
					odd.add(store);
				}
			}
			catch(NumberFormatException e){
				System.out.println(e);
			}
		}

		//printing arrays
		size = even.size();
		System.out.println("Even Array: ");
		for(int i = 0; i<size; i++){
			System.out.print(" "+even.get(i)+" ");
		}
		System.out.println();

		size = odd.size();
		System.out.println("Odd Array: ");
		for(int i = 0; i<size; i++){
			System.out.print(" "+odd.get(i)+" ");
		}
		System.out.println();
		
	}
}