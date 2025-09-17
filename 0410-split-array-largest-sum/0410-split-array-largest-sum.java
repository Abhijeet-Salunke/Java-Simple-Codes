class Solution {
    public int splitArray(int[] nums, int k) {
        int min = 0, max = 0;
        for(int i : nums){
            min = Math.max(min, i);
            max += i;
        }

        while(min < max){
            int mid = min + (max - min) / 2;

            int sum = 0;
            int partition = 1;
            for(int num : nums){
                if(sum + num > mid){
                    sum = num;
                    partition++;
                }
                else{
                    sum += num;
                }
            }

            if(partition > k){
                min = mid + 1;
            }
            else{
                max = mid;
            }
        }
        return min;
    }
}