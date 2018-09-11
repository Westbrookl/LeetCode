/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 * 思路是对于个位十位百位和千位的组成虽然不同，但是大题上的构建思路是一样的。就是对于不同的位数采用不同的方案。
 * 
 * 
 * 算法基本思想:  这个题仅仅要求到3999比较简单，根据罗马数字的构建数字的规则，
 * 无论个位十位百位还是千位都有相同的构造方法，但是所表示的字母是不同的，所以我想到去写一个函数，
 * public String intToCharacter(int n,int i)，n表示数位上的数字，
 * i表示要转化的整数从右到左第几位，这个函数可以把单独的数字转化成罗马字母，
 * 在public String intToRoman(int num) 函数中，传入要转化的整数num,
 * 然后依次从右向左取出各位，依次求相应罗马数字，并进行字符串拼接，就能得到所需要的结果。
 * 
 */
public class Solution {
	public static String intToRoman(int number){
		String result="";
		int i=1;
		int temp;
		while(number>0){
			temp = number%10;
			number = number/10;
			result = toString(temp,i)+result;
			i++;
		}
		return result;
	}
	public static String toString(int temp,int i){
		String res = "";
		
		String str1;
		String str2;
		String str3;
		if(i==1){
			str1="I";
			str2="V";
			str3="X";
		}else if(i==2){
			str1 = "X";
			str2 = "L";
			str3 = "C";
		}else if(i==3){
			str1 = "C";
			str2 = "D";
			str3 = "M";
		}else{
			str1 ="M";
			str2 = "";
			str3 = "";
		}
		switch(temp){
			case 0:break;
			case 1:res += str1;break;
			case 2:res =res +str1+str1;break;
			case 3:res =res +str1+str1+str1;break;
			case 4:res = res +str1+str2;break;
			case 5:res = res + str2;break;
			case 6:res = res + str2+str1;break;
			case 7:res = res + str2 + str1 + str1;break;
			case 8:res = res + str2 + str1 + str1 + str1;break;
			case 9:res = res + str2 + str3;break;	
		}
		return res;				
	}
	public static void main(String[] args){
		int i = 3;
		int z = 13;
		int x = 140;
		int x1 = 1400;
		System.out.println(intToRoman(i));
		System.out.println(intToRoman(z));
		System.out.println(intToRoman(x));
		System.out.println(intToRoman(x1));
		
	}
}
