class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int l=0,r=-1;
        int maxi = Integer.MAX_VALUE; 
        int maxs = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
                if(nums[i]>=maxs){
                    maxs = nums[i];
                }else {
                    r=i; // r = 7
                }    
        }

        for(int i=nums.length-1; i>=0; i--)
        {
            if(nums[i]<=maxi){
                maxi=nums[i];
            }else{
                l=i;  // l = 6 , 
            } 
        }
        if(r==-1) return 0;
        return r-l+1;
    }
}