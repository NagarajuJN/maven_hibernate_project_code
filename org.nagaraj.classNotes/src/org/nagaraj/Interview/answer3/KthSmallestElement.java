package org.nagaraj.Interview.answer3;

public class KthSmallestElement {
    public static int findKthSmallest(int[] list1, int[] list2, int k) {
        int i = 0, j = 0, count = 0;
        int kthElement = 0;

        while (count < k) {
            if (i < list1.length && (j >= list2.length || list1[i] <= list2[j])) {
                kthElement = list1[i];
                i++;
            } else {
                kthElement = list2[j];
                j++;
            }
            count++;
        }

        return kthElement;
    }

    public static void main(String[] args) {
        int[] list1 = {2, 3, 6, 7, 9};
        int[] list2 = {1, 4, 8, 10};
        int k = 5;
        System.out.println(findKthSmallest(list1, list2, k)); // Output: 6
    }
}
