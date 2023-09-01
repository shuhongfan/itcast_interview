package com.heima.jvm;

public class Application {

    public static void main(String[] args) throws InterruptedException {
//        System.out.println("hello world");

        // 1. 首次访问这个类的静态变量或静态方法时
//        System.out.println(Animal.num);
        // 2. 子类初始化，如果父类还没初始化，会引发父类先初始化
//        System.out.println(Cat.sex);
        // 3. 子类访问父类静态变量，只触发父类初始化
//        System.out.println(Cat.num);


        while (true){
            Thread.sleep(1000);
            System.out.println("哈哈哈");
        }
    }


}

class Animal {
    static int num = 55;
    static {
        System.out.println("Animal 静态代码块...");
    }
}

class Cat extends Animal {
    static boolean sex = false;
    static {
        System.out.println("Cat 静态代码块...1");
    }

    static {
        System.out.println("Cat 静态代码块...2");
    }
}