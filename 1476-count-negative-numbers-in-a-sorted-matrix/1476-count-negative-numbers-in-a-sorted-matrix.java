class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            int start = 0;
            int end = grid[i].length - 1;
            
            while (start <= end) {
                int mid = start + (end - start) / 2;
                
                if (grid[i][mid] < 0) {
                    count += (end - mid + 1); // Counting all elements from mid to end as negative
                    end = mid - 1; // Move end to mid - 1 to check for more negative numbers on the left
                } else {
                    start = mid + 1;
                }
            }
        }
        return count;
    }
}
