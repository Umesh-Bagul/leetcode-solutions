class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;
        
        int[] temp = new int[k];

        int j = 0;

        for(int i = nums.length-1; i>=nums.length-k; i--){
            temp[j++] = nums[i];
        }

        for(int i = nums.length-1; i>=k; i--){
            nums[i] = nums[i - k];
        }

        int l = k-1;
        for(int i = 0; i<k; i++){
            nums[i] = temp[l--];
        }
    }
}