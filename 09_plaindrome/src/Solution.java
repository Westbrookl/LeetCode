
 class Solution {
	static boolean isPlaindrome(int i){
		boolean flag =true;
		String s =i+"";
		int length = s.length();
		for(int j=0;j<length;j++){
			if(s.charAt(j) != s.charAt(length-1-j)){
				flag = false;
			}
		}
		return flag;
	}
	/*
	 * 不转换成为字符串
	 * 
	 */
	static boolean isPlaindrome1(int i){
		boolean flag = true;
		if(Math.abs(i)<10){
			return flag;
		}
		int temp = i;
		int j = 0;
		int k=1;
		while(temp != 0){
			j = j*10+temp % 10;	
			temp = temp/10;
		}
		
		if(j!=i){
			flag = false;
		}
		
		return flag;
	}
	public static void main(String[] args){

		System.out.println(isPlaindrome1(-123));


	}
}
