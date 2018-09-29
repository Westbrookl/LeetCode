import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 滑动窗口的问题
 * 	1：首先这个不考虑单词的顺序，如果不考虑顺序的话首先应该建立的是一个关于字典的Map因为Map里面的内容没有顺序
 * 	2：创建一个字典的Map，数组里面的字符串全部添加到里面去
 * 	3：算法中最重要的是要是遍历字符串
 * 		首先要知道我们需要遍历的长度，其实就是words中单词的长度
 * 		第二个创建滑动的窗口{
 * 			其实就是一个Map（Window）这个Map是根据现有的字符串截取的
 * 			用来去按照字典Map的内容挨个去匹配，
 * 			如果新加入的单词在Map中不存在，那么Window便要清空，并且左右端点都要右移一个单词的长度
 * 			如果存在，那么便窗口便右加一个单词
 * 			但是有一个特殊的情况就是如果这个单词在Window中出现的次数比在字典中出现的次数多的话，那么需要从Widow中对这个单词次数减一，并且整个窗口要向右移动
 * 			最后退出的条件是窗口的右指针-窗口左指针等于words.length*words[0].length,这便是满足条件的点
 * 		}
 * @author jhc
 *
 */
public class Solution {
	public static List<Integer> findSubString(String s,String[] words){
		List<Integer> result = new ArrayList<>();
		if(s.length()==0||s==null || words.length==0||words==null){
			return result;
		}
		int length = words[0].length();
		Map<String,Integer> map = generateMap(words);
		for(int i=0;i<length;i++){
			int left = i;
			int right =i;
			Map<String,Integer> window = new HashMap<>();
			while(right<=s.length()-length && left<=s.length()-length*words.length){
				String temp1 = s.substring(right, right+length);
				window = incr(window,temp1);
				if(!map.containsKey(temp1)){
					window.clear();
					right += length;
					left = right;
					continue;
				}
				while(window.get(temp1)>map.get(temp1)){
					window = desc(window,s.substring(left,left+length));
					left += length;
					
				}
				right += length;
				if(right-left == length*words.length){
					result.add(left);
					
				}
			}
		}
		return result;

	}
	public static Map<String,Integer> generateMap(String[] words){
		Map<String,Integer> temp = new HashMap<>();
		for(String word:words){
			temp = incr(temp,word);
		}
		return temp;
	}
	public static Map<String,Integer> incr(Map<String,Integer> temp,String word){
		if(temp.containsKey(word)){
			temp.put(word, temp.get(word)+1);
		}else{
			temp.put(word, 1);
		}
		return temp;
	}
	public static Map<String,Integer> desc(Map<String,Integer>temp,String word){
		if(temp.containsKey(word)){
			Integer value = temp.get(word);
			if(value<=1){
				temp.remove(word);
			}else{
				temp.put(word, value-1);
			}
		}
		return temp;
	}
	public static void main(String[] args){
		String s =  "barfoothefoobarman";
		String[] words = {"bar","foo"};
		System.out.print(findSubString(s,words).toString());
	}
}
