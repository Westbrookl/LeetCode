package Solution;

import java.util.ArrayList;
import java.util.List;

/*
 * ���û��ݵ�˼��ݹ���������š�������˵��¼��ǰʣ����������left��ʣ����������right����ǰ�����������ַ���s���������²�����

	��leftΪ0��˵����������ȫ����ӡ�꣬���Խ�ʣ���������ȫ����ӡ���������뵽�����
	��right>left������ǰ�ַ����е������Ż���δƥ�䵽�������ţ���ʱ������ѡ�񣺼�����ӡһ�������Ż���ƥ���ӡһ�������ţ��ٶ�������ѡ��ֱ�ݹ��ж�
	��left��right��ȣ�����ǰ�ַ����е�������ȫ����ƥ�䵽�������ţ���ʱֻ���ٴ�ӡһ�������ţ��ٵݹ��ж�
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
