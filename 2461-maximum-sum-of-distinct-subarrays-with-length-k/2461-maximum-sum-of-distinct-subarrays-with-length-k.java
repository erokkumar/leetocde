class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
         long sum=0;
        long max=0;
        int len=0;
         int i=0;
        int j=0;
        while(j<nums.length){
            if(len<k && !set.contains(nums[j])){
                set.add(nums[j]);
                sum+=nums[j];
                j++;
                len++;
                if(len==k)max=Math.max(sum,max);
            }else if(set.contains(nums[j])){
                 while (set.contains(nums[j])) {
                    set.remove(nums[i]);
                    sum -= nums[i];
                    i++;
                    len--;
                }
            }
            else{
                set.remove(nums[i]);
                sum-=nums[i];
                i++;
                len--;
            }
        }
        return max;
    }
}