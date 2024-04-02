package com.leetcode.array;

/**
 * @author HDU-AIOT-WuHD
 * @date 2024-04-02 10:52
 **/

/**
 * 面试经典100题之数组
 */
public class ReBirthArray {


    /**
     * 合并两个有序数组
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m-1;
        int index2 = n-1;
        int tail = n+m-1;

        while(index2 >= 0 || index1 >= 0) {
            int cur = 0;
            if(index1 == -1) {
                cur = nums2[index2];
                index2--;
            }else if(index2 == -1) {
                cur = nums1[index1];
                index1--;
            }else if(nums1[index1] >= nums2[index2]) {
                cur = nums1[index1];
                index1--;
            }else{
                cur = nums2[index2];
                index2--;
            }

            nums1[tail] = cur;
            tail--;
        }
    }

}
