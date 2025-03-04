class Solution(object):
    def longestConsecutive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        num_set = set(nums) 
        longest_seq = 0
        for num in num_set:
            if num - 1 not in num_set:
                current_num = num
                current_streak = 1
            while current_num + 1 in num_set:
                current_num += 1
                current_streak += 1
            longest_seq = max(longest_seq, current_streak)
        return longest_seq