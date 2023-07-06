package org.example;

/*class SuperClass {
    private int n;
    SuperClass(){
        System.out.println("SuperClass()");
    }
    SuperClass(int n) {
        System.out.println("SuperClass(int n)");
        this.n = n;
    }
}
// SubClass 类继承
class SubClass extends SuperClass{
    private int n;

    SubClass(){ // 自动调用父类的无参数构造器
        System.out.println("SubClass");
    }

    public SubClass(int n){
        super(300);  // 调用父类中带有参数的构造器
        System.out.println("SubClass(int n):"+n);
        this.n = n;
    }
}
// SubClass2 类继承
class SubClass2 extends SuperClass{
    private int n;

    SubClass2(){
        super(300);  // 调用父类中带有参数的构造器
        System.out.println("SubClass2");
    }

    public SubClass2(int n){ // 自动调用父类的无参数构造器
        System.out.println("SubClass2(int n):"+n);
        this.n = n;
    }
}
 */

class People{
    private int age;
    private String name,sex;

    People(int age,String name,String sex){
        this.age =age;
        this.name =name;
        this.sex = sex;
    }

    public void eat(){
        System.out.println(name+"eat the food");
    }

    public void show(){
        System.out.println("My name is "+name+",and I is "+age
        +",My sex is "+sex);
    }
}

class Student extends People{
    int grad;

    Student(int age, String name, String sex,int grad) {
        super(age, name, sex);
        this.grad=grad;
    }

    public void show(){ //重写
        super.show();
        System.out.println("My grad is " + grad);
    }
}

class Teacher extends People{
    String food;
    Teacher(int age, String name, String sex,String food) {
        super(age, name, sex);
        this.food = food;
    }

    public void teach(){
        System.out.println("I teach many students");
    }

    public void eat(String food){   //重载
        super.eat();
        System.out.printf("the %s is delicious",food);
    }
}

public class Classtest {
    /*public static void main (String[] args) {
        System.out.println("------SubClass 类继承------");
        SubClass sc1 = new SubClass();
        SubClass sc2 = new SubClass(100);
        System.out.println("------SubClass2 类继承------");
        SubClass2 sc3 = new SubClass2();
        SubClass2 sc4 = new SubClass2(200);
    }
     */
    public static void main(String[] args) {
        Student st = new Student(20, "张三", "男",3);
        st.show();
        Teacher tea = new Teacher(37,"Tom","boy","fish");
        tea.teach();
        tea.eat(tea.food);
    }
}
