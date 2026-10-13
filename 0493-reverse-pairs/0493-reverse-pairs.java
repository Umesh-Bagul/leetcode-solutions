class Solution {
    public int reversePairs(int[] nums) {
        int low = 0;
        int high = nums.length-1;

        return mergeSort(nums, low, high);
    }

    public int mergeSort(int[] nums, int low, int high){
        int count = 0;

        if(low >=high){
            return count;
        }

        int mid = low + (high  - low)/2;

        count += mergeSort(nums, low, mid);
        count += mergeSort(nums, mid+1, high);
        count += countPairs(nums, low, mid, high);

        merge(nums, low, mid, high);

        return count;
    }

    public int countPairs(int[] nums, int low, int mid, int high){
        int left;
        int right = mid+1;
        int count = 0;

        for(left = low; left<=mid; left++){
            while(right<=high && nums[left] > 2L*nums[right]){
                right++;
            }
            count+= right - (mid+1);
        }
        return count;
    }

    public void merge(int[] nums, int low, int mid, int high){
        int left = low;
        int right = mid+1;

        int[] temp = new int[high - low + 1];

        int k = 0;

        while(left<=mid && right<=high){
            if(nums[left] < nums[right]){
                temp[k++] = nums[left++];
            }else{
                temp[k++] = nums[right++];
            }
        }

        while(left <= mid){
            temp[k++] = nums[left++];
        }
        while(right <= high){
            temp[k++] = nums[right++];
        }

        for(int i = 0; i<temp.length; i++){
            nums[low+i] = temp[i];
        }
    }
}