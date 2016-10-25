 class Hash{
	public static void main(String[] args) {
		Test t = new Test();
		int arr2[] = new int[]{10,2,4,6,8,20,21,22,23,88,30};

		for (int y=0;y<arr2.length ;y++ ) {

			System.out.print(arr2[y]+" ");
			

		}
		t.t(arr2);

		t.putValue();

		System.out.println(" after hashing");
		
		System.out.println(t.tostring());

	}
}
 class Test{
 	int value[];
 	int key[];

	void t(int[] array){

		key=array;

		value =new int[array.length];
	}
	void putValue(){

		for (int r=0;r<key.length ;r++ ) {

			if(value[hashCode(key[r])]==0){

				value[hashCode(key[r])]=key[r];
			
			}
			else if(value[hashCode(key[r])]!=0){
				for (int j=0;j<value.length ;j++ ) {
					if (value[j]==0) {
						value[j]=key[r];
						break;
					}
					
				}
				
			}
		}



	}
	int hashCode(int element){

		return element%10;



	}
	String tostring(){

		String h="";

		for (int e=0;e<value.length;e++ ) {
			System.out.println(e+" " + value[e]);
			
		}
		return h;

	}


}

