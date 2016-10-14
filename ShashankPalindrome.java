import java.util.*;

class Shashank{

	public Shashank(){


	}
	public ArrayList<String> subSequences(String e){

		ArrayList<String> w = new ArrayList<String>();





		

		return w;

	}
	public ArrayList<ArrayList<String>> listOfsubSequences(String[] input){

		ArrayList<ArrayList<String>> q =new ArrayList<ArrayList<String>>();

		for (int a=0;a<input.length; a++) {

			q.add(subSequences(input[a]));
		}

		return q;


	}

	public boolean isPlindrome(ArrayList<String> g){


		return true;

	}

	public String toString(){

		return "hello";
	}
	public static void main(String[] args) {

		String[] input = new String[10];
		
	}
}