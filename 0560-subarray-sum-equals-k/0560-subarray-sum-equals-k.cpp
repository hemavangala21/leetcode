class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int,int>mp;

        int sum=0,cnt=0;
        mp[0]=1;

        for(int i=0;i<nums.size();i++){
            sum=sum+nums[i];

            if(mp.find(sum-k)!=mp.end()){
                cnt=cnt+mp[sum-k];
            }

            if(mp.find(sum)!=mp.end()){
                mp[sum]++;
            }
            else{
                mp[sum]=1;
            }
        }
        return cnt;
    }
};