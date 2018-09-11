/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 * ˼·�Ƕ��ڸ�λʮλ��λ��ǧλ�������Ȼ��ͬ�����Ǵ����ϵĹ���˼·��һ���ġ����Ƕ��ڲ�ͬ��λ�����ò�ͬ�ķ�����
 * 
 * 
 * �㷨����˼��:  ��������Ҫ��3999�Ƚϼ򵥣������������ֵĹ������ֵĹ���
 * ���۸�λʮλ��λ����ǧλ������ͬ�Ĺ��췽������������ʾ����ĸ�ǲ�ͬ�ģ��������뵽ȥдһ��������
 * public String intToCharacter(int n,int i)��n��ʾ��λ�ϵ����֣�
 * i��ʾҪת�����������ҵ���ڼ�λ������������԰ѵ���������ת����������ĸ��
 * ��public String intToRoman(int num) �����У�����Ҫת��������num,
 * Ȼ�����δ�������ȡ����λ����������Ӧ�������֣��������ַ���ƴ�ӣ����ܵõ�����Ҫ�Ľ����
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
