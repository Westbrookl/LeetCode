
public class Solution {
	/*
	 * ���������ƶ���������ԭ����������ϸı�����
	 * 
	 * ����Ҫ���ǵ����µ�����Ӧ����ô�����ƶ�
	 * �����µ�ָ�뽨�����µ��������棬��������������Ҫ��Ҫ��������
	 * ��Ҫ���µ��������渳ֵ
	 * ������������Ҫɾ��������á�
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
