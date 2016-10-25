import java.util.Arrays;

class CountingWords{
	char [][] arr;
	public CountingWords(String q){

		int count=0;

		for(int t=0;t<q.length();t++){
			if(q.charAt(t)==' '){
				count++;
			}

		}

		arr = new char[count+1][];

	}
}

class TestCases{
	public static void main(String[] args) {
		
	}
}