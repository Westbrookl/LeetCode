package bubble_sort;
/*
 * ð������
 * ���Ӷ�O(n^2)
 * 
 * �����Ϊ����Ĵ���
 * �Լ�ÿ����������Ҫ�ıȽϴ�����
 * 
 * �����Ҫ�ܽ��¹���
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
