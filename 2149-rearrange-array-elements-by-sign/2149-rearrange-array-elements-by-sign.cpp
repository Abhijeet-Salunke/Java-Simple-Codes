class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        vector<int>positive,negative;
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]>=0) positive.push_back(nums[i]);
            else negative.push_back(nums[i]);
        }
        int n=positive.size();
        nums.clear();
        for(int i=0;i<n;i++)
         {
            nums.emplace_back(positive[i]);
            nums.emplace_back(negative[i]);
         }
         return nums;
    }
};