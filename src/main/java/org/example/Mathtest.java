package org.example;

public class Mathtest {
    public static void main(String[] args){
        //算术运算符
        /*
        int a=5,b=20,c=24,d=25;
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("c % a = " + (c % a) );   //取余
        System.out.println("a++   = " +  (a++) );   //a++自增前的值
        System.out.println("++a   = " +  (++a) );   //++a自增后的值
        System.out.println("b--   = " +  (b--) );   //b--自减前的值
        System.out.println("--b   = " +  (--b) );   //--b自减后的值
        System.out.println("2 * ++a ="+(2*++a));   //先进行++a再*2，结果为12
         */

        //位运算符
        /*
        int a = 60; // 60 = 0011 1100
        int b = 13; // 13 = 0000 1101
        int c = 0;
        c = a & b;       //对应位都为1，则为1，否则为0
        System.out.println("a & b = " + c );    //12 = 0000 1100

        c = a | b;       //对应位都为0，则为0，否则为1
        System.out.println("a | b = " + c );    // 61 = 0011 1101

        c = a ^ b;      //对应值相同，则为0，否则为1
        System.out.println("a ^ b = " + c );     // 49 = 0011 0001

        c = ~a;     //取反
        System.out.println("~a = " + c );   //-61 = 1100 0011

        c = a << 2;     //左移x位
        System.out.println("a << 2 = " + c );    // 240 = 1111 0000

        c = a >> 2;     //右移x位
        System.out.println("a >> 2  = " + c );  // 15 = 1111
        */

        //逻辑运算符
        /*
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a&&b));   //和
        System.out.println("a || b = " + (a||b) );  //或
        System.out.println("!(a && b) = " + !(a && b));     //非
        */

        //条件运算符
        /*
        int a,b,c;
        a=10;
        b=20;
        c=(a>b)?1:2;    //如果a>b，则c=1，否则c=2
        System.out.println(c);
         */
    }
}
