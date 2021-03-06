
public class Solution {
	public static int divide(int dividend,int divisor){
		if(dividend==0||divisor==0){
			return 0;
		}
		boolean flag = true;
		if(dividend>0&&divisor>0 || dividend<0&&divisor<0){
			flag = false;
		}
		/*
		 * 当涉及到int范围的时候 一般需要把int向上转型为Long的类型
		 */
		long count = 0;
		long abs1 = Math.abs((long)dividend);//如果这里时直接用int类型的话，当dividend的类型为Integer.MIN_VALUE时将无法转换
		long abs2 = Math.abs((long)divisor);
		while(abs1>=abs2){
			/*
			 * 我的做法是直接将
			 * abs1 -= abs2;
			 * count += temp;
			 * temp = temp<<1;
			 * abs2 = abs2<<1;
			 * 这样做法在于有可能在没有计数的情况下直接跳过最后比如 7/3
			 */
			long count_temp = 1;
			long temp = abs2;//这里实际上是进行的最后一步的操作
			while(abs1>=temp){
				abs1 -= temp;
				count += count_temp;
				count_temp=count_temp <<1;
				temp = temp<<1;
			}
		}
		if(flag){
			count = -count;
		}
		if(count<Integer.MIN_VALUE || count>Integer.MAX_VALUE){
			return Integer.MAX_VALUE;
		}else{
			return (int)count;
		}
//		if(Math.abs(dividend)<Math.abs(divisor)){
//			return 0;
//		}
//		if(divisor==0){
//			return 0;
//		}
//		boolean flag = false;
//		if(dividend <0 ){
//			flag = !flag;
//		}
//		if(divisor<0){
//			flag=!flag;
//		}
//		int count=0;
//		int abs1 = Math.abs(dividend);
//		int abs2 = Math.abs(divisor);
//		while(abs1 > abs2){
//			abs1 -= abs2;
//			count++;
//		}
//		if(count>Math.pow(2, 31)-1){
//			return (int)(Math.pow(2, 31)-1);
//		}
//		if(flag){
//			count = 0-count;
//		}
//		return count;
	}
	public static void main(String[] args){
		int a = divide(-2147483648,-1);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Math.abs(-1));
		
	}
}
