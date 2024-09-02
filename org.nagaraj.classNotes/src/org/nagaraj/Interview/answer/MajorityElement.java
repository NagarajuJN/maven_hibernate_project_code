package org.nagaraj.Interview.answer;

public class MajorityElement {
    public static int findMajorityElement(int[] nums) {
        int count = 0, candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        } else {
            throw new IllegalArgumentException("No majority element found");
        }
    }

    public static int findMajorityElementFrequency(int[] nums) {
        int majorityElement = findMajorityElement(nums);
        int count = 0;
        for (int num : nums) {
            if (num == majorityElement) {
                count++;
            }
        }
        return count;
    }
}
