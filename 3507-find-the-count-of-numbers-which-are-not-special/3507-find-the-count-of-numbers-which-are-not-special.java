class Solution {
    public int nonSpecialCount(int l, int r) {
       
        int maxLimit = (int)Math.sqrt(r);
        boolean[] isPrime = new boolean[maxLimit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        
        for (int i = 2; i * i <= maxLimit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= maxLimit; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
      
        List<Integer> primeSquares = new ArrayList<>();
        for (int i = 2; i <= maxLimit; i++) {
            if (isPrime[i]) {
                long square = (long)i * i;
                if (square >= l && square <= r) {
                    primeSquares.add((int)square);
                }
            }
        }
        
        int totalNumbers = r - l + 1;
        int specialNumbers = primeSquares.size();
        return totalNumbers - specialNumbers;
    }
}