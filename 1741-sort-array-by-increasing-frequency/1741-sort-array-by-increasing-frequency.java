import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }
        Collections.sort(numList, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                int freqA = frequencyMap.get(a);
                int freqB = frequencyMap.get(b);
                if (freqA != freqB) {
                    return freqA - freqB; 
                } else {
                    return b - a; 
                }
            }
        });
        
       
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numList.get(i);
        }
        
        return nums;
    }
}
