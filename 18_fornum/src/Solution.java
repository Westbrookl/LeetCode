import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * 对于多个数求和的问题
 * 去重的意思是把数组中可能重复出现的结果删除，实现的主要方法是比较，如果当前值和前面的一个值相等的话就直接跳过。
 * 对于最后两个数的求值，则直接是利用循环判断然后输++
 * 
 * 这里一般都定义双指针的做法，双指针的做法可以使我们更快的遍历数组。
 * 
 * 
 * 
 * 
 */
public class Solution {
	public static List<List<Integer>> fornum(int[] nums,int target){
		int length = nums.length;
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<List<Integer>>();//初始化容器的问题
		if(length<4){
//			List<Integer> temp = new ArrayList<Integer>();
			
//			temp.addAll(Arrays.asList(nums)); addAll
//			for(int i=0;i<length;i++){
//				temp.add(nums[i]);
//			}
//			result.add((ArrayList<Integer>) temp);
			return result;
		}
		for(int i=0;i<length-2;i++){
			if(i>0&&nums[i]==nums[i-1]){
				continue;
			}
			for(int j=i+1;j<length-1;j++){
				if(j>i+1&&nums[j]==nums[j-1]){
					continue;
				}
				int l=j+1;
				int r=length-1;
				while(l<r){
					int temp = nums[i]+nums[j]+nums[l]+nums[r];
					if(temp==target){
						List<Integer> temp1 = new ArrayList<Integer>();
						temp1.add(nums[i]);
						temp1.add(nums[j]);
						temp1.add(nums[l]);
						temp1.add(nums[r]);
						result.add(temp1);
						while(l<r&&nums[l]==nums[l+1]) l++;
						while(l<r&&nums[r]==nums[r-1]) r--;
						l++;
					}else if(temp<target){
						l++;
					}else{
						r--;
					}
				}
			}
		}
		return result;
	}
	public static void main(String[] args){
		int[] nums = {1,-1,0,0,-2,2};
		System.out.println(fornum(nums,0));
	}
}
