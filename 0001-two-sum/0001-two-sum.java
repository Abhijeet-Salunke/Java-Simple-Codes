class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            mp.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            int ans = target - nums[i];
            if(mp.containsKey(ans) && mp.get(ans) != i){
                return new int[]{i, mp.get(ans)};
            }
        }
        return new int[] {}; 
    }
}