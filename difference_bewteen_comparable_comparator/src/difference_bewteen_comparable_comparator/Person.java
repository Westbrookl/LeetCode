package difference_bewteen_comparable_comparator;
/*
 * Comparable<T> 是一个泛型 要指定比较对象的类型。
 * 实现的是一个内部比较器，需要修改源码
 * 而Comparator是一个外部比较器
 * 
 * 
 * 
 */
public class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Person p) {
		// TODO Auto-generated method stub
		return this.age-p.getAge();
	}
	
}
