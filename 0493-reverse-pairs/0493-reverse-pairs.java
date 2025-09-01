class Solution {
    private int count = 0;

    private void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); 
        int left = low;    
        int right = mid + 1; 

        
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    private void countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        for (int i = low; i <= mid; i++) {
            while (right <= high && (long)arr[i] > 2L * arr[right]) {
                right++;
            }
            count += (right - (mid + 1));  
        }
    }

    private void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);      
        mergeSort(arr, mid + 1, high); 
        countPairs(arr, low, mid, high);
        merge(arr, low, mid, high);    
    }

    public int reversePairs(int[] nums) {
        count = 0; 
        mergeSort(nums, 0, nums.length - 1);
        return count;
    }
}
