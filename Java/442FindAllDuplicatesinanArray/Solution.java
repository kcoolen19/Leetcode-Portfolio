class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = (nums[i] > 0) ? nums[i] - 1 : -nums[i] -1; 
            if (nums[index] > 0) {
                nums[index] = -nums[index]; 
            } else {
                result.add(index + 1); 
        }
    }
    return result;
    }
}
