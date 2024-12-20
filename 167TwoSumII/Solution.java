class Solution {
    public int[] twoSum(int[] numbers, int target) {
      int left = 0;
      int right = numbers.length-1;
      int sum = 0;
      int[] index = new int[2];

      while (left < right) {
        sum = numbers[left] + numbers[right];
        if (sum == target) {
            index[0] = left + 1;
            index[1] = right +1;
            return index;
        } else if (sum < target) {
            left++;
        } else {
            right--;
        }
      }
      return index;
    }
}
