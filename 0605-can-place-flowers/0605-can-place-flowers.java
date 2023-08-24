class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l=flowerbed.length;
        int count=0;

        if(n==0){
            return true;
        }

        if(l==1){
            if(flowerbed[0]==0)
            return true;

            else
            return false;
        }

        if(flowerbed[0]==0 && flowerbed[1]==0){
            count++;
            flowerbed[0]=1;
        }

        for(int i=1;i<flowerbed.length-1;i++){
            if(flowerbed[i] == 0){
                if(flowerbed[i-1]==0 && flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    count++;
                }
            }
        }
      
        if(flowerbed[l-1]==0 && flowerbed[l-2] == 0){
            count++;
        }
        if(count>=n)
        return true;
        
        return false;
        
    }
}