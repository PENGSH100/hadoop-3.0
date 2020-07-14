package com.pengsh.java.basic.one;

/**
 * @author pengsh
 * @Date: 2020/7/1 10:07
 */
public class SortUtils {
    /**
     * 冒泡排序
     * 性能：稳定
     * @param a
     * @return
     */
    public static int[] BubbleSort(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        return a;
    }

    /**
     * 选择排序
     * 假定：第一个最小，找到数组后面最小 然后最后进行交换
     * 性能：稳定
     * @param a
     * @return
     */
    public static int[] selectSort(int[] a){
        for(int i=0;i<a.length;i++){
            int index=i;
            for(int j = i + 1; j < a.length; j++){
                if(a[i]>a[j]){
                    index=j;
                }
            }
            if(index!=i){
                int tmp = a[i];
                a[i] = a[index];
                a[index] = tmp;
            }
        }
        return a;
    }

    /**
     * 插入排序
     * 当前元素和该元素之前的进行比较，如果大的话 就交换位置
     * @param a
     * @return
     */
    public static int[] insertsort(int[] a){
        if(a==null||a.length<2){
            return a;
        }
        for(int i=1;i<a.length;i++){
            int j=i;
            int tmp=a[i];
            for(;j>0;j--){
                if(a[j-1]>tmp){
                    a[j]=a[j-1];
                }else {
                    break;
                }
            }
            a[j]=tmp;
        }
        return a;
    }

    /**
     * 快速排序 先找一个基准 然后在进行拍需要
     * @param a
     * @return
     */
    public static int[] quickSort(int[] a){
        if(a==null||a.length<2){
            return a;
        }
        int key=a[0];
        int i=0;
        for(int j=i+1;j<a.length;j++){}
        return a;
    }





}
