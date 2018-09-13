package Solution;

import java.util.Stack;
/*
 * ջ�ʺϽ������������������ƥ�䣬�����Ⱥ�˳�����ƥ�䡣�������Ľ���ѹջ��Ȼ�����ε�����
 * 
 * 
 * 
����һ��ֻ���� '('��')'��'{'��'}'��'['��']' ���ַ������ж��ַ����Ƿ���Ч��

��Ч�ַ��������㣺

�����ű�������ͬ���͵������űպϡ�
�����ű�������ȷ��˳��պϡ�
ע����ַ����ɱ���Ϊ����Ч�ַ���
 * 
 */
public class Solution {
	public static boolean isValid(String s){
		Stack<Character> st = new Stack<Character>();
		for(char c : s.toCharArray()){
			if(c == '('){
				st.push(')');
			}else if(c == '['){
				st.push(']');
			}else if(c == '{'){
				st.push('}');
			}else if(st.empty() || st.pop()!=c){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		String s1 = "(){}[]";
		String s2 = "(){}{]";
		System.out.println(isValid(s1));
		System.out.println(isValid(s2));
	}
}
