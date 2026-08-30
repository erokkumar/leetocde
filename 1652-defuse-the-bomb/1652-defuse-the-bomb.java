class Solution {
    public int[] decrypt(int[] code, int k) {
        if(k == 0){
            return new int[code.length];
        }else if(k > 0){
            return addition(code , k);
        }else if(k < 0){
            revrse(code);
             int[] result =addition(code,k*-1);
             revrse(result);
             return result;
        }
        return new int[code.length];
    }

    public void revrse(int [] nums){
        int i =0;
        int j = nums.length -1;
        
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public int[] addition(int [] arr , int k){
        int [] nums = new int[arr.length];
        
        for(int i = 0 ; i<arr.length; i++){
            int sum = 0;
            for(int j = i+1; j<=k+i; j++){
                int curr = j;
                if(j >= arr.length){
                    curr = curr%arr.length;
                }
                sum += arr[curr];
            }
            nums[i] = sum;
        }return nums;
    }
}