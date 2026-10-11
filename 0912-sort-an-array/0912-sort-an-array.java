class Solution {
    public int[] sortArray(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        return mergeSort(nums, low, high);
    }

    public int[] mergeSort(int[] nums, int low, int high){
        if(low>=high){
            return nums;
        }

        int mid = low + (high - low)/2;

        mergeSort(nums, low, mid);
        mergeSort(nums, mid+1, high);
        merge(nums, low, mid, high);

        return nums;
    }

    public int[] merge(int[] nums, int low, int mid, int high){
        int i = low;
        int j = mid+1;
        int k = 0;

        int[] temp = new int[high - low + 1];

        while(i<=mid && j<=high){
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            }else{
                temp[k++] = nums[j++];
            }
        }
        while(i<=mid){
            temp[k++] = nums[i++];
        }
        while(j<=high){
            temp[k++] = nums[j++];
        }

        for(int l = 0; l<temp.length; l++){
            nums[low+l] = temp[l];
        }

        return nums;
    }
}