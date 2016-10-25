class reverseArray{

	int array[];

	public reverseArray(int[] initialArray){

		array = initialArray;




	}
	public int[] reverse(){

		int length=array.length;
		int j=array.length-1;
		int i=0;
		/* for even number pf elements*/
		if(length%2==0){
			while((i!=length/2)&&(j!=(length/2)-1)){
				try{
					int temp=array[j];
					array[j]=array[i];
					array[i]=temp;
					j--;
					i++;
				}
				catch(Exception e){
					System.out.println(i+" "+j);
					System.out.println(e.getMessage());
					continue;
				}
				
			}

		}
		/*for odd number of elements */
		else {
			while((i!=length/2)&&(j!=length/2)){
				try{
					int temp=array[j];
					array[j]=array[i];
					array[i]=temp;
					j--;
					i++;
				}
				catch(Exception e){
					System.out.println(i+" "+j);
					System.out.println(e.getMessage());
					continue;
				}


			}
			
		}
		return array;
		

	}
	public void swap(){

	}
	public void removeDuplicates(){

		for (int w=0;w<array.length;w++ ) {
			if(count(array[w])==1){
				array[w]=0;
			}
		}

		for (int u=0;u<array.length ;u++ ) {
			for (int r=0;r<array.length ;r++ ) {
				if (((u!=r) && (array[u]==array[r]))) {
					array[r]=0;
				}		
			}	
		}

	}
	public int count(int element){
		int count=0;
		for (int g=0;g<array.length ;g++ ) {
			if (element==array[g]) {
				count++;
				
			}
			
		}
		return count;


	}
	public String toString(){


		String h = "";

		for (int d=0;d<array.length ;d++ ) {

			if(array[d]!=0){
				h=h+array[d]+" ";
			}
			
		}
		return h;
	}
}
class Test{
	public static void main(String[] args) {
		

		int initialArray[] = new int[]{1,2,3,4,5,5,5,6,7,7,8,8,8,9,9,10};

		reverseArray t = new reverseArray(initialArray);

		System.out.println("before reversing");

		System.out.println(t.toString());

		t.reverse();

		System.out.println("after reversing");

		System.out.println(t.toString());

		System.out.println("removingDuplicates....");

		t.removeDuplicates();

		System.out.println(t.toString());



	}
}