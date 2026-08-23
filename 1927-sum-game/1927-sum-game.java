class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int q1 = 0, q2 =0;
        int sum1 = 0 , sum2 = 0;
        for(int i = 0; i<n/2; i++){
            if(num.charAt(i) == '?'){
                q1++;
            }else{
                sum1 += num.charAt(i) - '0';
            }
        }
        for(int i = n/2; i<n; i++){
            if(num.charAt(i) == '?'){
                q2++;
            }else{
                sum2 += num.charAt(i) - '0';
            }
        }
        int tt = q1 + q2;
        if(tt % 2 != 0){
            return true;
        }else if( tt == 0 && sum1 == sum2) return false;
        else if( tt == 0 && sum1 != sum2) return true;

        return sum1 + (q1*4.5) != sum2 + (q2*4.5);
    }
}