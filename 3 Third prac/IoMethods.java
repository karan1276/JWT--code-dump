import java.io.IOException;

import java.util.Scanner;

//import java.io.InputStream;
import java.io.InputStreamReader;

import java.io.BufferedReader;

import java.io.DataInputStream;

class IoMethods{
	public static void main(String[] args) throws IOException {
		//reading password with console class
		char pass[] = System.console().readPassword("Enter your password");
		
		//first method of input through args
		System.out.println("Number(s) you entered are: "+args[0]);

		//second method of input through Scanner class
		System.out.println("Enter a Number again");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		System.out.println("Number(s) you entered are: "+i);

		//third method of input through Buffered reader
		System.out.println("Enter a Number again");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int j = Integer.parseInt(br.readLine());
		System.out.println("Number(s) you entered are: "+j);

		//fourth method of input through data input stream
		System.out.println("Enter a Number again");
		DataInputStream dis = new DataInputStream(System.in);
		int k = dis.readInt();
		System.out.println("Number(s) you entered are: "+k);

		//five method of input through console
		System.out.println("Enter a Number again");
		int l = Integer.parseInt(System.console().readLine());
		System.out.println("Number(s) you entered are: "+l);


	}
}