public int maximumGap(int[] nums) {
    int i = 1;
    int maximum = 0;
    Arrays.sort(nums);
    while (nums.length > 1 && i < nums.length) {
        maximum = Math.max(maximum,(nums[i]-nums[i-1]));
        i++;
    }
    return maximum; 
} 
