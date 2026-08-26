class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long sum = 0;
        long max = Long.MIN_VALUE;
        int avg = 0;

        //if(nums.length == 1) return nums[0];

        for(int i = 0; i<nums.length; i++){
            sum += nums[i];

            if(i >= k){
                sum -= nums[i - k];
            }

            if(i >= k - 1){
                //avg = sum/k;
                max = Math.max(max , sum);
            }
        }return (double) max / k;
    }
}