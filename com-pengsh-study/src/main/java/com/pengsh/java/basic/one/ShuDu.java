package com.pengsh.java.basic.one;


/**
 * @Author pengsh
 * @Date: 2021/03/20
 * @Description
 */
public class ShuDu {
    /**
     * 存储数字的数组
     */
    private static int[][] n = new int[9][9];
    /**
     * 存放1-9的数字
     */
    private static int[] num = new int[9];

    public static int[][] getShuDu() {
        for (int i = 0; i < 9; i++) {
            //填充数字的次数
            int times = 0;
            for (int j = 0; j < 9; j++) {
                n[i][j] = getShuDuNumber(times);
                //判断返回值的结果，如果n[i][j]=0 表示数独当前值卡住则要做退回处理；
                if (n[i][j] == 0) {
                    // 说明不是第一列，则退回一列
                    if (j != 0) {
                        j -= 2;
                        continue;
                    } else {// 是第一列，则倒退到上一行的最后一列
                        i--;
                        j = 8;
                        continue;
                    }
                }
                // 填充成功
                if (isMeetAll(i, j)) {
                    // 初始化time，为下一次填充做准备
                    times = 0;
                } else { // 继续填充
                    // 次数增加1
                    times++;
                    // 继续填充当前格
                    j--;
                }

            }
        }
        return n;
    }

    /**
     * 同时满足一下条件才能正确插入
     *
     * @param row
     * @param col
     * @return
     */
    public static boolean isMeetAll(int row, int col) {
        return checkRow(row) && checkLine(col) && checkNine(row, col) && checkCage(row, col);
    }

    /**
     * 检查行是否符合要求
     *
     * @param row 检查的行号
     * @return true 代表符合要求
     */
    public static boolean checkRow(int row) {
        for (int j = 0; j < 8; j++) {
            if (n[row][j] == 0) {
                continue;
            }
            for (int k = j + 1; k < 9; k++) {
                if (n[row][j] == n[row][k]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 检查列是否符合要求
     *
     * @param col 检查的列号
     * @return true 代表符合要求
     */
    public static boolean checkLine(int col) {
        for (int i = 0; i < 8; i++) {
            //说明当前这空没有填值
            if (n[i][col] == 0) {
                continue;
            }
            for (int j = i + 1; j < 9; j++) {
                if (n[i][col] == n[j][col]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 判断3*3的小格子里面的值是否满足要求
     *
     * @param row
     * @param col
     * @return true 代表符合要求
     */
    public static boolean checkNine(int row, int col) {
        // 获得左上角的坐标
        int j = (row / 3) * 3;//0,3,6
        int k = (col / 3) * 3;//0,3,6
        // 循环比较
        for (int i = 0; i < 8; i++) {
            if (n[j + i / 3][k + i % 3] == 0) {
                continue;
            }
            for (int m = i + 1; m < 9; m++) {
                if (n[j + i / 3][k + i % 3] == n[j + m / 3][k + m % 3]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 当前所在笼的所需的数字和
     *
     * @param row
     * @param col
     * @return
     */
    public static int getLongTarget(int row, int col) {
        return 0;
    }

    /**
     * 得到当前所在笼已填入数字的加和
     *
     * @param row
     * @param col
     * @return
     */
    public static int getLongCurrentSum(int row, int col) {
        return 0;
    }

    /**
     * 判断当前笼的数字是否符合要求
     *
     * @param row
     * @param col
     * @return
     */
    public static boolean checkCage(int row, int col) {
        int target = getLongTarget(row, col);
        int currentSum = getLongCurrentSum(row, col);
        return target > currentSum;
    }

    /**
     * 获取数独每一空的数字
     *
     * @param n
     */
    public static int getShuDuNumber(int n) {
        //如果是第一次填充的话 初始化赋值源数组
        if (n == 0) {
            for (int i = 1; i <= 9; i++) {
                num[i] = i;
            }
        }
        //尝试的次数大于行数 则说当前数字存在问题
        if (n >= 9) {
            return 0;
        }
        return num[n];
    }

}
