
public class Solution {
	public int removeDuplicates(int[] nums){
		if(nums==null || nums.length==0){
			return 0;
		}
		int count = 1;
		int index = 1;
		for(int i=1;i<nums.length;i++){
			if(nums[i]!=nums[i-1]){
				
				nums[index] = nums[i];
				index++;
				count = 1;
			}else{
				count++;
				if(count>2){
					continue;
				}else{
					nums[index] = nums[i];
					index++;
				}
//				if(count<=2){
//					nums[index] = nums[i];
//					index++;
//				}else{
//					count = 1;
//				}
			}

			
		}
		return index;
	}
}
