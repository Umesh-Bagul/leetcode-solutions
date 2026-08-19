class Solution { 
    public void rotate(int[] nums, int k) { 
        k = k % nums.length;

        int size = nums.length;

        reverse(nums, 0, size - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, size - 1);
    }

    public void reverse(int[] nums, int left, int right) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}