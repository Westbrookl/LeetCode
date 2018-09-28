
public class Solution {
	/*
	 * 关于数组移动的问题在原数组的内容上改变内容
	 * 
	 * 我们要考虑的是新的数组应该怎么样的移动
	 * 所以新的指针建立在新的数组上面，对于满足我们需要的要留下来的
	 * 需要在新的内容里面赋值
	 * 不满足条件需要删除的则搁置。
	 * 
	 * 
	 * 
	 * 
	 */
	public static int removeElement(int[] nums,int val){
		int count=0;
		int length = nums.length;
		if(nums==null || nums.length ==0){
			return 0;
		}
		for(int i=0;i<length;i++){
//			if(nums[i]==val){
//				count++;
//				
//			}
			if(nums[i]!=val){
				nums[count]=nums[i];
				count++;
			}
		}
		return count;
	}
}
