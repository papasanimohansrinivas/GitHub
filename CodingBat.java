class CodingBat{

	public static  boolean sameFirstLast(int[] nums) {
		System.out.println(nums[0]);
		if(nums[0]==nums[nums.length-1]){
			return true;
		}
		else{
			return false;
		}
	}

	public static void main(String[] args) {

		int y [] = new int[]{};
		System.out.println(sameFirstLast(y));
	}
}