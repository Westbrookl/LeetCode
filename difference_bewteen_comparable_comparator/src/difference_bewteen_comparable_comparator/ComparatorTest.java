package difference_bewteen_comparable_comparator;
/*
 * Comparator<T>Ҳ��Comparableһ����Ҫָ���Ƚ϶��������
 * 
 * ��Arrays.sort(Object,new Comparator�Ľӿ�)
 * 
 * ��Ҫ��дComparator�ӿ��е� compare������
 * 
 * ���ء�����������ζ�š�o1��o2С�������ء��㡱����ζ�š�o1����o2�������ء�����������ζ�š�o1����o2����
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
