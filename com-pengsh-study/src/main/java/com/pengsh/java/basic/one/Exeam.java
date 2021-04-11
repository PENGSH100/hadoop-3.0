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
public class Exeam {
    public static  int getCewei(String str){
        int left=0;
        List<Integer> list=new ArrayList();
        String[] strings=str.split(",");
        for(String s:strings){
            if(s.equals("1")){
                left=0;
            }else{
                left++;
                list.add(left);
            }
        }
        Collections.sort(list);
        left=list.get(list.size()-1);
        StringBuilder sb=new StringBuilder();
        String com="";
        for(int i=0;i<left;i++){
            sb.append(com).append("0");
            com=",";

        }

        if(str.length()-sb.length()==str.indexOf(sb.toString())||str.indexOf(sb.toString())==0){
            return left-1;
        }else{
            if(left%2==0){//代表的是偶数
                return left/2;
            }else{//代表奇数
                if(left==1){
                    return 0;
                }else{
                    return left/2;
                }
            }
        }



    }

    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        //String str=sc.next();
        String str="0,0,0,0,0,1,0,0,1,0,0,0,0,0,0";
        System.out.print(getCewei(str));
    }
}
