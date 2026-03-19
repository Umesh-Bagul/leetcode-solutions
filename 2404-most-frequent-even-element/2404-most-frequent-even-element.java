class Solution {
    public int mostFrequentEven(int[] nums) {
        int maxElement = -1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>maxElement){
                maxElement = nums[i];
            }
        }
        int[] hash = new int[maxElement+1];

        for(int i = 0; i<nums.length; i++){
                hash[nums[i]]++;
            }

        int maxCount = 0;
        int element = -1;

        for(int i = 0; i<hash.length; i++){
            if(i%2 == 0){
                if(hash[i]>maxCount){
                    maxCount = hash[i];
                    element = i;
                }
            }
        }
        return element;
        }
    }
