import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * res.addAll();
 * addAll方法用于将指定 collection 中的所有元素添加到列表。

语法1  用于将指定collection中的所有元素添加到列表的尾部。
如果List集合对象由于调用addAll方法而发生更改，则返回true。就是把集合的内容依次添加到集合里面去。

 *2 关于第一次使用二维数组
 *
 * 
 * 3 Arrays.asList()
 * 将任意类型转换成为一个List集合。
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
			res.addAll(Arrays.asList(map[first]));//不是很懂
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
