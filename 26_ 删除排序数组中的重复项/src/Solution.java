/*
 * 这完全也可以是一个无序的数组，自己排列称为有序的数组。
 * 主要的思路在于每次都是替换重复的元素，一个新的指针用来保存现在的指针的地址，然后去遍历内容让index去累加。
 * 
 * 
 * 
 */
public class Solution {
	public static int removeSortedList(int[] nums){
		if(nums==null || nums.length==0){
			return 0;
		}
		int index =1;
		for(int i=1;i<nums.length;i++){
			if(nums[i]!=nums[i-1]){
				nums[index] = nums[i];
				index++;
			}
		}
		return index;
	}
}
