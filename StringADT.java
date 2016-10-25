class StringADT{
	char array[];
	public StringADT(char[] arr){
		array=arr;
	}
	public int indexOf(char element){

		for (int g=0;g<array.length ;g++ ) {
			if (array[g]==element) {
				return g;
			}
		}

		return -1;

	}
	public int length(){

		if(array.length==0){
			return 0;

		}
		else {
			return array.length;
		}

	
	}
	public int count(char[] arr1){
		int count1=0;
		String q ="";
		String s1="";
		for (int y=0;y<array.length ;y++ ) {
			q=q+array[y];
		}
		for (int x=0;x<arr1.length ;x++ ) {
			s1=s1+arr1[x];
		}
		if (array.length<arr1.length) {

			return 0;
			
		}/* if given array contains 1 character */
		
		else if(arr1.length==1){

			for (int v=0;v<arr1.length ;v++ ) {
				for (int h=0;h<array.length ;h++ ) {
					if (array[h]==arr1[v]) {
						count1++;
					}
				}
			}
			return count1;

		}/* if given array */
		else if(array.length>arr1.length){
			
			boolean w =false;

			try{
				for (int l=0;l<array.length ;l++ ) {
					if(arr1[0]==array[l]){
						if (contains(l,arr1)==true) {
							count1++;
						}
					}
				}
			}
			catch (IndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
				System.out.println();
			}
		}
		else if (q.equals(s1)) {
			return 1;
		}

		return count1;
	}
	public boolean contains(int index,char[] arr1){
		int count=0;
		for (int e=index,u=0;e<array.length&&u<arr1.length ;e++,u++ ) {
			if (array[e]==arr1[u]) {
				count++;
				
			}
		}
		if (count==arr1.length) {
			return true;
		}
		else{
			return false;
		}

	}

	public static void main(String[] args) {
		char testCase[] = new char[]{'m','i','s','s','i','s','s','i','p','p','i'};
		StringADT h = new StringADT(testCase);
		System.out.println(h.indexOf('i'));
		testCase = new char[]{'i','s'};
		System.out.println(h.count(testCase));




	}
}