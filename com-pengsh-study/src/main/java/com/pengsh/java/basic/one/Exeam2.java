package com.pengsh.java.basic.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @Author pengsh
 * @Date: 2021/04/05
 * @Description
 */
public class Exeam2 {
    public static int getceshi2(String str){

        if(str==null||str.equals(",")||str.length()==0){
            return 0;
        }


        String[] strings=str.split(",");
        List<Integer> list=new ArrayList<>();
        for(String string:strings){
            list.add(Integer.valueOf(string));
        }
        Collections.sort(list);
        List<Integer> list2=new ArrayList<>();
        if(list.size()==1){
            return Integer.valueOf(list.get(0).toString());
        }else if(list==null||list.size()==0){
            return 0;
        }else if(list.size()==2){
            String str1=list.get(0).toString();
            String str2=list.get(1).toString();
            String s1=str1+str2;
            String s2=str2+str1;
            list2.add(Integer.valueOf(s1));
            list2.add(Integer.valueOf(s2));
            Collections.sort(list2);
            return list2.get(0);
        }else{
            String str1=list.get(0).toString();
            String str2=list.get(1).toString();
            String str3=list.get(2).toString();
            String s1=str1+str2+str3;
            list2.add(Integer.valueOf(s1));
            String s2=str1+str3+str2;
            list2.add(Integer.valueOf(s2));
            String s3=str2+str1+str3;
            list2.add(Integer.valueOf(s3));
            String s4=str2+str3+str1;
            list2.add(Integer.valueOf(s4));
            String s5=str3+str2+str1;
            list2.add(Integer.valueOf(s5));
            String s6=str3+str1+str2;
            list2.add(Integer.valueOf(s6));
             Collections.sort(list2);
             return list2.get(0);
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(getceshi2(str));
    }
}
