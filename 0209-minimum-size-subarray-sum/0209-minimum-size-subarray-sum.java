class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int min = n+1, total = 0;
        int j = 0;
        for(int i = 0; i < n; i++){
            total += nums[i];
            while(total >= target){
                total -= nums[j];  
                min = Math.min(min, i - j + 1);
                j++;
            } 
        }
        if(min==n+1)return 0;
        return min;
    }
}