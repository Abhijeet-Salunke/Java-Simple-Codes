class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(nums.size()<2)return nums.size();
        int max1=0;
        int count=1;
        sort(nums.begin(),nums.end());
        for(int i=1;i<nums.size();i++)
        {
           if(nums[i]==nums[i-1])continue;
           else if(nums[i]==nums[i-1]+1)
            {
                count++;
            }
            else 
            {
                max1=max(max1,count);
                count=1;
            }
        }
        return  max(max1,count);
    }
};