package com.heima.jvm;

/**
 * 局部变量的线程安全问题
 */
public class StacksDemo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append(2);
        new Thread(()->{
            m2(sb);
        }).start();
    }
    public static void m1(){
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append(2);
        System.out.println(sb.toString());
    }
    public static void m2(StringBuilder sb){
        sb.append(3);
        sb.append(4);
        System.out.println(sb.toString());
    }
    public static StringBuilder m3(){
        StringBuilder sb = new StringBuilder();
        sb.append(5);
        sb.append(6);
        return sb;
    }

    public static void m4(){
        m4();
    }
}
