class Queue{

	int [] queue;

	public Queue(int initiallength){

		queue = new int[initiallength];

	}

	public void enqueue(int element){
		
		if(isFull()){
			System.out.println("queue is full");
		}
		else{
			for(int b=0;b<size();b++){
				

			}
		}

		


	}
	public  int dequeue(){


		int lastelement = queue[queue.length-1];

		for(int n=queue.length-1;n>0;n--){
			queue[n]=queue[n-1];
		}

		return lastelement;

	}
	public boolean isEmpty(){

		if(queue.length==0){
			return false;

		}

		return true;

	}
	public boolean isFull(){
		int count=0;
		boolean bool = false;

		for(int b=queue.length-1;b>=0;b--){
			if(queue[b]==0){
				count++;
			}
		}

		if(count>0){
			bool= false;
		}
		else if(count==0){
			bool= true;
		}
		return bool;
	}
	public int size(){

		int index=0;

		for(int j=queue.length-1;j>=0;j--){
			if(queue[j]!=0){
				index = j;
				break;
			}
		}

		

		return index+1;

	}
	public String toString(){
		
		String q="";
		q="[";

		for (int k=0;k<queue.length ;k++ ) {
			if(k!=queue.length-1){
				q=q+queue[k]+",";
			}
			q=q+queue[k]+"]";
			
		}




		return q;
	}
}

class TestCases{
	public static void main(String args[]) {
		Queue queue = new Queue(8);

		queue.enqueue(4);
		System.out.println(queue.toString());
		System.out.println(queue.toString().equals("[4]"));
		queue.enqueue(5);
		System.out.println(queue.toString());
		System.out.println(queue.toString().equals("[5,4]"));
		queue.enqueue(6);
		System.out.println(queue.toString());
		System.out.println(queue.toString().equals("[6,5,4]"));
		queue.dequeue();
		System.out.println(queue.toString());
		System.out.println(queue.toString().equals("[6,5]"));
		queue.enqueue(1);
		System.out.println(queue.toString());
		System.out.println(queue.toString().equals("[1,6,5]"));
		queue.enqueue(7);
		System.out.println(queue.toString());
		System.out.println(queue.toString().equals("[7,1,6,5]"));
		System.out.println(queue.toString());
		System.out.println(queue.dequeue()==5);
		System.out.println(queue.toString());
		System.out.println(queue.dequeue()==6);
		System.out.println(queue.toString());
		System.out.println(queue.toString().equals("[7,1]"));
		System.out.println(queue.toString());
		System.out.println(queue.isFull()==false);
		System.out.println(queue.toString());
		System.out.println(queue.isEmpty());

	}
}