import java.util.Scanner;
class Array{
	
	int y[];

	public Array(int initialsize){
		y = new int[initialsize];

	}
	public void addAtEnd(int element){/* array is divide into half */



	}
	public void addAtFront(int element){/* array space is divided into middle*/


	}
	public void growSize(){

	}
	public void rotate(int p){



	}
	public String displayElements(){
		String e ="";
		e=e+"]";

		for(int v=0;v<y.length;v++){
			if(y[v]==0||v!=y.length-1){
				e=e+y[v]+",";
			}
		}

		e=e+"[";


		return  e;

	}

}
class TestCases{
	public static void main(String[] args){
		
	}
}