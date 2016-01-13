class MaxNo{

	public static void main(String arg[]){
		int a,b,c;

		a = Integer.parseInt(arg[0]);
		b = Integer.parseInt(arg[1]);
		c = Integer.parseInt(arg[2]);

		System.out.println(Math.max(a,Math.max(b,c)));

	}


}