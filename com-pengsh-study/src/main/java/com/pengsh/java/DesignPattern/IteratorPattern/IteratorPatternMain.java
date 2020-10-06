package com.pengsh.java.DesignPattern.IteratorPattern;

/**
 * @author pengsh
 * @Date 2020/9/23
 */
public class IteratorPatternMain {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
