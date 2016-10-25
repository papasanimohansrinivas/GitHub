class AlternateDigits{
	int [] arr;
	public AlternateDigits(int[] initArr){
		arr=initArr;

	}
	public  int[] transform(){

		for (int j=0;j<arr.length;j=j+2 ) {
			arr[j]=0;
		}
		return arr;


	}
	public  String display(){

		String r ="";
		int temp[] = transform();

		for (int l=0;l<temp.length ;l++ ) {
			if(temp[l]!=0){
				r=r+temp[l]+" ";
			}
		}

		return r;
	}
	public static void main(String[] args) {

		int initArr[] =  new int[]{5,15,20,45,30,12,20,15,100,200};

		for (int d=0;d<initArr.length ;d++ ) {
			System.out.print(initArr[d]+" ");
		}

		System.out.println();
		AlternateDigits e= new  AlternateDigits(initArr);

		System.out.println(e.display());



		
	}
}