package com.coolme.leetcode.week1;

/**
 * 2021/2/6
 * https://leetcode.com/problems/climbing-stairs/
 * 爬楼梯
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        // 1. for循环的做法
//        int f1 = 1;
//        int f2 = 2;
//        if (n == 1) {
//            return f1;
//        }
//        if (n == 2) {
//            return f2;
//        }
//
//        int f3 = 3;
//        for (int i = 0; i < n - 2; i++) {
//            f3 = f2 + f1;
//            f1 = f2;
//            f2 = f3;
//        }
//        return f3;
        // 2. 递归不太合适,因为可能stackOverFlow
//        if (n == 1) {
//            return 1;
//        }
//        if (n == 2) {
//            return 2;
//        }
//        return climbStairs(n - 1) + climbStairs(n - 2);
        // 3. 方法能减少一些判断
        int first = 0;
        int second = 0;
        int current = 1;
        for (int i = 1; i <= n; i++) {
            first = second;
            second = current;
            current = first + second;
        }
        return current;
    }
}
