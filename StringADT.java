import java.util.Scanner;

class StringADT{
	char h[];
	public StringADT(char [] array){
		h=array;

	}
	public int indexOf(char [] array2 ){

		int p = 0;

		if(contains(array2)){
			for(int w=0;w<h.length;w++){
				if(h[w]==array2[0]){
					p=w;
					break;			
				}
			}
		}
		else{
			return -1;
		}

		return p;

		

	}
	public boolean contains(char [] array1){

		boolean w1 = false;

		for(int f=0;f<array1.length;f++){
			char temp = array1[f];
			for(int w=0;w<h.length;w++){
				if(h[w]==temp){
					w1=true;
					break;
				}
			}
		}

		if(w1){
			return true;
		}
		else{
			return false;
		}


		

	}
	public boolean endswith(char [] array3){


		if(indexOf(array3)!=-1){
			return true;
		}

		return false;

	}
	public static void testcases(char [] h,char [] g1,char [] g2,char[] g3){

		StringADT d = new StringADT(h);

		System.out.println(d.indexOf(g1));

		System.out.println(d.contains(g2));

		System.out.println(d.endswith(g3));

	}

	public static void main(String[] args) {


		char h[] = new char[]{'h','e','l','l','o',' ','w','o','r','l','d'};

		char g1[] = new char[]{'w','o','r','l','d'};

		char g2[] = new char[]{'o',' ','w','o','r'};

		char g3[] = new char[]{'l','d'};

		testcases(h,g1,g2,g3);

		h = new char[]{'\0'};

		g1 = new char[]{'2','4'};

		g2 = new char[]{'m','s','i','t'};

		g3 = new char[]{' '};

		testcases(h,g1,g2,g3);



		h = new char[]{'M','S','I','T','E','x','a','m'};

		g1 = new char[]{'I','T','E'};

		g2 = new char[]{' '};

	

		






		
		


		
	}
}