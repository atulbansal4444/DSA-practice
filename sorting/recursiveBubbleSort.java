class Solution {
    // Function to sort the array using bubble sort algorithm.
    static void sort(int arr[], int n) {
        if (n == 1) {
            return;
        }
        int c = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int ref = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = ref;
                
                c++;
            }
        }
        
        if (c == 0) return;
        
        sort(arr, n - 1);
    }
    public static void bubbleSort(int arr[]) {
        // code here
        sort(arr, arr.length);
    }
}
