class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = beginnums(nums,target);
        res[1] = endnums(nums,target);
        return res;
    }
    public int beginnums(int[] nums,int target){
        int left=0;                                      //设置左右边界
        int right=nums.length-1;
        while(left<=right){                   //不断缩小区间（递归？）
            int mid = (left + right)/2;                 //取数组中值，平分数组
            if(target<nums[mid]){                       //当目标值在左区间时
                right=mid-1;                            //右边界缩小
            }else if(nums[mid]<target){                  //逻辑同上
                left = mid+1;
            }else{
                if(mid==0||nums[mid-1]!=target){        //取得beginnums
                    return mid;
                }else{
                    right = mid - 1; //取得非beginnums的target（说明beginnums在左边）
                }
            }
        }
        return -1;
    }
    public int endnums(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid = (left+ right) >>> 1;
            if(target<nums[mid]){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                if(mid==nums.length-1||nums[mid+1]!=target){
                    return mid;
                }else{
                    left=mid+1;
                }
            }
        }
        return -1;
    }
}