
public class SumOfNumbers {
	
	public static int[] twoSum(int[] nums, int target) {
		boolean isTrue = false;
		int[] result= new int[2];
		 
		for(int i=0;i< nums.length;i++) {
			for(int j=i+1;j < nums.length;j++) {
				if(nums[i]+nums[j] == target) {
					isTrue = true;
					result[0] = i;
					result[1] = j;
				}else {
					isTrue = false;
					
				}
				
			}
			
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		return result;
		
	}
	
	
	
	
	public static void main(String args[]) {
		int[] nums = {2,7,11,15};
		int target =9;
		System.out.println(twoSum(nums,target));
		
	}
}
