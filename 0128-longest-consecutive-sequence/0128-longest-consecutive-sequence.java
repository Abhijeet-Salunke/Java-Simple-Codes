class Solution {
    public int longestConsecutive(int[] nums) {
       //if(nums.length < 2) return nums.length;
       Set<Integer> s = new HashSet<>();
       for(int i : nums){
            s.add(i);
       }
       if(s.size() <= 1) return s.size();
       int max = 0; 
       for(int i : s){
            int length = 1;
            if(!(s.contains(i - 1))){
               length = 1;
            }
            while(s.contains(i + length)){
                length++;
               
            }
            max = Math.max(max, length);
       }
       return max;
    }
}