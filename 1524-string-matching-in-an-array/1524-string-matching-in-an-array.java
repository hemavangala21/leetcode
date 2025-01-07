class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        for(String i:words){
            for(String j:words){
                if(!i.equals(j) && j.contains(i)){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}