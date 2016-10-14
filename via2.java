import java.util.*;
import java.io.*;
class Albums{
	int array1[];
	public Albums(int array[]){
		array1 = new int[array.length];

		for (int i=0;i<array.length ;i++ ) {
			array1[i]=array[i];
		}

	}

	public int albums(int lowest,int highest, int divisible ){
		int count=0;

		for (int j=0;j<array1.length ;j++ ) {
			if(lowest<=array1[j]){
				if (array1[j]<highest) {
					if (array1[j]%divisible==0) {
						count++;
					}
					
				}
			}
		}
		return count;

	}
	public static void main(String[] args) {

		int length=0;

		Console std = System.console();

		length = Integer.parseInt(std.readLine());
		

		int array[] = new int[Math.pow(10,5)];

		String input="";

		input = std.readLine();

		
		String[] strArray = input.split(" ");



		for (int s=0;s<length ;s++ ) {
			array[s]=Integer.parseInt(strArray[s]);
		}
		Albums trial = new Albums(array);

		int numberOfQueries=Integer.parseInt(std.readLine());

		
		String input3 = "";


		int answer[] = new int[numberOfQueries];
		for (int t=0;t<numberOfQueries ;t++ ) {
			
			input3 = std.readLine();
			
			//String[] tokens = input3.split(" ");

			
			Integer[] array3 = Arrays.stream(input3.split(" ")).map(Integer::parseInt).toArray(Integer[]::new);

			answer[t]=trial.albums(array3[0],array3[1],array3[2]);
			
		}
		for (Integer h :answer) {
			System.out.println(h);

			
		}

		double ui = Math.pow(10,6);




	}
}