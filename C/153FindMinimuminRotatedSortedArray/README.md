# DIFFICULTY: MEDIUM <br/>
Acceptance Rate: 52.1%

# CODE STATISTICS <br />
Runtime: 0 ms <br />
Beats: 100.00%

Memory: 8.33 MB <br />
Beats: 31.76%

# PROBLEM DESCRIPTION

Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times. <br />
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.


Example 1:

Input: nums = [3,4,5,1,2] <br />
Output: 1 <br />
Explanation: The original array was [1,2,3,4,5] rotated 3 times.

Example 2: 

Input: nums = [4,5,6,7,0,1,2] <br />
Output: 0 <br />
Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.

Example 3:

Input: nums = [11,13,15,17] <br />
Output: 11 <br />
Explanation: The original array was [11,13,15,17] and it was rotated 4 times. 
