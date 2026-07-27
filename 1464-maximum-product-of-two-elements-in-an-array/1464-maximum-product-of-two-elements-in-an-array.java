class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i<n; i++){
            for(int j = i + 1; j<n; j++){
                set.add((nums[i]-1)*(nums[j]-1));
            }
        }
        return set.last();
    }
}