class Remove{
	char array[];
	public Remove(char arr[]){
		array=arr;

	}
	public void remove(int indexStart,int indexEnd){

		for (int q=indexStart;q<=indexEnd ;q++ ) {
			array[q]='0';
		}


	}
	public String toString(){

		String g="";

		for (int y=0;y<array.length ;y++ ) {
			if (array[y]!='0') {
				g=g+array[y]+" ";
			}
		}
		return g;
	}
	public static void main(String[] args) {
		char test[] = {'t','e','s','t','1','2','3','4','5','p','a','b','c','d'};
		for (int u=0;u<test.length ;u++ ) {
			System.out.print(test[u]+" ");
		}
		System.out.println();
		System.out.println();
		Remove one = new Remove(test);
		one.remove(2,6);
		System.out.println(one.toString());


	}
}