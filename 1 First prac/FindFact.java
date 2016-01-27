class FindFact{
	public static void main(String arg[]){
		int a = Integer.parseInt(arg[0]);
		CustomMath obj = new CustomMath();
		System.out.println(obj.fact(a));
	}
}
class CustomMath{
	int fact(int a){
		if(a>0){
			return a*fact(a-1);
		}
		else{
			return 1;
		}
	}
}