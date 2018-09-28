package bubble_sort;
/*
 * 冒泡排序
 * 复杂度O(n^2)
 * 
 * 排序分为排序的次数
 * 以及每次排序所需要的比较次数；
 * 
 * 这个需要总结下规律
 * 
 * 
 * 
 * 
 */
public class bubbleSort {
	public static int[] sort(int[] nums){
		int length = nums.length;
		for(int i=0;i<length-1;i++){
			for(int j=0;j<length-1-i;j++){
				if(nums[j]>nums[j+1]){
					int temp;
					temp = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
	}
	public static void main(String[] args){
		int[] nums={6,5,4,3,2,1};
		int[] res = sort(nums);
		for(int i=0;i<res.length;i++){
			System.out.print(res[i]);
		}
	}
}
