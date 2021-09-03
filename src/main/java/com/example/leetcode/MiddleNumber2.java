package com.example.leetcode;

public class MiddleNumber2 {
    public static void main(String[] args) {
        int[] nums1 = new int[] {0,0,0,0,0};
        int[] nums2 = new int[] {-1,0,0,0,0,0,1};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] allNums = new int[length];
        System.arraycopy(nums1, 0, allNums, 0, nums1.length);
        System.arraycopy(nums2, 0, allNums, nums1.length, nums2.length);
        sortIndex(allNums);
        if (length ==0) {
            return 0;
        }
        int middleNum = (int)Math.floor(length*1.0/2);
        if (length%2 ==0 ) {
            return (allNums[middleNum] + allNums[middleNum-1]*1.0) /2;
        } else {
            return allNums[middleNum];
        }
    }

    public static void sortIndex(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            for (int j=i; j<nums.length; j++) {
                if (nums[i]>nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
