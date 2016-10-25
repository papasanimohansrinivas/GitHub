import java.util.*;
class sorterdSet{
	private int [] array;
	private int size;
	private int initialSize;

	public sorterdSet(int initialSize){

		array = new int[initialSize];
		size=0;
	}

	public boolean contains(int element){
		for(int b=0;b<array.length;b++){
			if(array[b]==element){
				return true;
			}
		}

		return false;

	}
	public void alternativeAdd(int element){

		for(int g=0;g<array.length;g++){


		}

	}
	public void add(int element){

		if(!contains(element)){
			if(array[array.length-2]!=0){
				grow();
				add(element);
			}
			else{
				for(int b=0;b<array.length-1;b++){
					if(array[b]==0){
						array[b]=element;
						break;
					}
				}
				//sort();				
			}
		}
	}
	public void grow(){
		
		int y1[] = new int[2*array.length];

		for(int y=0;y<array.length;y++){
			y1[y]=array[y];
		}

		array=y1;
	}

	public void sort(){
		
		int temp;
        for (int i = 1; i < array.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(array[j] < array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        
    }
	public void remove(int element){

		// int g[] = new int[array.length];

		// for(int h=0;h<array.length;h++){
		// 	if(array[h]!=element){
		// 		g[h]=array[h];
		// 	}
		// }
		// array=g;

		for(int h=0;h<array.length;h++){
			if(array[h]==element){
				for(int e=h;e<array.length-1;e++){
					array[e]=array[e+1];
				}
			}
		}

	}

	
	public int indexofZero(){
		int h=0;
		for(int v=0;v<array.length;v++){
			if(array[v]==0){
				h=v;
				break;
			}

		}
		return h;
	}
	
	public String toString(){

		String e= "[";

		for(int w=0;w<array.length;w++){
			if(array[w]!=0){
				e=e+array[w]+",";
			}
		}
		String w = e.substring(0,e.length()-1);

		w=w+"]";

		return w;

	}
	

}
class Test{
	public static void main(String[] args) {
		sorterdSet r = new sorterdSet(5);
		r.add(1);
		System.out.println(r);
		r.add(3);
		System.out.println(r.toString());
		r.add(4);
		System.out.println(r.toString());
		r.add(5);
		System.out.println(r.toString());
		r.add(2);
		System.out.println(r.toString());
		r.add(8);
		System.out.println(r.toString());
		r.add(12);
		System.out.println(r.toString());
		r.remove(4);
		System.out.println(r.toString());
		r.add(14);
		System.out.println(r.toString());
		r.remove(5);
		System.out.println(r.toString());
		r.add(20);
		System.out.println(r.toString());
		r.add(22);
		System.out.println(r);
		r.add(6);
		System.out.println(r.toString());
		r.add(3);
		System.out.println(r.toString());
		r.add(27);
		System.out.println(r.toString());
		r.add(34);
		System.out.println(r.toString());
		r.add(104);
		System.out.println(r.toString());
		r.add(522);
		System.out.println(r);
		r.add(123);
		System.out.println(r);
		r.add(10);
		System.out.println(r.toString());
		r.add(13);
		System.out.println(r.toString());
		r.remove(104);
		System.out.println(r.toString());
		r.remove(14);
		System.out.println(r.toString());
		r.remove(14);
		System.out.println(r.toString());
		r.remove(22);
		System.out.println(r.toString());
		r.remove(2);
		System.out.println(r);
		r.remove(6);
		System.out.println(r.toString());
		r.add(6);
		System.out.println(r.toString());
		System.out.println(r);
		r.remove(13);
		System.out.println(r.toString());
		r.remove(12);
		System.out.println(r);
	}
}