package digui_erfen;
/*
 * 递归也是从一半开始递归，递归排序
 * 
 * 汉诺塔问题
 * 汉诺塔是一个发源于印度的益智游戏，也叫河内塔。相传它源于印度神话中的大梵天创造的三个金刚柱，
 * 一根柱子上叠着上下从小到大64个黄金圆盘。大梵天命令婆罗门将这些圆盘按从小到大的顺序移动到另一根柱子上，
 * 其中大圆盘不能放在小圆盘上面。当这64个圆盘移动完的时候，世界就将毁灭。
 * 
 *  解题思路
 *  
 *  可以把上面的n-1个盘子当做一个整体，把下面的一个当做一个目标，改动完前面饿n-1个以后，把大盘子移动以后还得继续移动
 * 小盘子。 
 */
public class digui {
	public static void hanoti(int n,char a,char b,char c){
		if(n==1){
			move(a,c);
		}
		if(n>1){
			hanoti(n-1,a, c , b);
			move(a,c);//这一步直接输出的原因是因为a,c之间没有空的柱子，不用调换位置。
			hanoti(n-1,b,a,c);
		}
	}
	public static void move(char a,char c){
		System.out.println("move "+a+"------>"+c);
	}
	public static void main(String[] args){
		
	
		hanoti(3,'a','b','c');
	}
}
