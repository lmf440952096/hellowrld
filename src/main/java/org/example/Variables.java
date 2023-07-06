package org.example;

public class Variables {
    //成员变量
    private int a;
    public String e;

    //静态变量,静态变量存储的全局配置信息可以在整个程序中使用，并且不会被修改
    private static int b;
    private static int counter=0;

    public void method(int c)
    {
        //局部变量,在使用前不初始化局部的值编译器会报错
        int d = 10;
        a =d;
        b =c;
        System.out.println("成员变量："+a);
        System.out.println("静态变量："+b);
        System.out.println("参数变量："+c);
        System.out.println("局部变量："+d);
        //int c；
        //System.out.println(”c=“+c);
    }

    //交换值
    public static void swap(int x, int y){
        int i = x;
        x = y;
        y = i;
    }

    public Variables(){
        counter++;
    }

    public static void main(String[] args) {
        int x = 10, y = 20;
        Variables v = new Variables();
        Variables obj = new Variables();
        v.method(50);
        swap(x, y);
        obj.a = 10;
        obj.e = "good";
        System.out.println("x=" + x + ",y=" + y);
        System.out.println("a="+obj.a);
        System.out.println("e="+obj.e);
        System.out.println("目前创建的对象数:"+counter);
    }
}
