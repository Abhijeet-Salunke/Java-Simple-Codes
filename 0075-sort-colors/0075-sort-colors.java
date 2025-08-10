class Solution {
    public void sortColors(int[] nums) {
        int a = 0, b = 0, c = 0;
        for(int i = 0;i < nums.length; i++){
            if(nums[i] == 0){
                a++;
            }
            else if(nums[i] == 1){
                b++;
            }
            else{
                c++;
            }
        }
        int count = 0;
        while(a > 0){
            nums[count] = 0;
            count++;
            a--;
        }
        while(b > 0){
            nums[count] = 1;
            count++;
            b--;
        }
        while(c > 0){
            nums[count] = 2;
            count++;
            c--;
        }
    }
}