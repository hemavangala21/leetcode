class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> dup= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(dup.containsKey(nums[i])&& Math.abs(dup.get(nums[i])-i)<=k){
                return true;
            }
            else{
                dup.put(nums[i],i);
            }
        }
        return false;
    }
}