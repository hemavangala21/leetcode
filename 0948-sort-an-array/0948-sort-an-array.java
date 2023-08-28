class Solution {
    public void mergeSort(int nums[], int si,int ei){
        if(si>=ei){
            return;
        }
        int mid= si+((ei-si)/2);
        mergeSort(nums,si,mid);
        mergeSort(nums,mid+1,ei);
        merge(nums,si,mid,ei);
    }
    public int[] merge(int [] nums, int si,int mid, int ei){
        int idx1= si;
        int idx2= mid+1;
        int [] temp= new int[ei-si+1];
        int x=0;

        while(idx1<=mid && idx2<=ei){
            if(nums[idx1]<nums[idx2]){
                temp[x]=nums[idx1];
                x++;
                idx1++;
            }
            else{
                temp[x]=nums[idx2];
                x++;
                idx2++;
            }
        }
        while(idx1<=mid){
             temp[x]=nums[idx1];
             x++;
             idx1++;        
        }
        while(idx2<=ei){
            temp[x]=nums[idx2];
            x++;
            idx2++;
        }
        for(int i=0,j=si;i<temp.length;i++,j++){
            nums[j]=temp[i];
        }
        return nums;
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}