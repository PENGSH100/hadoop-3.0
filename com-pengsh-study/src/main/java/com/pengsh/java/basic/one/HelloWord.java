package com.pengsh.java.basic.one;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pengsh
 * @Date: 2020/6/30 17:31
 */
public class HelloWord {
    public static void main(String[] args) {
        maopao();
        System.out.println(1>1);

        int day=getMothDay(2020,1,21);
        System.out.println(day);
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
    public static  int getMothDay(int year,int moth,int day ){
        int dayNum=0;
        Map<Integer,Integer>  mothDay=new HashMap<>();
        mothDay.put(1,31);mothDay.put(3,31);mothDay.put(5,31);mothDay.put(7,31);
        mothDay.put(8,31);mothDay.put(10,31);mothDay.put(12,31);mothDay.put(4,30);
        mothDay.put(6,30);mothDay.put(9,30);mothDay.put(11,30);
           for(int i=1;i<moth;i++){
               if(i==2){
                   if(year%400==0||(year%4==0 && year%100!=0)){
                       dayNum=dayNum+29;
                   }else {
                       dayNum=dayNum+28;
                   }
               }else {
                   dayNum=dayNum+mothDay.get(i);
               }
        }
        return dayNum+day;
    }

}
