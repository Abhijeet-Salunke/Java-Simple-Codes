class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums.length / 2;
        for(int i : nums){
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        int max = Integer.MIN_VALUE, key = 0;
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            if(entry.getValue() > max){
                key = entry.getKey();
                max = entry.getValue();
            }
        }
        if(max > n)
            return key;
        else
            return 0;
    }
}