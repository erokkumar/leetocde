class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int cnt = 0;
        int st = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i - st + 1 == k) {

                if (sum >= k * threshold) {
                    cnt++;
                }
                sum -= arr[st];
                st++;
            }
        }

        return cnt;
    }
}