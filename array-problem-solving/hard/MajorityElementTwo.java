// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

// Example 1:
// Input: nums = [3,2,3]
// Output: [3]

// Example 2:
// Input: nums = [1]
// Output: [1]

// Example 3:
// Input: nums = [1,2]
// Output: [1,2]

// Constraints:
// 1 <= nums.length <= 5 * 104
// -109 <= nums[i] <= 109
 
// Follow up: Could you solve the problem in linear time and in O(1) space?


class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        List <Integer> ls = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int c = 0;
            if (hm.containsKey(nums[i])) {
                c = hm.get(nums[i]);
                hm.put(nums[i], c + 1);
                c = c + 1;
            } else {
                hm.put(nums[i], 1);
                c = 1;
            }

            if (!ls.contains(nums[i]) && c > nums.length / 3) {
                ls.add(nums[i]);
            }
        }
        return ls;
    }
}
