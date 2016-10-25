import java.util.Scanner;

class CountingLetters{
	char o [][];
	String r;


	public CountingLetters(String d){
		r=d;

		o = new char[2][d.length()];

		for(int v=0;v<d.length();v++){
			if(d.charAt(v)==' '){
				o[0][v]='\0';
			}

			o[0][v]=d.charAt(v);
		}




	}
	public  int frequency(char w){

		int count=0;

		for(int v=0;v<o[0].length;v++){
			if(o[0][v]==w){
				count++;
			}

		}
		return count;


	}

	public  char[][] array(){
	
		char d[]  = new char[o[1].length];			
		for(int l=0;l<o[1].length;l++){
			 
			o[1][l] = (char) frequency(o[0][l]);
		}
		char t[][] = o;

		
		return o;

	}
	public void print(){

	

		char t[][] = array();

		for(int y=0;y<t[0].length;y++){
			System.out.print(t[0][y]);
		}
		
		System.out.println();
		for(int s=0;s<t[1].length;s++){
			if(t[1][s]!=0){
				System.out.print((int)t[1][s]);
			}
			
			
			
		}
		System.out.println();



		

	}
	
	public static void main(String[] args) {

		CountingLetters q = new CountingLetters("hello world");

		q.print();

		System.out.println();
		q = new CountingLetters("my name is daniel");

		q.print();

		System.out.println();

		q = new CountingLetters("hello world hello");

		q.print();

		System.out.println();

		q = new CountingLetters("1");

		q.print();

		System.out.println();

		

		
	}
}