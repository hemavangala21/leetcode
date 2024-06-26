class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;
        int mid = -1;

        if(x == 0 || x==1){
            return x;
        }
        
        while(start<=end){
            mid = start+ (end - start)/2;
            long res = (long)mid*mid;

            if(res==x){
                return mid;
            }
            else if(res>x){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }
} 