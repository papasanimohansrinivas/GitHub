import java.util.*;
class removeDuplicate{

	int [] y ;

	public removeDuplicate(int[] array){

		y=array;
		
		for(int b=0;b<y.length;b++){
			for(int v=0;v<y.length;v++){
				if( b!=v && y[b]==y[v]){
					y[v]=0;
				}
			}
		}

	}

	public String toString(){
		String h="";
		h=h+"[";
		for(int t=0;t<y.length;t++){
			if(t!=y.length-1){
				if(y[t]!=0){
					h=h+y[t]+",";
				}
			}
		}
		h=h+y[y.length-1]+"]";
		return h;

	}


}

class Testcases{
	public static void main(String[] args) {
		// test case 1
		int h[] = new int[]{1,2,3,4,5,6,5,6,7,8};
		test(h);
		// test case 2
		h = new int[]{2,3,4,4,4,5,6,7,8,5,9};
		test(h);
		// test case 3
		h  = new int[]{12,33,100,23,34,67,87,98,33,33,12,12,99,56,67,100};
		test(h);

		h = new int[]{12,33,100,23,34,67,87,98,33,33,12,12,99,56,67,100,100,200,3001};
		test(h);

		int []b = new int[]{12,12,13,15,16,17,18,19,12,13,21,71};

		test(b);
		
		

	}
	public static void test(int [] h){

		System.out.println("input array:");
		System.out.print("[");
		for(int g=0;g<h.length;g++){
			System.out.print(h[g]+",");
		}
		System.out.print("]");
		System.out.println();
		removeDuplicate two = new removeDuplicate(h);
		System.out.println("output array:");
		System.out.println(two.toString());

	}
}