class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right){

            if(nums[left] == target || nums[right] == target){
                return true;
            }
            else if(target > nums[left]){
                left++;
            }
            else if(target < nums[right]){
                right--;
            }
            else{
                break;
            }
        } 
        return false;
    }
}