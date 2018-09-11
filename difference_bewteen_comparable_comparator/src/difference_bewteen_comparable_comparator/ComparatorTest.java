package difference_bewteen_comparable_comparator;
/*
 * Comparator<T>也和Comparable一样需要指定比较对象的类型
 * 
 * 在Arrays.sort(Object,new Comparator的接口)
 * 
 * 需要重写Comparator接口中的 compare方法。
 * 
 * 返回“负数”，意味着“o1比o2小”；返回“零”，意味着“o1等于o2”；返回“正数”，意味着“o1大于o2”。
 * 
 * 
 * 
 */

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
	public static void main(String[] args){
		Person[] people = new Person[]{new Person("jhc",25),new Person("wz",12)};
		Arrays.sort(people,new PersonCompartor());
		for(Person p :people){
			System.out.println(p.getName()+"----"+p.getAge());
		}
	}
}
class PersonCompartor implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}
	
}
