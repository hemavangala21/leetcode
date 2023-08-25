class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int val:nums){
            set.add(val);
        }
        ArrayList<Integer> List= new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i))
            List.add(i);
        }
        return List;
    }
}








/*

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int val : nums) {
            set.add(val);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }
}*/