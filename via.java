import java.util.*;
class Alpahbet{
	public static ArrayList<Integer> lexicographical(String input){
		String output="";
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int q=97;q<=122 ;q++ ) {
			char temp = (char) q;
			for (int w=0;w<input.length();w++ ) {
				if(input.charAt(w)==temp){
					output=output+input.charAt(w);
					a.add(w);
					break;
				}
			}
		}
		System.out.println(output);
		return a;
	}

	public static int chainLength(ArrayList<Integer> a){

		int out=0;

		for (int p=0;p<a.size();p++) {
			if (p!=a.size()-1) {
				out=out+Math.abs(a.get(p+1)-a.get(p));
			}		
			
		}

		return out;
	}

	public static int sortChainLength(){

		return 8;

	}
	public static void main(String[] args) {
		int numberOfTestCases=0;
		Scanner o = new Scanner(System.in);
		numberOfTestCases = o.nextInt();
		String q="";
		int result[] = new int[numberOfTestCases];
		Scanner i = new Scanner(System.in);
		for (int e=0;e<numberOfTestCases ;e++ ) {
			q=i.nextLine();
			result[e]=chainLength(lexicographical(q));
		}
		for (Integer k : result) {
			System.out.println(k);
		}
		int ui = Maths.pow(10,6);
	}
}