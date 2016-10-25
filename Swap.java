class Swap{
	char array[];
	public Swap(char[] arr){
		array=arr;
	}
	public void swap(){

		int length=array.length;

		if (length%2!=0) {
			for (int s=0;s<length ;s++ ) {
				if (s%2==0) {
					if(s!=length-1){
						char temp = array[s+1];
						array[s+1]=array[s];
						array[s]=temp;
					}
				}
			}
		}
		else{
			for (int d=0;d<length ;d++ ) {
				if (d%2==0) {
					char temp = array[d+1];
					array[d+1]=array[d];
					array[d]=temp;
				}
			}
		}
		// for (int h=0;h<length;h=h+2) {
		// 	char temp=array[h];
		// 	array[h]=array[h+1];
		// 	array[h+1]=temp;
		// }
	}
	public String toString(){
		String j="";
		for (int k=0;k<array.length ;k++ ) {
			j=j+array[k]+" ";
		}
		return j;
	}
	
}

class Test{
	public static void main(String[] args) {

		char arr[] ={'a','b','c','d','e','f','g','h','i'};

		Swap y = new Swap(arr);

		y.swap();

		System.out.println(y.toString());

	}
}