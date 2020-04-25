package com.woxing.webmagic;

public class A extends B
{
    {
        System.out.println("我是静态代码块A");
    }
    public A(){
        System.out.println("我是构造方法A");
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
    }
}

class B{
    {
        System.out.println("我是静态代码块B");
    }
    public B(){
        System.out.println("我是构造方法B");
    }
}
