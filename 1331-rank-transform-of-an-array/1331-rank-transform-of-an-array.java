class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int [] sorted = arr.clone();
        Arrays.sort(sorted);

        HashMap<Integer,Integer> rank = new HashMap<>();
        int r = 1;

        for(int x : sorted){
            if(!rank.containsKey(x)){
                rank.put(x,r);
                r++;
            }
        }

        int[] ans = new int[arr.length];

        for(int i =0; i<arr.length; i++){
            ans[i] = rank.get(arr[i]);
        }

        return ans;
    }
}