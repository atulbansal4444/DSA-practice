class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxC = 0;
        for (int i = 0; i < nums.length; i++) {
            int c=0;
            while (i < nums.length && nums[i] == 1) {
                c++;
                i++;
            }
            if (c > maxC) {
                maxC = c;
            }
        }

        return maxC;
    }
}
