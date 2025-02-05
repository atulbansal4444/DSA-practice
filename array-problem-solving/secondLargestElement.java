class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int max = arr[0];
        int secondMax = -1;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        
        return secondMax;
    }
}
