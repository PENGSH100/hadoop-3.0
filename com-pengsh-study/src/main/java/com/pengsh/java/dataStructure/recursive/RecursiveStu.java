package com.pengsh.java.dataStructure.recursive;

/**
 * @Author pengsh
 * @Date: 2021/03/30
 * @Description 这个是递归学习问题
 */
public class RecursiveStu {

    /**
     * 递归求和问题
     * @param n
     * @return
     */
    public static int sum(int n){
        if(n<=1){
            return 1;
        }
        return sum(n-1)+n;
    }

    /**
     *斐波那契数列递归循环方式
     * @param n
     * @return
     */
    public static int FibonacciSeq(int n){
        if(n<=2){
            return 1;
        }
        return FibonacciSeq(n-1)+FibonacciSeq(n-2);
    }

    /**
     *斐波那契数列循环实现方式
     * @param n
     * @return
     * 1 1 2 3 5 8 13 21 34
     */
    public static long FibonacciSeqFor(long n){
        if(n<=2){
            return n;
        }
        long first=1L;
        long second=1L;
        long sum=0L;
        for(long i=0L;i<n-2;i++){
            sum=first+second;
            first=second;
            second=sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(FibonacciSeqFor(6));
    }

}
