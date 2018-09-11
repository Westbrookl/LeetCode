
public class Solution {
	public static int maxArea(int[] height){
		int maxArea=0;
		int minHeight;

		int start = 0;
		int end = height.length-1;
		while(start<end){
			minHeight = height[start]<height[end]?height[start]:height[end];
			int maxTemp;
			maxTemp = (end - start)*minHeight;
			if(maxTemp>maxArea){
				maxArea = maxTemp;
			}
			if(height[start]<height[end]){
				start++;
			}else{
				end--;
			}
		}
		
		
		return maxArea;
	}
	public static void main(String[] args){
		int[] h = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(h));
	}
}
