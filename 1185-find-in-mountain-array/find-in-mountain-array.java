/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        int leftHalf = binarySearch(mountainArr,target,0,peak);
        if(leftHalf != -1){
            return leftHalf;
        }
        return binarySearch(mountainArr,target,peak+1, mountainArr.length() -1);
    }
    public int findPeak(MountainArray mountainArr){
        int start = 0;
        int end = mountainArr.length() - 1;
        while (start < end){
            int mid = start + (end - start)/2;
            if(mountainArr.get(mid) < mountainArr.get(mid+1)) start = mid + 1;
            else end = mid;
        }
        return start;
    }
    public int binarySearch(MountainArray mountainArr, int target, int start, int end){
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mountainArr.get(mid) == target) return mid;
            if(isAsc){
                if(mountainArr.get(mid) < target) start = mid + 1;
                else end = mid - 1;
            }
            else{
                if(mountainArr.get(mid) > target) start = mid + 1;
                else end = mid - 1;
            }
            
        }
        return -1;
    }
}