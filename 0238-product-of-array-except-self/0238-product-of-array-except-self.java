class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;

        int [] left_product= new int[n];
        int [] right_product = new int[n];
        int [] output_product = new int[n];

        left_product[0]=1;
        right_product[n-1]=1;

        for(int i=1;i<n;i++){
            left_product[i]= nums[i-1]*left_product[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right_product[i]= nums[i+1]*right_product[i+1];
        }
        for(int i=0;i<n;i++){
            output_product[i]= left_product[i]*right_product[i];
        }
        return output_product;
    }
}