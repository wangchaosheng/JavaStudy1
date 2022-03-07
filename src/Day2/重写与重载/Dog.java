package Day2.重写与重载;
//重载：指的是在同一个类中，多个函数或者方法有同样的名称，但是参数列表不相同的情形，这样的同名不同参数的函数或者方法之间，互相称之为重载函数或者方法。
public class Dog {
    public void bark(){
        System.out.println("woof");
    }
    //这里就是对方法对重载
    public void bark(int num){
        for (int i = 0 ;i<num;i++){
            System.out.println("woof");
        }
    }
    public  int bark(int gg,String g){
        System.out.println("mama");
        int mama = 5;
        return  mama;
    }

}
//1。被重载的方法必须改变参数列表，也就是说不能写俩个参数类型，参数个数且函数名相同的函数
//2。被重载的方法可以改变返回类型
//3。被重载的方法可以改变访问修饰符
//4。被重载的方法可以声明新的或更广的检查异常
//5。方法能够子啊同一个类中或在一个子类中被重载
