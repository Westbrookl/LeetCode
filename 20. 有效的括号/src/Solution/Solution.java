package Solution;

import java.util.Stack;
/*
 * 栈适合解决的问题是用来类型匹配，按照先后顺序进行匹配。先索引的进行压栈，然后依次弹出。
 * 
 * 
 * 
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串
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
		return st.isEmpty();
	}
	public static void main(String[] args){
		String s1 = "(){}[]";
		String s2 = "(){}{]";
		System.out.println(isValid(s1));
		System.out.println(isValid(s2));
	}
}
