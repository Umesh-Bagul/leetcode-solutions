class Solution {
    public int majorityElement(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            int element = nums[i];
            int counter = 0;
            for(int j = 0; j<nums.length; j++){
                if(nums[j] == element){
                    counter++;
                }
            }
            if(counter >= nums.length/2+1){
                return element;
            }
        }
        return 0;
    }
}