/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 * 示例 1：
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 */
class Solution {
    public int climbStairs(int n) {

        int pre1 = 2, pre2 = 1;
        int count = 0;
        while (--n > 0) {
            count = pre1 + pre2;
            pre2 = pre1;
            pre1 = count;
        }
        return pre2;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(1));
        System.out.println(new Solution().climbStairs(2));
        System.out.println(new Solution().climbStairs(3));
        System.out.println(new Solution().climbStairs(4));
        System.out.println(new Solution().climbStairs(5));
    }
}
