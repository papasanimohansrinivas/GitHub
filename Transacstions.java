class Transaction{
	int iD;
	double currency;
	String description;
	Transaction array[];
	int size;
	public Transaction(){
		array = new Transaction[10];
		size=0;



	}
	public Transaction(int id,double money,String desc){
		this.iD=id;
		this.currency=money;
		description=desc;
	}
	void add(Transaction t){
		if(size==10){
			grow();
		}
		array[size]=t;
		size++;
	}
	void grow(){

		Transaction arr[] = new Transaction[2*array.length];

		for (int q=0;q<array.length ;q++ ) {
			arr[q]=array[q];
			
		}
		array=arr;
	}
	String display(){
		String w="";
		System.out.println("Id"+" "+"currency"+" "+"description");
		for (int l=0;l<array.length ;l++ ) {
			w=w+array[l].iD+" "+array[l].currency+" "+array[l].description+"\n";
		}

		return w;
	}

}
class Test{
	public static void main(String[] args) {
		Transaction r = new Transaction();
		r = new Transaction(1,150.11,"description1");
		r.add(r);
		r = new Transaction(2,20.17,"description2");
		r.add(r);
		r= new Transaction(3,133.77,"description3");
		r.add(r);
		r =new Transaction(4,189.72,"description4");
		r.add(r);
		r=new Transaction(5,200.12,"description5");
		r.add(r);
		System.out.println(r.toString());


	}
}