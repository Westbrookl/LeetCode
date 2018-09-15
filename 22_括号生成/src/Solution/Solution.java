package Solution;

import java.util.ArrayList;
import java.util.List;

/*
 * 利用回溯的思想递归的生成括号。具体来说记录当前剩余左括号数left，剩余右括号数right，当前的生成括号字符串s，进行如下操作：

	若left为0，说明左括号已全部打印完，所以将剩余的右括号全部打印出来并加入到结果集
	若right>left，即当前字符串中的左括号还有未匹配到的右括号，此时有两种选择：继续打印一个左括号或者匹配打印一个右括号，再对这两种选择分别递归判断
	若left和right相等，即当前字符串中的左括号全部有匹配到的右括号，此时只能再打印一个左括号，再递归判断
 * 
 * 
 * 
 */
public class Solution {
	public static List<String> generateParenthesis(int n){
		List<String> res = new ArrayList<String>();
		traceBack(res,"",n,n);
		return res;
	}
	public static void traceBack(List<String> res,String temp,int left,int right){
		if(left == 0){
			while(right!=0){
				temp+=")";
				right--;
			}
			res.add(temp);
		}else if(left < right){
			traceBack(res,temp+"(",left-1,right);
			traceBack(res,temp+")",left,right-1);
		}else{
			traceBack(res,temp+"(",left-1,right);
		}
	}
	public static void main(String[] args){
		List<String> r = new ArrayList<String>();
		r = generateParenthesis(3);
		System.out.println(r);
	}
}
