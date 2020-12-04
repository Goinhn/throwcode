package com.goinhn.sworddirectoffer;

/**
 * <p>
 * 调整数组的顺序使奇数位于偶数前面
 * <p>
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * </p>
 *
 * @author goinhn
 * @date 2020-12-04T23:44:02
 */
public class ReOrderArray {

    public void reOrderArray(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }

        int oddCount = 0;
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) == 1) {
                oddCount++;
            }
        }

        int oddBegin = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) == 1) {
                newArray[oddBegin++] = array[i];
            } else {
                newArray[oddCount++] = array[i];
            }
        }

        System.arraycopy(newArray, 0, array, 0, array.length);
    }
}
