import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * res.addAll();
 * addAll�������ڽ�ָ�� collection �е�����Ԫ�����ӵ��б���

�﷨1  ���ڽ�ָ��collection�е�����Ԫ�����ӵ��б���β����
���List���϶������ڵ���addAll�������������ģ��򷵻�true�����ǰѼ��ϵ������������ӵ���������ȥ��

 *2 ���ڵ�һ��ʹ�ö�ά����
 *
 * 
 * 3 Arrays.asList()
 * ����������ת����Ϊһ��List���ϡ�
 *    public static <T> List<T> asList(T... a) {
        return new ArrayList<>(a);
    }
 */

public class Soulution {
	public static List<String>letterCombinations(String digts){
		String[][] map = new String[][]{
			{"a","b","c"},
			{"d","e","f"},
			{"g","h","i"},
			{"j","k","l"},
			{"m","n","o"},
			{"p","q","r","s"},
			{"t","u","v"},
			{"w","x","y","z"}
		};
		List<String> res = new ArrayList<String>();
		int first = digts.charAt(0)-'0'-2;
		if(digts.length()==0){
			return null;
		}
		
		if(digts.length()==1){
			res.addAll(Arrays.asList(map[first]));//���Ǻܶ�
			return res;
		}
		String[] current = map[first];
		List<String> leftList = letterCombinations(digts.substring(1));
		for(String cString: current){
			for(String lString:leftList){
				res.add(cString+lString);
			}
		}
		return res;
		
	}
	public static void main(String[] args){
		String test  = "23";
		System.out.println(letterCombinations(test).toString());
	}
}