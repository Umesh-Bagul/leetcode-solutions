class Solution {
    public boolean isIdealPermutation(int[] nums) {

        long counter = 0;

         for(int i=0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]){
               counter++;
            }
        }

        int low = 0;
        int high = nums.length-1;
        long count = mergeSort(nums, low, high);

        if(count == counter){
            return true;
        }
            return false;

    }
    public long mergeSort(int[] nums, int low, int high){
         long count = 0;

         if(low>= high){
            return count;
         }

         int mid = low + (high - low)/2;

        count += mergeSort(nums, low, mid);
        count += mergeSort(nums, mid+1, high);
        count += merge(nums, low, mid, high);

         return count;
    }

    public long merge(int[] nums, int low, int mid, int high){

        long count = 0;

        int i = low;
        int j = mid + 1;
        int k = 0;

        int[] temp = new int[high - low + 1];

        while(i<=mid && j<=high){
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            }else{
                temp[k++] = nums[j++];
                count += mid - i + 1;
            }
        }
        while(i<=mid){
            temp[k++] = nums[i++];
        }
        while(j<=high){
            temp[k++] = nums[j++];
        }
        
        for(int l = 0; l<temp.length; l++){
            nums[l + low] = temp[l]; 
        }
        return count;
    }
}