class Transaction{
	int iD;
	double currency;
	String description;
	Date date;
	Transaction array[]=new Transaction[10];
	int size=0;

	public Transaction(){
		array = new Transaction[10];
		size=0;



	}
	public Transaction(int id,double money,String desc,Date date1){
		//array = new Transaction[10];
		//size=0;

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
	public String display(){
		String w="";
		System.out.println("Id"+" "+"currency"+" "+"description");
		for (int as=0;as<size ;as++ ) {
			Transaction temp = new Transaction(array[as].iD,array[as].currency,array[as].description);
			w=w+temp.iD+" "+temp.currency+" "+temp.description+"\n";
		}

		return w;
	}

}
class test{
	public static void main(String[] args) {
		Transaction r = new Transaction();
		Transaction r1 = new Transaction(1,150.11,"description1");
		r.add(r1);
		Transaction r2 = new Transaction(2,20.17,"description2");
		r.add(r2);
		Transaction r3= new Transaction(3,133.77,"description3");
		r.add(r3);
		Transaction r4 =new Transaction(4,189.72,"description4");
		r.add(r4);
		Transaction r5 =new Transaction(5,200.12,"description5");
		r.add(r5);
		System.out.println(r.display());


	}
}