package algorithm.basic.sort;

/**
 * <p>
 * 快速排序
 * </p>
 * <p>
 * 时间复杂度 O(N*logN)
 * 空间复杂度 O(logN)
 * </P>
 *
 * @author goinhn
 * @date 2020-08-23T23:30:04
 */
public class QuickSort {

    /**
     * 经典快速排序
     */
    public static class ClassicQuickSort {
        /**
         * 初始条件判断
         *
         * @param arr
         */
        public static void quickSort(int[] arr) {
            if (arr == null || arr.length < 2) {
                return;
            }

            quickSort(arr, 0, arr.length);
        }

        /**
         * 快速排序
         * 递归进行
         *
         * @param arr
         * @param l
         * @param r
         */
        public static void quickSort(int[] arr, int l, int r) {
            if (l >= r) {
                return;
            }

        }

        /**
         * 根据标志数据的大小将小的数放置到左边，大的数放置到右边
         *
         * @param arr
         * @param l
         * @param r
         * @param flag
         */
        public static void searchSwag(int[] arr, int l, int r, int flag) {

        }

    }


}
