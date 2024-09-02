package org.nagaraj.Interview.answer;
public class MajorityElementFrequency {
    public static int findMajorityElementFrequency(int[] nums, int majorityElement) {
        int count = 0;
        for (int num : nums) {
            if (num == majorityElement) {
                count++;
            }
        }
        return count;
    }
}
