import java.util.*;
class item{
	String name;
	double price;
	double noOf;
	public item(String n,double p,double no){
		name=n;
		price=p;
		noOf=no;	
	}
	
	public String toString(){
		String k="";

		k = name+" " + price +" " + noOf;

		return k;
	}
	public void setnull(){
		name=null;
		price=0;
		noOf=0;

	}

	


}

class ShoppingCart{

	item array[];

	int size;

	public ShoppingCart(int h){

		array = new item[h];

		size=0;

	}
	public void add(String n1,double p1,double no1){

		item r = new item(n1,p1,no1);
		if(size==array.length){
			doubleSize();

		}

		array[size]=r;

		size++;
	}
	public item[] doubleSize(){

		item q[] = new item[array.length];

		q = Arrays.copyOf(array,array.length);

		array=q;

		return array;



	}
	public double totalCost(){
		int s=-1;
		double totalcost=0;
		while(s!=array.length){
			try{

				s++;
				totalcost=totalcost+array[s].price*array[s].noOf;
			}
			catch (Exception e) {
				
				continue;

			}
			
		}
		
		if(totalcost>1000){

			totalcost=totalcost*.95;
		}
		return totalcost;


	}
	public item[] delete(String n3){
		
		int k=-1;
		//System.out.println(array.length);
		while(k!=array.length){
			try{
				k++;
				if(array[k].name==n3){
					array[k].setnull();
					break;
				}
				
			}
			catch(Exception h){
				continue;
			}
			
		}
		
		
		return array;



	}
	public void print(){
		
		
		System.out.println("Name "+ "Price "+"nooFitems ");
		for (int j=0;j<size;j++ ) {
			if(array[j]!=null){
				System.out.println(array[j].toString());
				//System.out.println();
			}

		}
		System.out.println("Total Cost "+totalCost());
		System.out.println();



	}
}

class Test{
	public static void main(String[] args) {

		ShoppingCart h = new ShoppingCart(12);
		h.delete("mojan");
		h.print();
		h.add("soap",23,7);
		h.add("shampoo",28,9);
		h.add("deodrant",50,8);
		h.add("shavingKit",43,10);
		h.print();
		h.delete("deodrant");
		h.print();
		h.delete("shampoo");
		h.print();
		h.delete("shavingKit");
		h.print();
		h.add("kitchen-knife",20,12);
		h.add("broom",28,5);
		h.print();
		h.add("maggie",25,12);
		h.print();
		h.add("something",30,15);
		h.print();
		h.delete("broom");
		h.print();

		
	}
}