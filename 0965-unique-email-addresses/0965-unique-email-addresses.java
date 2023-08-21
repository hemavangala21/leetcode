class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> unq_email = new HashSet();
        for(String email: emails){
            int split = email.indexOf("@");
            String localname= email.substring(0,split);
            String domainname= email.substring(split);

            if(localname.contains("+")){
                int plus= localname.indexOf("+");
                localname= localname.substring(0,plus);
            }

            localname= localname.replaceAll("\\.","");
            String lname= localname+domainname;
            unq_email.add(lname); 
        }
        return unq_email.size();
    }
}


