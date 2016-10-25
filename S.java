class Sample{
	char array[];
	public Sample(char arr[]){
		array=arr;

	}
	public String remove(char e,int count){

		int temp=0,start=0,end=0;
		for (int h=0;h<array.length ;h++ ) {
			if (e==array[h]) {
				temp=temp+1;
				//System.out.println(h+" "+temp);

			}
			if(temp==count) {
				end=h;
				for (int y=h;y>=0;y-- ) {
					if (array[y]==e) {
						start=y;
					}
				}
				//System.out.println(" "+h+" ");
				break;
			}
		}
		String h="";
		for (int u=start+1;u<end ;u++ ) {
			h=h+array[u];
		}

		return h;


	}
	public static void main(String[] args) {

		char test[] ={'a','b','c','.','f','.','d','e','f'};

		Sample example= new Sample(test);
		System.out.println(example.remove('.',2));   

	}
}