class ListADT{
	int arrayImpl[];

	ListADT(int[] initialArray){
		arrayImpl=initialArray;
	}
	public int get(int index){

		if(index>=arrayImpl.length || index <=-1 ){
			throw new IndexOutOfBoundsException("Index Out of Bounds Exception");

		} 
		else {
			return arrayImpl[index];
		}
		
	}
	public int indexOf(int element){
		int index=-1;

		for (int y=0;y<arrayImpl.length ;y++ ) {
			if (arrayImpl[y]==element) {
				index=y;
			}
		}
		if(index!=-1){
			return index;
		}
		else{
			return -1;
		}


	}
	public void addAll(int[] add){

		int newaArray[] = new int[arrayImpl.length+add.length];

		for (int a=0;a<arrayImpl.length ;a++ ) {
			newaArray[a]=arrayImpl[a];
		}
		//arrayImpl=newaArray;
		for (int s=arrayImpl.length,u=0;s<newaArray.length&&u<add.length ;s++,u++ ) {
			newaArray[s]=add[u];
		}

		arrayImpl=newaArray;


		
	}
	public boolean containsAll(int[] checkWith){

		int no=0;

		for (int d=0;d<checkWith.length ;d++ ) {
			if(contains(checkWith[d])==true){
				no=no+1;

			}
		}

		if(no==checkWith.length){
			return true;
		}
		else
		{
			return false;
		}


	}
	public boolean contains(int element){

		for (int p=0;p<arrayImpl.length ;p++ ) {

			if (arrayImpl[p]==element) {
				
				return true;
				
			}
			
		}

		return false;


	}
	public String toString(){
		String q="";
		q="[";

		for (int x=0;x<arrayImpl.length ;x++ ) {
			if(x==arrayImpl.length-1){
				q=q+arrayImpl[x];
				q=q+"]";
				
			}
			else if(x!=arrayImpl.length-1){
				q=q+arrayImpl[x]+",";
			}
			
		}
		return q;
	}
	public static void main(String[] args) {
		
	}
}
class Test{
	public static void main(String[] args) {
		int initial[] = new int[]{1,0,-9,10,55,5,-6};

		ListADT er = new ListADT(initial);

		System.out.println(er.get(5)==(5));
		System.out.println(er.indexOf(55)==(4));
		System.out.println(er.indexOf(5)==5);
		System.out.println(er.indexOf(-1)==-1);
		int ini[] = new int[]{1,5,10};
		System.out.println(er.containsAll(ini)==true);
		ini = new int[]{1,5,10,19,-6,55,0,56};
		System.out.println(er.containsAll(ini)==false);
		ini = new int[]{};
		System.out.println(er.containsAll(ini)==true);
		ini = new int[]{1,2,3,4};
		er.addAll(ini);
		//System.out.println();
		System.out.println(er.toString().equals("[1,0,-9,10,55,5,-6,1,2,3,4]"));
		ini = new int[]{1,0,-9,10,55,5,-6,1,2,3,4};
		er.addAll(ini);
		//System.out.println();
		System.out.println(er.toString().equals("[1,0,-9,10,55,5,-6,1,2,3,4,1,0,-9,10,55,5,-6,1,2,3,4]"));
		ini = new int[]{};
		er.addAll(ini);
		//System.out.println();
		System.out.println(er.toString().equals("[1,0,-9,10,55,5,-6,1,2,3,4,1,0,-9,10,55,5,-6,1,2,3,4]"));
		ini = new int[]{1};
		er.addAll(ini);
		//System.out.println();
		System.out.println(er.toString().equals("[1,0,-9,10,55,5,-6,1,2,3,4,1,0,-9,10,55,5,-6,1,2,3,4,1]"));
		// System.out.println(if(er.get(-6))throw new IndexOutOfBoundsException("Index Out of Bounds Exception") =="Index Out of Bounds Exception");
		// System.out.println(if(er.get(7)) throw new IndexOutOfBoundsException("Index Out of Bounds Exception")=="Index Out of Bounds Exception");

	}
}