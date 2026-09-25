class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        int ans = 0;
        int  ll = 0;
        int rr = 0;
        int cnt = 0;

        char[] arr = s.toCharArray();

        for(int i = 0; i<s.length(); i++){
            char ch = arr[i];
            if(set.contains(ch)){
                cnt++;
            }
            if(rr - ll == k - 1){
                ans = Math.max(cnt,ans);
                if(set.contains(arr[ll])){
                    cnt--;
                }ll++;
            }rr++;
        }return ans;
    }
}