/*
* github profile: https://leetcode.com/pandeybhuwan138/
* https://leetcode.com/problems/find-peak-element/
* 162. Find Peak Element
* */
class Solution {
    public int findPeakElement(int[] nums) {
        int start=0, end = nums.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(nums[mid] > nums[mid+1]) end = mid;
            else start = mid+1;
        }
        return start;
    }
}