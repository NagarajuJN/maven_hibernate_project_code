package org.nagaraj.Interview.answer3;

public class KthSmallestElement2 {
    public static int findKthSmallest(int[] list1, int[] list2, int k) {
        if (list1.length > list2.length) {
            return findKthSmallest(list2, list1, k);
        }

        int m = list1.length;
        int n = list2.length;
        int low = 0, high = Math.min(m, k);

        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = k - mid1;

            int l1 = (mid1 == 0) ? Integer.MIN_VALUE : list1[mid1 - 1];
            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : list2[mid2 - 1];
            int r1 = (mid1 == m) ? Integer.MAX_VALUE : list1[mid1];
            int r2 = (mid2 == n) ? Integer.MAX_VALUE : list2[mid2];

            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            } else if (l1 > r2) {
                high = mid1 - 1;
            } else {
                low = mid1 + 1;
            }
        }

        throw new IllegalArgumentException("Input is not valid");
    }

    public static void main(String[] args) {
        int[] list1 = {2, 3, 6, 7, 9};
        int[] list2 = {1, 4, 8, 10};
        int k = 5;
        System.out.println(findKthSmallest(list1, list2, k)); // Output: 6
    }
}
