package Day2.类变量成员变量局部变量;

public class Variables {
    //类变量a -> 存在于方法区
    private static int a;
    //成员变量b ->存在于堆内存
    private int b;
    //变量a,b是共享变量，需要考虑线程安全

    //局部变量c  ->存在于栈内存
    public void test(int c){
        //局部变量d
        int d;
    }
}

//public 变量或方法对所有类或者对象都是可见的，所有类或对象都可以直接访问
//private 私有的，只有自己可以访问，子类也不能访问
//protected 同一个包的类可见，其他包的类不可见，除非是他的子类
//default 只有同一个包的类可见，其他包不可见，其他包的子类也不可见
//对象的传递也是通过对地址对传递，java中只有值传递，共享对象传递是值传递对特例