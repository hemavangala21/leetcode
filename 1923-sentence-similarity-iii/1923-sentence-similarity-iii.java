class Solution {
    public boolean areSentencesSimilar(String s1, String s2) {
        String arr1[] = s1.split(" ");
        String arr2[] = s2.split(" ");

        int i = 0; 
        int j = 0; 

        while (i < arr1.length && i < arr2.length && arr1[i].equals(arr2[i])) {
            i++;
        }

        while (j < arr1.length - i && j < arr2.length - i && arr1[arr1.length - 1 - j].equals(arr2[arr2.length - 1 - j])) {
            j++;
        }

        return i + j == Math.min(arr1.length, arr2.length);
        
    }
}