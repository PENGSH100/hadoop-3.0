package com.pengsh.java.basic.one;

import static com.sun.beans.finder.ClassFinder.findClass;

/**
 * @author pengsh
 * @date 2020/7/16 23:00
 */
public class readFile {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ClassLoader c=new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                Class cc=findClass(name);
                if (cc==null){

                }
                return super.loadClass(name);
            }
        };
    }
    protected synchronized Class<?> loadClass(String name,boolean resolve)throws ClassNotFoundException{
        Class cc=findClass(name);
        if(cc==null){
            try {

            }catch (Exception e){

            }
        }


        return cc;
    }
}
