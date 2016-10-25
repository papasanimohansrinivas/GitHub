import java.util.*;

class StringADT{
	char[] arr;
	char [] ans;
	public StringADT(char[] initial){
		arr=initial;
	}
	public char[] substring(int start, int end){

		char j[] = new char[10];
		int length=arr.length;

		if(start>0 && start<length && 0<end && end<length && end>start){
			char[] h = new char[end-start];
			for (int y=start,q=0;y<end&&q<length ;y++,q++ ) {
				h[q]=arr[y];
			}
			j=h;
			System.out.println();
		}
		if (start<0 || start>length || end<0 || end>length || end<start ) {
			throw new IndexOutOfBoundsException("Index Out of Bounds Exception");
		}
		
		return j;
		//j=h;

		

		//return j;
		
				
		

	}
	public boolean equals(char[] par){
		boolean result=false;
		
		String temp1="";
		
		if (par.length==arr.length) {
			int count=0;
			for (int q=0;q<arr.length ;q++ ) {
				if (arr[q]==par[q]) {
					count++;
				}
			}
			if (count==arr.length) {
				result =true;
				
			}
			else{
				result =false;
			}
		}
		else{
			result=false;
		}
		return result;
		
		
	}
	public char[] replace(char[] given , char[] replace){
		String m="";
		

		//System.out.println(e);


		return arr;
	}
	
	public static void main(String[] args) {
		char r[] = {'M','S','I','T','E','x','a','m','i','t','e'};
		char given[] = {'i','t','e'};
		char replace[] ={'i','e','t','e'};

		StringADT to = new StringADT(r);

		to.replace(given,replace); 

		
	}
}