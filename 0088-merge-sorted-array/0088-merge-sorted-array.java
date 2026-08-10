class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int k = m - 1;
        int l = n - 1;
        int q = m + n - 1;

        int[] temp = new int[m + n];

        while (k >= 0 && l >= 0) {

            if (nums1[k] <= nums2[l]) {
                temp[q--] = nums2[l--];
            } else {
                temp[q--] = nums1[k--];
            }
        }

        while (k >= 0) {
            temp[q--] = nums1[k--];
        }

        while (l >= 0) {
            temp[q--] = nums2[l--];
        }

        for (int i = 0; i < temp.length; i++) {
            nums1[i] = temp[i];
        }
    }
}