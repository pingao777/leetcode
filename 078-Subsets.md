给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。

说明：解集不能包含重复的子集。

示例:

输入: nums = [1,2,3]

输出:
[
[3],
[1],
[2],
[1,2,3],
[1,3],
[2,3],
[1,2],
[]
]


```java
class Solution {
    // 子集等于去掉第一个元素a得到的子集C与C中每一个单元追加上a的并集
    public List<List<Integer>> subsets(int[] nums) {
        return subsets(nums, 0, nums.length - 1);
    }

    private List<List<Integer>> subsets(int[] nums, int lo, int hi) {
        if (lo > hi) {
            List<List<Integer>> outer = new ArrayList<>();
            outer.add(new ArrayList<>());
            return outer;
        }

        int first = nums[lo];
        List<List<Integer>> rest = subsets(nums, lo + 1, hi);
        List<List<Integer>> res = new ArrayList<>();
        for (List<Integer> l : rest) {
            res.add(new ArrayList<>(l));
            l.add(first);
        }
        res.addAll(rest);
        return res;
    }
}
```
