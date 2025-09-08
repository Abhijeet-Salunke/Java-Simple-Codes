class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;

        if(nums.length <= 1) return 0;
        if(nums[left] > nums[left + 1]) return left;
        if(nums[right] > nums[right - 1]) return right;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]){
                return mid;
            }
            else if(nums[mid - 1] < nums[mid]){
                left =  mid + 1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }
}