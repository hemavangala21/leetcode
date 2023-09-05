class Solution {
    public void moveZeroes(int[] nums) {
        int s=0;
        int e=0;
        while(e<nums.length){
            if(nums[s]==0 && nums[e]!=0){
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
            }
            else if(nums[s]==0 && nums[e]==0){
                e++;
            }
            else{
                s++;
                e++;
            }
        }
    }
}