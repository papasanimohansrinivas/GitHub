import java.util.*;
class q{
	public static void main(String[] args) {
		int w[] = {3, 3, 3};
		System.out.println(maxSpan(w));
	}
	public static int maxSpan(int[] nums) {
		if(nums.length==0){
			return 0;
		}
		int array[] = new int[nums.length];
		for(int v = 0;v<nums.length;v++){
			int c = leftMostIndex(nums,nums[v]);// it's deep in thought almost beleived that /*v is the number that i sent to process 
			//System.out.println(c);
			int s = rightMostIndex(nums,nums[v]);
			//System.out.println(s);
			array[v] = (s-c)+1;
		}
		Arrays.sort(array);
		System.out.println(array[nums.length-1]);
		return array[nums.length-1];
	}
	public static int leftMostIndex(int [] nums,int k){
		int g = 0;
		for(int e = 0 ; e<nums.length;e++){
			if(k == nums[e]){
				g=e;
				break;
			}
		}
		return g;
	}
	public static int rightMostIndex(int [] nums, int g){
		int a = 0;
		for(int o = nums.length-1 ;o>=0;o--){
			if(nums[o]==g){
				a=o;
				break;
			}
		}
		return a;
	}
}