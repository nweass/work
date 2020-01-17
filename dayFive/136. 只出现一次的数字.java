class Solution {
    public int singleNumber(int[] nums) {
        QuickSort(nums, 0, nums.length - 1);
        for(int k=0;k<nums.length-1;k++){
            if(nums[k]!=nums[k+1]){
                return nums[k];
            }else if(k==nums.length-1){
                return nums[k];
            }
        }
        return -1;
    }
    public void QuickSort(int[] arr, int start, int end){
        if (start > end){
            return;
        }
        int mid = arr[start];
        int i = start;
        int j = end;
        while (i < j){
            while (i < j && arr[j] > mid){
                j--;
            }
            arr[i] = arr[j];
            i++;
            while(i < j && arr[i] < mid){
                i++;
            }
            arr[j] = arr[i];
            j--;
        }
        arr[i] = mid;
        QuickSort(arr, start, i - 1);
        QuickSort(arr,j + 1, end);
    }
}