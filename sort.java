class sort{
	public static void main(String[] args) {

		int array[] = {1,3,8,12,20,10,27,13,123,6,522};
		
		System.out.println(toString(array));
	}

	public static int[] Insertionsort(int [] array){

		int [] unsortedList = new int[array.length];

		int [] initialList = new int[array.length];

		initialList = array;

		int minimum = array[0];

		for(int s=0;s<initialList.length;s++){
			if(initialList[s]<minimum){
				minimum=initialList[s];
			}

		}
		int temp;
		for(int m=0;m<initialList.length-1;m++){

			if(initialList[m]==minimum){
				temp = initialList[m];
				for(int f=m;f<initialList.length;f++){
					initialList[f]=initialList[f+1];
				}
				
			}
			else if(initialList[initialList.length-1]==minimum){
				temp = initialList[initialList.length-1];
				initialList[initialList.length-1]=0;
				
			}

		}

		return array;

	}
		

	
	public static String toString(int[] array){
		String e= "[";

		for(int w=0;w<array.length;w++){
			if(array[w]!=0){
				e=e+array[w]+",";
			}
		}
		String w = e.substring(0,e.length()-1);

		w=w+"]";

		return w;

	}
}