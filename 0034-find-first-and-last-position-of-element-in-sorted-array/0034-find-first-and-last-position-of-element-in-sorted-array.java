class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = startPoint(nums, target); 
        int end = endPoint(nums, target);

        return new int[]{start, end};
    }

    private int startPoint(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        int startPoint = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                startPoint = mid;
                right = mid - 1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            } 
            else{
                right = mid - 1;
            }
        }
        return startPoint;
    }

    private int endPoint(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        int endPoint = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                endPoint = mid;
                left = mid + 1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            } 
            else{
                right = mid - 1;
            }
        }
        return endPoint;
    }
}