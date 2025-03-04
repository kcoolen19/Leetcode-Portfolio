class Solution {
    public int longestConsecutive(int[] nums) {
        int longest_seq = 0;
        if (nums.length == 0) {
            longest_seq = 0; 
        }
        Arrays.sort(nums); 
        int longest = 1; 
        int streak = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { 
                if (nums[i] - nums[i - 1] == 1) {
                    streak++;
                } else {
                    longest = Math.max(longest, streak); 
                    streak = 1; 
                }
            }
        }
        if (nums.length > 0) {
            longest_seq = Math.max(longest, streak);
        }
        return longest_seq;
    }
}
