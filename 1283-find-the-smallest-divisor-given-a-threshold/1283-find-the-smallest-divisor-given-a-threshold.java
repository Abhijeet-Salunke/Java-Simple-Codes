class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int min = 1;
        int max = 0;
        for(int i : nums){
            max = Math.max(max, i);
        }
        while(min < max){
            int mid = min + (max - min) / 2;

            if((checkExceedThreshold(nums, threshold, mid)) == true){
                max = mid;
            }
            else {
                min = mid + 1;
            }
        }
        return min;
    }
    private boolean checkExceedThreshold(int[] nums, int threshold, int mid){
        int total = 0;
        for(int i : nums){
            total += (int) Math.ceil((double)i / mid);
        }
        return total <= threshold;
    }
}