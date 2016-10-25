import java.util.Scanner;
class balanced_braces{
	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);

		String e = "()[]";
	
		System.out.println(isBalanceed(e));
	}
	public  static boolean isBalanceed(String r){
		stack t = new stack(2);

		boolean d = true;

		for(int e=0;e<r.length();e++){
			if(r.charAt(e)=='{'||r.charAt(e)=='['||r.charAt(e)=='('){
				t.push(r.charAt(e));
			}
			else{
				if(r.charAt(e)=='}'||r.charAt(e)==']'||r.charAt(e)==')'){
					char y = t.pop();
					if(y=='['||y=='('||y=='{'){

					}
					else{
						d=false;
					}
				}				
			}


		}
		if(t.isempty()){
			d=true;

		}
		else{
			d=false;
		}

		return d;

	}
	
}

class stack{
	char g[];
	int size;
	public stack(int length){

		g = new char[length];
		size=0;

	}
	public void push(char element){
		
		if(size==capacity()){
			resize();
		}
		g[size]=element;
		size++;
		
		

	}
	public char pop(){

		char w = g[size];
		g[size]='0';


		return w;

	}
	public void resize(){
		char e[] =new char[2*g.length];

		for(int u=0;u<g.length;u++){
			e[u]=g[u];
		}

		g=e;
	}
	public int capacity(){
		int capacity = g.length;
		return capacity;
	}
	public boolean isempty(){

		int count =0;
		for(int j=0;j<g.length;j++){
			if(g[j]==0){
				count++;
			}

		}
		if(count==0){
			return true;
		}
		else{
			return false;
		}
	}

}