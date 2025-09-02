class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length <= 1) return nums[0];
        int ans = 0,max = 0;
        int currmax = 0,max1 = 0;
        int i = 0, j = 1;
        while(i < j && (j <= nums.length - 1 && i <= nums.length - 2)){
            currmax = Math.max(nums[i], nums[j]);
            ans = nums[i] * nums[j];
            max = Math.max(currmax, ans);
            max1 = Math.max(max,max1);
            i++;
            j++;
        }
        return max1;
    }
}