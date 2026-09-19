class Solution {
    public int appendCharacters(String s, String t) {

        int n = t.length();
        int j = 0;
        for (char ch : s.toCharArray()) {
            if (j < n && ch == t.charAt(j)) 
            j++;
        }
        return n - j; 
    }
}