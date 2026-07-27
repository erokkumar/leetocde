class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int ans = 0;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i<n; i++){
            for(int j = i + 1; j<n; j++){
                ans = (nums[i]-1)*(nums[j]-1);
                set.add(ans);
            }
        }
        return set.last();
    }
}