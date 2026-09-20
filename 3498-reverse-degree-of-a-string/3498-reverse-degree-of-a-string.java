class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            int r = 26 - (ch - 'a');
            int p = i + 1;

            sum += r * p;
        }
        return sum;
    }
}