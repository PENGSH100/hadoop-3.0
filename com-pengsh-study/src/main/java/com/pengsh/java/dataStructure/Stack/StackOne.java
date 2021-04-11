package com.pengsh.java.dataStructure.Stack;

import java.util.Stack;

/**
 * @Author pengsh
 * @Date: 2021/03/21
 * @Description
 */
public class StackOne {
    /**
     *
     * 这个是栈学学习的第一个方法
     * 字符串括号问题
     * 给定对应字符串判断结果是否合法
     * str="()((()))(" -------->不合法
     *
     * @param str
     */
    public static void one(String str){
        Stack stack=new Stack();
        if(str.length()%2==1){
            System.out.println("当前字符串不合法");
            return;
        }
        if(str.length()==0||str==null){
            System.out.println("当前字符串合法");
            return;
        }
        for(int i=0;i<str.length();i++){
            char s=str.charAt(i);
            if(s=='(') {
                stack.push(s);
            }else{
                if(stack.empty()){
                    System.out.println("当前字符串不合法");
                    return;
                }
                stack.pop();
            }
        }
        if(stack.empty()){
            System.out.println("当前字符串合法");
            return;
        }else{
            System.out.println("当前字符串不合法");
            return;
        }
    }

    /**
     *
     * @param str
     */
    public static void one2(String str){
        int left=0;
        if(str.length()%2==1){
            System.out.println("当前字符串不合法");
            return;
        }
        if(str.length()==0||str==null){
            System.out.println("当前字符串合法");
            return;
        }
        for(int i=0;i<str.length();i++){
            char s=str.charAt(i);
            if(s=='(') {
                left++;
            }else{
                if(left<=0){
                    System.out.println("当前字符串不合法");
                    return;
                }
                left--;
            }
        }
        if(left==0){
            System.out.println("当前字符串合法");
            return;
        }else{
            System.out.println("当前字符串不合法");
            return;
        }
    }
    public static void isValid(String str){
        int left=0;
        int hualeft=0;
        int zhongleft=0;
        if(str.length()%2==1){
            System.out.println("当前字符串不合法");
            return;
        }
        if(str.length()==0||str==null){
            System.out.println("当前字符串合法");
            return;
        }
        for(int i=0;i<str.length();i++){
            char s=str.charAt(i);
            if(s=='(') {
                left++;
            }else if(s==')'){
                if(left<=0){
                    System.out.println("当前字符串不合法");
                    return;
                }
                left--;
            }else if(s=='['){
                zhongleft++;
            }else if (s==']'){
                if(zhongleft<=0){
                    System.out.println("当前字符串不合法");
                    return;
                }
                zhongleft--;
            }else if(s=='{'){
                hualeft++;
            }else if (s=='}'){
                if(hualeft<=0){
                    System.out.println("当前字符串不合法");
                    return;
                }
                hualeft--;
            }
        }
        if(left==0&&hualeft==0&&zhongleft==0){
            System.out.println("当前字符串合法");
        }else {
            System.out.println("当前字符串不合法");
        }

    }

    /**
     *
     * @param fishSize 鱼的大小
     * @param fishDirection 鱼的方向
     * 大鱼吃小鱼
     */
    public static void eatBigFish(int[] fishSize, int[] fishDirection ){
        //当鱼只有一条时或则没有时直接返回鱼的数据量
        if(fishSize.length<=1){
            System.out.println("鱼的数量是："+1);
            return;
        }
        Stack fishStack=new Stack();
        for(int i=0;i<fishSize.length;i++){
            final int curFishDirection = fishDirection[i];
            final int curFishSize = fishSize[i];
            // 当前的鱼是否被栈中的鱼吃掉了
            boolean hasEat = false;
            while (!fishStack.isEmpty()&&(fishDirection[(int)fishStack.peek()])==1&&curFishDirection==0){
              //如果栈顶的鱼的大小比来的鱼的大小小的话 被吃掉了；
                if(fishSize[(int)fishStack.peek()] > curFishSize){
                  hasEat = true;
                  break;
              }
                fishStack.pop();
            }
            if(!hasEat){
                fishStack.push(i);
            }
        }
        System.out.println("存活下来的鱼的数量："+fishStack.size());

    }

    /**
     * 找出数组中右边第一个比我小的元素
     * @param A
     * [5,1]--->[1,-1]
     */
    public static void findRightSmall(int[] A){
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[A.length];
        for(int i=0;i<A.length;i++){
            int max=A[i];
            while (!stack.isEmpty()&&A[stack.peek()]>max){
                // 消除的时候，记录一下被谁消除了
                ans[stack.peek()]=i;
                // 消除时候，值更大的需要从栈中消失
                stack.pop();
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            ans[stack.peek()]=-1;
            //出栈
            stack.pop();
        }
        for (int i:ans) {
            System.out.print(i+",");
        }


    }
    /**
     * 找出数组中右边第一个比我大的元素
     * @param A
     * [5,1]--->[-1,-1]
     */
    public static void findRightBig(int[] A){
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[A.length];
        for(int i=0;i<A.length;i++){
            int min=A[i];
            while (!stack.isEmpty()&&A[stack.peek()]<min){
                // 消除的时候，记录一下被谁消除了
                ans[stack.peek()]=i;
                // 消除时候，值更大的需要从栈中消失
                stack.pop();
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            ans[stack.peek()]=-1;
            //出栈
            stack.pop();
        }
        for (int i:ans) {
            System.out.print(i+",");
        }


    }

    /**
     * 找出数组中左边第一个比我小的元素
     * @param A
     * [5,1]--->[-1,-1]
     */
    public static void findLeftSmall(int[] A){
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[A.length];
        for(int i=A.length-1;i>=0;i--){
            int max=A[i];
            while (!stack.isEmpty()&&A[stack.peek()] > max){
                // 消除的时候，记录一下被谁消除了
                ans[stack.peek()]=i;
                // 消除时候，值更大的需要从栈中消失
                stack.pop();
            }
            stack.push(i);
        }
       while(!stack.isEmpty()){
            ans[stack.peek()]=-1;
            //出栈
            stack.pop();
        }
        for (int i:ans) {
            System.out.print(i+",");
        }


    }
    /**
     * 找出数组中左边第一个比我大的元素
     * @param A
     * [5,1]--->[-1,0]
     */
    public static void findLeftBig(int[] A){
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[A.length];
        for(int i=A.length-1;i>=0;i--){
            int max=A[i];
            while (!stack.isEmpty()&&A[stack.peek()] < max){
                // 消除的时候，记录一下被谁消除了
                ans[stack.peek()]=i;
                // 消除时候，值更大的需要从栈中消失
                stack.pop();
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            ans[stack.peek()]=-1;
            //出栈
            stack.pop();
        }
        for (int i:ans) {
            System.out.print(i+",");
        }


    }
    public static void main(String[] args) {
        //one("()((()))))");
        //one2("()((()))");
        //isValid("()((([][})))");
//        int[] fishSize={5,4,3};
//        int[] fishDirection={1,0,0};
//        eatBigFish(fishSize,fishDirection);
        int[] A={9,5,1,0,6};
        //findRightSmall(A);
        //findRightBig(A);
        //findLeftSmall(A);
        findLeftBig(A);

    }
}
