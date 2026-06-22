class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> ans = new HashSet<>();

        for(int i =0; i<=s.length()-k; i++){
            String sub = s.substring(i, i + k);
            ans.add(sub);
        }
        return ans.size() == (1 << k);
    }
}