class Solution {
    public boolean uniformArray(int[] nums1) {
        int even = 0;
        int odd = 0;
        int min = Integer.MAX_VALUE;

        for(int num : nums1){
            min = Math.min(min , num);
            if(num % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }

        if(even == nums1.length || odd == nums1.length){
            return true;
        }
        if(min%2 == 0){
            return false;
        }
        return true;  
        
    }
}