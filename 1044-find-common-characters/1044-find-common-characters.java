class Solution {
    public List<String> commonChars(String[] words) {
        List<String> arr = new ArrayList<>();

        for(char ch = 'a' ; ch <= 'z' ; ch++){
            int min_count = Integer.MAX_VALUE;
            for(int i = 0; i < words.length; i++){
                int count =0;
                for(int j = 0; j < words[i].length() ; j++){
                    if(words[i].charAt(j) == ch){
                        count++;
                    }
                }
                min_count = Math.min(min_count,count);
            }
            for(int i = 0; i < min_count; i++){
                arr.add(String.valueOf(ch));
            }
        }
        return arr;
    }
}