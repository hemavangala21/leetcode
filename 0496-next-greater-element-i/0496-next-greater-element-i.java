class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }
            
            int nextGreater = st.isEmpty() ? -1 : st.peek();
            map.put(nums2[i], nextGreater);
            st.push(nums2[i]);
        }
        
        int[] fina = new int[nums1.length];
        for (int i = 0; i < fina.length; i++) {
            fina[i] = map.get(nums1[i]);
        }
        
        return fina;
    }
}

        


       