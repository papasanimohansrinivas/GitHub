class Hash{
	public static void main(String[] args) {

		int initialArr[] = new int[]{10,2,4,6,8,30,21,22,23,88};

		for (int r=0;r<initialArr.length;r++ ) {
			System.out.print(initialArr[r]+" ");
		}
		System.out.println();
		Test t = new Test();

		t.t(initialArr);

		t.putValue();

		System.out.println(t.toString());



	}
}
class Test{

	int key[];

	int value[][];

	void t(int[] array){

		key=array;

		value = new int[array.length][array.length];

	}

	void putValue(){

		for (int l=0;l<key.length;l++){

			int element=key[l];

			for(int e=0;e<value[hashCode(element)].length;e++){

				if(value[hashCode(element)][e]==0){

					value[hashCode(element)][e]=element;
					break;

				}
			}

		}



	}
	int hashCode(int key){

		return key%value.length;

	}

	public String toString(){
		String q="";

		for (int h=0;h<value.length;h++) {
			for (int l=0;l<value[h].length ;l++ ) {
				q=q+value[h][l]+" ";
			}
			q=q+"\n";
			
		}

		return q;

	}
}