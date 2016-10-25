class Methods{
	char givenArray[]= {'a','b','c','d','e','f','g'};
	int count;
	public Methods(char[] x){
		givenArray=x;
		count=0;
	}
	void removeAll(char[] p){

		for (int l=0;l<p.length ;l++ ) {
			for (int h=0;h<givenArray.length ;h++ ) {
				if(p[l]==givenArray[h]){
					givenArray[h]='0';
					count++;
				}
			}
		}
		int newArr[]= new int[givenArray.length-count];
		for (int z=0;z<givenArray.length;z++ ) {
			
		}


	}
	boolean containsAtleatOne(char[] o){
		int count=0;
		boolean result=false;
		for (int s=0;s<o.length ;s++ ) {
			for (int k=0;k<givenArray.length ;k++ ) {
				if(o[s]==givenArray[k]){
					result=true;
				}
			}
			
		}
		
		return result;


	}
	public String toString(){

	

		String k="";

		for (int z=0;z<givenArray.length ;z++ ) {
			if(givenArray[z]!='0'){
				k=k+givenArray[z];
			}
		}

		String r="";

		for (int s=0;s<k.length()-1 ;s++ ) {
			r=r+k.charAt(s)+",";
		}

		r=r+k.charAt(k.length()-1);

		r="["+r+"]";
		
		return r;

		
	}
}
class Test{
	public static void main(String[] args) {
		char x[] = new char[]{'a','b','c','d','e','f','g'};

		char remove[] = new char[]{'a','f','e','g'};

		Methods q = new Methods(x);

		System.out.println("before removeAll..");

		System.out.println(q.toString());

		System.out.println("removing");

		for (int a=0;a<remove.length ;a++ ) {
			System.out.print(remove[a]+",");
		}

		System.out.println();

		q.removeAll(remove);
		System.out.println("After removeAll..");
		System.out.println(q.toString());

		char check[] = new char[]{'a','z','f','b'};
		//q.containsAtleatOne(check);

		System.out.println(q.containsAtleatOne(check));

		


		
	}
}