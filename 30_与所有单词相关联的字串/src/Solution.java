import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * �������ڵ�����
 * 	1��������������ǵ��ʵ�˳�����������˳��Ļ�����Ӧ�ý�������һ�������ֵ��Map��ΪMap���������û��˳��
 * 	2������һ���ֵ��Map������������ַ���ȫ����ӵ�����ȥ
 * 	3���㷨������Ҫ����Ҫ�Ǳ����ַ���
 * 		����Ҫ֪��������Ҫ�����ĳ��ȣ���ʵ����words�е��ʵĳ���
 * 		�ڶ������������Ĵ���{
 * 			��ʵ����һ��Map��Window�����Map�Ǹ������е��ַ�����ȡ��
 * 			����ȥ�����ֵ�Map�����ݰ���ȥƥ�䣬
 * 			����¼���ĵ�����Map�в����ڣ���ôWindow��Ҫ��գ��������Ҷ˵㶼Ҫ����һ�����ʵĳ���
 * 			������ڣ���ô�㴰�ڱ��Ҽ�һ������
 * 			������һ��������������������������Window�г��ֵĴ��������ֵ��г��ֵĴ�����Ļ�����ô��Ҫ��Widow�ж�������ʴ�����һ��������������Ҫ�����ƶ�
 * 			����˳��������Ǵ��ڵ���ָ��-������ָ�����words.length*words[0].length,��������������ĵ�
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
