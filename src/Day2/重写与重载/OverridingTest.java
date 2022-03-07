package Day2.重写与重载;

class Hound extends Dog{
    public void sniff(){
        System.out.println("sniff");
    }
    public void bark(){
        System.out.println("bowlllllll");
    }
}
public class OverridingTest {
    public static void main(String[] args){
        Dog dog = new Hound();
        dog.bark();//调用重写的方法，这就是所谓的动态多态性
        dog.bark(6);//调用重载的方法，这里也说明了java会根据方法名称和参数寻找正确的执行对象
    }
}
//方法重写的条件
//1。参数列表必须完全与被重写的方法相同
//2。返回类型必须完全与被重写的方法的返回类型相同
//3。访问级别的限制性只能小于等于被重写的方法，不能大于
//4。重写的方法不能跑出新的检查异常或比被重写方法声明更广泛的检查异常
//5。重写的方法可以抛出更少的异常甚至不抛出异常
//6。不能重写被标示为final的方法
//7。如果不能继承一个方法，则不能重写这个方法