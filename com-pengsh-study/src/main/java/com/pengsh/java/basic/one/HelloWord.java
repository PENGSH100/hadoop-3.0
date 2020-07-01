package com.pengsh.java.basic.one;

/**
 * @author pengsh
 * @Date: 2020/6/30 17:31
 */
public class HelloWord {
    public static void main(String[] args) {
        maopao();
        System.out.println(1>1);
    }

    public static void maopao() {
        int[] a = new int[]{12, 23, 1, 121, 1341, 2, 3, 12, 341, 31};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for (int b : a) {
            System.out.println(b);
        }
    }
    public static void kuaipai(){
        int[] a = new int[]{12, 23, 1, 121, 1341, 2, 3, 12, 341, 31};
        for(int i = 0; i < a.length; i++){

        }
    }
}
