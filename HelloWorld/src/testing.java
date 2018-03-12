import java.util.*;

public class testing {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.print(nums);
    }

    public int[] twoSum(int[] nums, int target) {
        int index = 0;
        boolean breakLoop = false;
        int[] answer = new int[2];
        while (breakLoop == false) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] != nums[index]) {
                    int sum = nums[i] + nums[index];
                    if (sum == target) {
                        answer[0] = i;
                        answer[1] = index;
                        breakLoop = true;
                    } else if (index == nums.length - 1) {
                        index = 0;
                    } else {
                        index++;
                    }
                } else {
                    index++;
                }
            }
        }
        return answer;
    }
}

