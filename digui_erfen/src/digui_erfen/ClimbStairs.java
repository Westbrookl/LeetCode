package digui_erfen;
/*
 * 
 * 递归函数有返回值的比没有返回值的麻烦一点，因为一个函数只有一个返回值，但是递归还要求有基础情形的存在，
 * 所以还必须有if判断来终止递归。所以在每一个if或者else后边都有一个return，这样保证函数在任何一种情况下都有且仅有一个返回值。 
分析一下这个算法： 
A：如果有0个台阶，那么有0种走法，这个不用多说； 
B：如果有1个台阶，那么有1种走法； 
C：如果有2个台阶，那么有2种走法（一次走1个，走两次；一次走两个）； 
以上的B和C就是基础情形。 
D：接下来就是递归了，如果台阶数目多于2个，那么首先第一步就有两种选择：第一次走1个，或者第一次走两个。
这样除了第一次后边的走法就有了两种情形：climbStairs(n-1)和climbStairs(n-2)。这样一直递归下去，直到出现到了基础情形（即n==1或n==2的情形），递归到这个地方（基础情形），然后开始回溯 ，这就是所说的和递归密切相关的“回溯”了。回溯，顾名思义就是从结果倒着回去，找到整个过程，进而分析这个路径或者说是实现的过程。
 */
public class ClimbStairs {
	public static int climbStairs(int n){
		int i=1;
		if(n<=0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		if(n==2){
			i++;
			return i;
		}
		else{
			return climbStairs(n-1)+climbStairs(n-2);
		}
		
	}
	public static void main(String[] args){
		System.out.println(climbStairs(3));
		System.out.println(climbStairs(4));
	}
}
