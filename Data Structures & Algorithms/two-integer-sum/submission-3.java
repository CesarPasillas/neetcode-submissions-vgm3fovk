class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (var i = 0; i < nums.length; i++) {
            for (var j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
