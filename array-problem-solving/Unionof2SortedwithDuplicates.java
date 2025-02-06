class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        int i = 0;
        int j = 0;
        while(i < a.length && j < b.length) {
            if (arr.size() > 0 && arr.get(arr.size() - 1) == a[i]) {
                i++;
            } else if (arr.size() > 0 && arr.get(arr.size() - 1) == b[j]) {
                j++;
            } else {
                if (a[i] < b[j]) {
                    arr.add(a[i]);
                    i++;
                } else {
                    arr.add(b[j]);
                    j++;
                }   
            }
        }
        
        while(i < a.length) {
            if (arr.size() > 0 && arr.get(arr.size() - 1) == a[i]) {
                i++;
            } else {
                arr.add(a[i]);
                i++;   
            }
        }
        
        while(j < b.length) {
            if (arr.size() > 0 && arr.get(arr.size() - 1) == b[j]) {
                j++;
            } else {
                arr.add(b[j]);
                j++;
            }
        }
        
        return arr;
    }
}
