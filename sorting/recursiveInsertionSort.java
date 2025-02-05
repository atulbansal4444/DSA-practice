class Solution {
    // Please change the array in-place
    void sort(int arr[], int n) {
        if (n <= 1) {
            return;
        }
        
        sort(arr, n-1);
        
        int last = arr[n - 1];
        int j = n - 2;
        
        while(j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        
        arr[j + 1] = last;
    }

    public void insertionSort(int arr[]) {
        // code here
        sort(arr, arr.length);
        // for (int i = 1; i < arr.length; i++) {
        //     int key = arr[i];
        //     int j = i - 1;

        //     for (; j >= 0 && arr[j] > key; j--) {
        //         arr[j + 1] = arr[j];
        //     }
            
        //     arr[j + 1] = key;
        // }
    }
}
