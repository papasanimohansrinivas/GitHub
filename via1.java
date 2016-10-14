import java.io.*;
import java.util.*;
class Clock{
	
	public static boolean isPalindrome(int n){
		int temp=0;
		temp=n;    
		int sum=0;
		int r=0;
		while(n>0){
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;

		}
		if(sum==temp){
			return true;
		}
		else{
			return false;
		}
		
	}
	public static int numberOfplaindromes(int initialtime,int endingtime){
		int count=0;

		for (int z=initialtime;z<=endingtime ;z++ ) {
			if(isPalindrome(z)){
				count=count+1;

			}
			
		}
		return count;


	}

	public static void main(String[] args) {
		Console std = System.console();
		int input = Integer.parseInt(std.readLine());
		String input2="";
		int output[] = new int[input];

		for (int y=0;y<input ;y++ ) {

			input2 = std.readLine();

			String d [] = input2.split(" ");

			int input4[] = new int[d.length];

			for (int q =0;q<input4.length ;q++ ) {
				input4[q]=Integer.parseInt(d[q]);
			}
			System.out.println(input4[0]+" "+input4[1]);

			output[y]=numberOfplaindromes(input4[0],input4[1]);

			
		}
		for (Integer v :output ) {
			System.out.println(v);
			
		}
	}
}