package com.pengsh.java.basic.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author pengsh
 * @Date: 2021/04/05
 * @Description
 */
public class Exame3 {
    public static List getInt(String[] strings,String regx){
        List<Integer> resultList=new ArrayList();

        if(".*".equals(regx)){
            for(int i=0;i<strings.length;i++){
                resultList.add(i);
            }
        }else{
            for(int i=0;i<strings.length;i++){
                String str=strings[i];
                if(str.length()==regx.length()){
                    for(int j=0;j< str.length();j++){
                        if(regx.contains(String.valueOf(str.charAt(j)))){
                            resultList.add(i);
                            break;
                        }

                    }
                }
            }
        }

        return resultList;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       /* String str=sc.next();
        String regx=sc.next();*/


        List list=getInt("ab aab".split(" "),"a.b");
        StringBuilder sb=new StringBuilder();
        String com="";
        for (int i=0;i<list.size();i++){
            sb.append(com).append(list.get(i));
            com=",";

        }
        System.out.println(sb.toString());



    }
}
