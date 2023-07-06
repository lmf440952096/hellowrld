package org.example;

public class ClassName {
    /*私有访问修饰符-private，声明为私有访问类型的变量只能通过类中公共的 getter 方法被外部类访问。
      公有访问修饰符-public，被声明为 public 的类、方法、构造方法和接口能够被任何其他类访问。
      受保护的访问修饰符-protected，子类与基类在同一包中：被声明为 protected 的变量、方法和构造器能被同一个包中的任何其他类访问；
      子类与基类不在同一包中：那么在子类中，子类实例可以访问其从基类继承而来的 protected 方法，而不能访问基类实例的protected方法。
     */

    //final 修饰符,final 表示"最后的、最终的"含义，变量一旦赋值后，不能被重新赋值。被 final 修饰的实例变量必须显式指定初始值
    //final 方法，声明 final 方法的主要目的是防止该方法的内容被修改。
    //final 类不能被继承，没有类能够继承 final 类的任何特性。
    final int value = 10;

    public static void main(String[] args){
        ClassName obj = new ClassName();
        Variables a =new Variables();
        a.method(5);  // 访问Variables中的公有方法
        //obj.value = 5; 不能修改
        System.out.println(obj.value);
    }

}
