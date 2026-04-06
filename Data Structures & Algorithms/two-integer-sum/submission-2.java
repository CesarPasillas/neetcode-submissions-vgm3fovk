class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];

        for (int i = 1; i < nums.length; i++){
            for (int j = i; j < nums.length; j++){
                if(nums[j-i] + nums[j] == target){
                    res[0] = j-i;
                    res[1] = j;
                    return res;
                }
            }
        }

        return res;
    }
}
