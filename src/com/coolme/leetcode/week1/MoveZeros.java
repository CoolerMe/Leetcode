package com.coolme.leetcode.week1;

import java.util.Arrays;

/**
 * 2021/2/6
 * https://leetcode-cn.com/problems/move-zeroes/
 */
public class MoveZeros {

    public static void moveZeroes(int[] nums) {
        // 1 创建一个新的数组
//        int[] clone = new int[nums.length];
//        for (int i = 0, j = 0, k = nums.length - 1; i < nums.length; i++) {
//            if (nums[i] == 0) {
//                clone[k--] = 0;
//            } else {
//                clone[j++] = nums[i];
//            }
//        }
//        System.arraycopy(clone, 0, nums, 0, clone.length);
        // 2. 遍历两次,先得到非0 剩下的再填充
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[count++] = nums[i];
//            }
//        }
//        for (int k = count; k < nums.length; k++) {
//            nums[k] = 0;
//        }
        // 3. 交换法,将不为0的和目前的0换一个位置
//        int j = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                int temp = nums[j];
//                nums[j] = nums[i];
//                nums[i] = temp;
//                j++;
//            }
//        }
        // 4. 同3方法类似
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }
}
