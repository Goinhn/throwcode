package com.goinhn.algorithm.sort;


/**
 * <p>
 *
 * </p>
 *
 * @author goinhn
 * @date 2020-11-22T16:20:18
 */
public class TestSort {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 6, 8, 10};

        sort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        System.out.println("bucketsort");

        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }

        int distance = min < 0 ? -min : 0;

        int[] bucket = new int[max + distance + 1];
        for (int i = 0; i < arr.length; i++) {
            bucket[arr[i] + distance]++;
        }

        int index = 0;
        for (int i = 0; i < bucket.length; i++) {
            while (bucket[i] > 0) {
                arr[index++] = i - distance;
                bucket[i]--;
            }
        }
    }

}
