package com.sort.arch;

import java.util.Arrays;


/**
 * 快速排序算法
 */
public class QuickSort {

    public int[] sort(int[] sourceArray) throws Exception {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        return quickSort(arr, 0, arr.length - 1);
    }

    private int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            System.out.println("分区排序中1："+Arrays.toString(arr));
            int partitionIndex = partition(arr, left, right);
            System.out.println("分区排序中2："+Arrays.toString(arr));
            quickSort(arr, left, partitionIndex - 1);
            //System.out.println("排序中3："+Arrays.toString(arr));
            quickSort(arr, partitionIndex + 1, right);
            //System.out.println("排序中4："+Arrays.toString(arr));
        }
        return arr;
    }

    /**
     * 分区操作
     * @param arr Pivot基准元素，默认为最后一个元素
     * @param left 左元素，默认为第一个
     * @param right 右元素，默认为基准元素的前一个
     * @return
     */
    private int partition(int[] arr, int left, int right) {
        // 设定基准值（pivot）
        int pivot = left;
        int index = pivot + 1;
        System.out.println("pivot="+arr[pivot] +" left=" + arr[left]+  " right="+arr[right]);
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr, i, index);
                System.out.println("数据交换1："+arr[i] + " <-> " + arr[pivot]  +" <-> " + Arrays.toString(arr));
                index++;
            }
        }
        swap(arr, pivot, index - 1);
        System.out.println("数据交换2："+arr[pivot] + " <-> " + arr[index - 1]  +" <-> " + Arrays.toString(arr));
        return index - 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
