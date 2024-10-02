class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int [] array = new int[arr.length];
        int [] result = new int[arr.length];

        for(int i = 0;i<arr.length;i++){
            array[i] = arr[i];
        }

        Arrays.sort(array);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for(int num: array){
            if(!map.containsKey(num)){
                map.put(num,rank);
                rank++;
            }
        }

        for(int i= 0;i<array.length;i++){
            result[i] = map.get(arr[i]);
        }
        return result;
    }
}      
