class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int maxi = 0;
       for(int i = 1; i<prices.length; i++){
          if(prices[l] < prices[i]){
            maxi = Math.max(maxi , prices[i] - prices[l]);
          }else{
            l = i;
          }
       }return maxi;
    }
}