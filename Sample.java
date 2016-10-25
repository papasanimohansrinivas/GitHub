class Sample{
	int arr[];
	int index;
	public Sample(int[] array){
		arr= new int[10];
		index=0;


	}
	void add(int element){
		if (index==10) {
			grow();
		}
		arr[index]=element;
		index++;

	}
	void grow(){
		
	}
	void delete(int element){

		for (int h=0;h< ;h++ ) {
			
		}

	}

}
class Test{
	public static void main(String[] args) {

		int []check = new int[]{1,2,3,4,5,6,7,8};

		Sample u = new Sample(check);
		
	}
}