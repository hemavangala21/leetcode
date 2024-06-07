class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashMap<String, Integer> map =  new HashMap<>();

        for(int i=0;i<dictionary.size();i++){
            String root = dictionary.get(i);
            map.put(root,root.length());
        }

        String [] words=sentence.split(" ");
        String[] roots = map.keySet().toArray(new String[0]);

        StringBuilder result = new StringBuilder();
        for(int i =0; i< words.length;i++){
            String word = words[i];
            String replacement = word;
            int minLength = Integer.MAX_VALUE;

            for(int j=0; j<roots.length;j++){
                String root = roots[j];
                if(word.startsWith(root) && root.length()< minLength){
                    replacement = root;
                    minLength = root.length();
                }
            }
            if(result.length()>0){
                result.append(" ");
            }
            result.append(replacement);
        }


        return result.toString();
    }
}