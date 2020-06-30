package com.ssm.test.one;

/**
 * @author pengsh
 * @Date: 2020/6/30 10:25
 */
public class testInterfaceOneImpl implements testInterfaceOne {
    @Override
    public String testMethod(String s) {
        return "这里是测试的接口";
    }
}
