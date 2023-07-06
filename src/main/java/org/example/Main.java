package org.example;

public class Main {
    enum Color
    {
        RED,GREEN,BLUE,PINK,BLACK;
    }
    public static void main(String[] args) {
        int a,b;
        double c=2.54;
        a=10;
        b=5;

        //循环
        /*while(a>0){
            System.out.println(a);
            a--;
        }

        do{
            System.out.println(b);
            b++;
        }while(b<10);

        for(int c=0;c<5;c++){
            System.out.println(c);
        }

        int [] numbers = {1,2,3,4,5};
        for(int x:numbers){
            if(x==3){
                continue;
            }
            System.out.print(x+",");
        }

        String [] names ={"abc","sda","swa","qwe","csa"};
        for (String name:names){
            if(name=="swa"){
                break;
            }
            System.out.print(name+",");
        }
        System.out.print("\n");
         */

        //选择
        /*if(a<10){
            System.out.println("good");
        }
        else if (a<5){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

        char grad = 'A';
        switch (grad){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            case 'D':
                System.out.println("不及格");
                break;
        }
         */

        //String类
        /*String s =new String("good");   //String 类是不可改变的，所以你一旦创建了 String 对象，那它的值就无法改变了
        //s = "sad";
        String s1 = "bad";
        String s2 = s;
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s1);
        System.out.println(s.concat(s1));
        System.out.println(s2);

        //格式化输出
        System.out.printf("浮点型变量的值为 " +
                "%.2f, 整型变量的值为 " +
                " %d, 字符串变量的值为 " +
                "is %s", c, b, s);
         */

        //StringBuffer 和 StringBuilder 类
        // StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
        /*StringBuilder st = new StringBuilder(10);
        st.append("abcdef");
        System.out.println(st);
        st.insert(6,"gh");
        System.out.println(st);
        st.delete(5,8);
        System.out.println(st);
         */

        //数组
        /*int size = 5;
        int[] money = new int[size];
        int[] it = {4,56,54,48,32};
        int max = money[0];
        for(int i=0;i<size;i++){
            money[i] = it[i];
            System.out.print(money[i]+",");
            if(money[i]>max){
                max = money[i];
            }
        }
        System.out.println();
        System.out.println("the max:"+max);
        for(int its:it){
            System.out.print(its+",");
        }
         */

        //枚举
        for(Color ys:Color.values()){
            switch (ys){
                case RED:
                    System.out.println("红");
                    break;
                case BLUE:
                    System.out.println("蓝");
                    break;
                case GREEN:
                    System.out.println("绿");
                    break;
                case PINK:
                    System.out.println("粉");
                    break;
                case BLACK:
                    System.out.println("黑");
                    break;
            }
        }


        /*System.out.println("Hello,world!");
        System.out.println("你好世界");
        System.out.println("参数变量");
        System.out.println("为什么有些会乱码而有些不");
        System.out.println("为什么有些会乱码而有些不有些值九零后乱码");
        System.out.println("为什么有些会乱码而有些不有些值九零后乱码不乱码了吗？？？");
        System.out.println("hello"+"你好");
        System.out.println('a');
        System.out.println(a);
        System.out.println(b+c);
         */
    }
}