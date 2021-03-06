import java.util.Arrays;

public class Solution {
	public static int threeSumClosest(int[] nums, int target){
 		int length = nums.length;
		int res = 0;
		if(length<3){
			for(int i=0;i<length;i++){
				res += nums[i];
			}
			return res;
		}
		Arrays.sort(nums);
		int sum = nums[0]+nums[1]+nums[2];//初始化内容默认个内容
		for(int i=0;i<length-2;i++){
			int j= i+1;
			int k = length-1;
			while(j<k){
				int result = nums[i]+nums[j]+nums[k];
				if(Math.abs(result - target)< Math.abs( sum - target)){
					sum = result;
					if(sum == target){
						return sum;
					}
				}
				if(result>target){
					k--;
				}else{
					j++;
				}
			}
		}
		return sum;
		
	}
	public static void main(String[] args){
		int[] nums = {0,2,1,-3};
		System.out.println(threeSumClosest(nums,1));
	}
}
