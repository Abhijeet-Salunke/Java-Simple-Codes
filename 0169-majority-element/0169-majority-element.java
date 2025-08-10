class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length / 2;
        int max = Integer.MIN_VALUE, count= 1, key = nums[0];
        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                count++;
                if(count > max){
                    max = count;
                    key = nums[i];
                }
            }
            else{
                count = 1;
            }
        }
        return key;
    }
}