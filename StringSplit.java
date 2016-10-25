import java.util.*;
import java.lang.*;
class string{
	public static void main(String[] args) {
		String str = "name ching chang field computer engineering grade 9.98";
		String[] splits = str.split("name |field |grade ");
		for(String s : splits)
			System.out.println(s);
	}
}