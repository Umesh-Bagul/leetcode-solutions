class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int count = 0;

        for(int i = 0; i<=nums.length-1; i++){
            if(nums[i] == 1){
                counter++;
                if(counter > count){
                    count = counter;
                }
            }else counter = 0;
        }
        return count;
    }
}