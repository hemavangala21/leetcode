class Solution {
    public boolean areSentencesSimilar(String s1, String s2) {
        String arr1[] = s1.split(" ");
        String arr2[] = s2.split(" ");

        int i = 0; // Pointer for the start
        int j = 0; // Pointer for the end

        // Compare words from the beginning
        while (i < arr1.length && i < arr2.length && arr1[i].equals(arr2[i])) {
            i++;
        }

        // Compare words from the end
        while (j < arr1.length - i && j < arr2.length - i && arr1[arr1.length - 1 - j].equals(arr2[arr2.length - 1 - j])) {
            j++;
        }

        // If all words at the start and end match, return true
        return i + j == Math.min(arr1.length, arr2.length);
        
    }
}