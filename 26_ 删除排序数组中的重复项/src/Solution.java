/*
 * ����ȫҲ������һ����������飬�Լ����г�Ϊ��������顣
 * ��Ҫ��˼·����ÿ�ζ����滻�ظ���Ԫ�أ�һ���µ�ָ�������������ڵ�ָ��ĵ�ַ��Ȼ��ȥ����������indexȥ�ۼӡ�
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
