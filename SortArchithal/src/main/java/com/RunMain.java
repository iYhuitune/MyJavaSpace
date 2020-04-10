package com;

import com.sort.arch.QuickSort;

import java.util.Arrays;

public class RunMain {
    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        int[] arr = {3,5,8,1,2,9,4,7,6};
        System.out.println("排序前："+Arrays.toString(arr));
        int[] sortArr = new int[100];
        try {
             sortArr = sort.sort(arr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("排序后："+Arrays.toString(sortArr));
    }
}
