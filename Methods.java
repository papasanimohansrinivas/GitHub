class Methods{
	char array[];
	public Methods(char arr[]){
		array=arr;

	}
	public void remove(int indexStart,int indexEnd){

		for (int q=indexStart;q<=indexEnd ;q++ ) {
			array[q]='0';
		}


	}
	public void removePattern(char[] p){

		for (int l=0;l<array.length ;l++ ) {
			if (array[l]==p[0]) {
				try{
					int count=0;
					for (int t=l;t<l+p.length;t++ ) {
						if (array[t]==p[t-l]) {
							count++;
						}
					}
					if (count==p.length) {
						for (int y=l;y<l+p.length;y++ ) {
							array[y]='0';
						}
					}
				}
				catch(Exception e){
					System.out.println(l);
				}
				
			}
		}
	}
	
	public void addAt(char []p, int index){

		char q[] = new char[p.length+array.length];
		String result="";
		for (int u=0;u<index ;u++ ) {
			result=result+array[u];
		}
		for (int h=0;h<p.length ;h++ ) {
			result=result+p[h];
		}
		for (int t=index;t<array.length ;t++ ) {
			result=result+array[t];
		}

		if (result.length()==q.length) {
			for (int r=0;r<q.length ;r++ ) {
				q[r]=result.charAt(r);
			}
		}
		array=q;
		//System.out.println(result);


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
		Methods one = new Methods(test);
		one.remove(2,6);
		System.out.println(one.toString());
		System.out.println();

		char test1[] = {'a','b','c','d','e','f','g','a','b','c','d','a','b','e'};
		char pattern[] = {'a','b'};
		for (int h=0;h<test1.length ;h++ ) {
			System.out.print(test1[h]+" ");
		}
		System.out.println();
		System.out.println();
		one = new Methods(test1);
		one.removePattern(pattern);
		System.out.println(one.toString());

		System.out.println();
		char test3[] = {'a','b','c','d','e','f','g','h','i','j','k'};

		for (int r=0;r<test3.length;r++ ) {
			System.out.print(test3[r]+" ");
		}
		System.out.println();
		char p[] = new char[]{'e','f','g'};
		one = new Methods(test3);
		one.addAt(p,5);
		System.out.println();
		System.out.println(one.toString());
		System.out.println();




	}
}