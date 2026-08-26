class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        
        for(int i = 0; i<nums.length; i++){
            if(ans.containsKey(nums[i])){
                if(i - ans.get(nums[i]) <= k) return true;
            }
            ans.put(nums[i] , i);
        }return false;
    }
}