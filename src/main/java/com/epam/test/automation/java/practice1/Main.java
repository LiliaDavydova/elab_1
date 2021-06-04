package com.epam.test.automation.java.practice1;

public class Main {
    private Main() {

    }

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int task1(int n) {
        if (n > 0) {
            return n * n;
        } else if (n < 0) {
            return Math.abs(n);
        }
        return 0;
    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int n) {
        if (n < 100 || n > 999) {
            throw new IllegalArgumentException("Number is out of range. Number must be (100 <= n <= 999)");
        }
        int[] arr = {n % 10, n / 10 % 10, n / 100 % 10};

        for (int i = arr.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[0] * 100 + arr[1] * 10 + arr[2];
    }
}
