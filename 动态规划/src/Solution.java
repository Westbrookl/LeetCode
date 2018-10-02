/**
 * 动态规划一般是用来求解最优解的思想
 *
 * 动态规划有两种形式
 *  1第一种是从下往上的动态规划
 *      从下往上的动态规划是不采用递归每次查找出当前所能取到的最优解，然后循环上去继续求解
 *  2第二种是从上往下的动态规划
 *      从上往下的动态规划则采取的是递归的方式实现的。
 *          分为两种形式，第一种是创建一个数组保存下来每次目前的最优值
 *          第二种形式就是不管当前值的内容直接进行输出当前的内容便可以继续计算。
 *
 *  例题的题目是计算出当钢管的长度为N时，怎么截取才能取到价值最合适的钢材
 *   *切割钢条问题：
 *  *长度：1	2	3	4	5	6	7	8	9	10
 *  *价格：1	5	8	9	10	17	17	20	24	30
 *
 */
public class Solution {
    private static int[] prices={0,1,5,8,9,10,17,17,20,9,24};//这里的设置也很巧妙，这样设置便可以是我们的长度与价格的下标能够完美的匹配到了一起
    private static int[] dp = new int[prices.length];

    /**
     * 从上往下的第二种形式，不需要记录下n时候的最优解的值
     */
    public static int solve(int[] prices,int n){
        if(n == 0) return 0;
        int max = Integer.MIN_VALUE;
    //对于这个问题俩说的最优子结构就是 要用当前长度的价值+上剩余长度的最大的值。所以遍历一下就可以找到了所有的解
        for(int i=1;i<=n;i++){
            max = Math.max(max,prices[i]+solve(prices,n-i));
        }
        return max;
    }
    public  static int upToBotoom(int[] prices,int n){
        if(n==0 || dp[n]>0) return dp[n];//值得注意的是因为在数组的初始化的过程中在成员变量的值默认值都是0，而这里又对当前最优解已经进行了处理
        int max = Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){//这里一定是要从1到n这里比较的是线段长度的变化的循环。
            max = Math.max(max,prices[i]+solve(prices,n-i));
        }
        dp[n]=max;//这一步主要的目的是把每次的结果存储起来
        return max;
    }

    /**
     * 这种就有点不是很像动态规划了
     * 因为每次切割都会出现两段这样就需要把所有的情况都考虑进去然后求出所有的最大的值。
     * 而不是采用递归的方法。
     * 递归是在存在最有子结构的时候的结合成为的动态规划的算法。
     * @param prices
     * @param n
     * @return
     */
    public static int botoomToUp(int[] prices,int n){
        int[] dp1 = new int[prices.length];
        int max = Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){//切分从1，到 i的各种情况都得考虑到
                max = Math.max(max,prices[j]+prices[i-j]);//
            }
            dp1[i] = max;
        }
//        dp[n] = max;
        return dp1[n];
    }

    public static void main(String[] args){
        System.out.println(botoomToUp(prices,1));
        System.out.println(botoomToUp(prices,2));
        System.out.println(upToBotoom(prices,3));
        System.out.println(solve(prices,1));
    }

}
