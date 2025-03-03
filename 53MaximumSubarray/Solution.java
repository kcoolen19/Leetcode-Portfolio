
class Solution {
    public int maxSubArray(int[] nums) {
        int returnSum = nums[0];
        int windowSum = nums[0];
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 1; i < nums.length;i++) {
            windowSum = Math.max(windowSum + nums[i], nums[i]);
            returnSum = Math.max(returnSum,windowSum);
        }
        return returnSum;
    }
}
