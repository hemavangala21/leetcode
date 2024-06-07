class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        List<Integer> arr = new ArrayList<>(map.keySet());
        arr.sort((a,b) -> map.get(b)-map.get(a));
        int [] res = new int[k];
        for(int i=0;i<k;i++){
            res[i]=arr.get(i);
        }
        return res;
    }
}