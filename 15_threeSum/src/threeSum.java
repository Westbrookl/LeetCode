import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * 
 * 
 * 1 对于排序的用法 Comparable？
 * 
 * 2 对于List集合接口的使用
 * 
 * 3 关于何处如何循环
 * 
 * 
 * 
 * 
 */

public class threeSum {
	public static List<List<Integer>> threeSum(int[] arr){
		
		List<List<Integer>> result=new ArrayList();
		int total=0;	
		int length  = arr.length;
		Arrays.sort(arr);
		for(int i=0;i<length;i++){
			if(arr[i]==0){
				total+=1;
			}
		}
		if(total == length){
			List temp = new ArrayList();
			temp.add(0);
			temp.add(0);
			temp.add(0);
			result.add(temp);
			return result;
		}
		
		for(int i=0;i<length-2;i++){
			if(arr[i]>0){
				
				break;
			}else{
				int j = i+1;
				int k = length-1;
				for(;j<k;){
					if(arr[j]+arr[k]>Math.abs(arr[i])){
						k--;
					}else if(arr[j]+arr[k]==Math.abs(arr[i])){
					List<Integer> temp = new ArrayList();
					temp.add(arr[i]);
					temp.add(arr[j]);
					temp.add(arr[k]);
						if(!result.contains(temp)){
							result.add(temp);
						}
						j++;
					}else{
						j++;
					}
				}
			
				if(j>=k) continue;
			}
		}
		
		return result;
	}
	public static void main(String[] args){
		int[] nums = {0,0,0,0};
		System.out.println(threeSum(nums));
	}
}
