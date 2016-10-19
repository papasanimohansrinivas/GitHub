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
	public String toString(){


		String h = "";

		for (int d=0;d<array.length ;d++ ) {
			h=h+array[d]+" ";
		}
		return h;
	}
}
class Test{
	public static void main(String[] args) {

		int initialArray[] = new int[]{};

		reverseArray t = new reverseArray(initialArray);

		System.out.println("before reversing");

		System.out.println(t.toString());

		t.reverse();

		System.out.println("after reversing");

		System.out.println(t.toString());



	}
}