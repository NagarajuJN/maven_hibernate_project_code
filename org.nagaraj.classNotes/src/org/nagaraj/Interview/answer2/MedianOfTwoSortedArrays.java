package org.nagaraj.Interview.answer2;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int totalLength = n + m;
        int medianIndex1 = (totalLength - 1) / 2;
        int medianIndex2 = totalLength / 2;

        int i = 0, j = 0, count = 0;
        int current = 0, prev = 0;

        while (count <= medianIndex2) {
            prev = current;
            if (i < n && (j >= m || nums1[i] <= nums2[j])) {
                current = nums1[i];
                i++;
            } else {
                current = nums2[j];
                j++;
            }
            count++;
        }

        if (totalLength % 2 == 0) {
            return (current + prev) / 2.0;
        } else {
            return current;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 8};
        int[] nums2 = {7, 9, 10, 11};
        System.out.println(findMedianSortedArrays(nums1, nums2)); // Output: 8.0
    }
}
