package Day2.构造函数与默认构造函数;

public class Rectangle {

    int length;
    int width;

    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }

    //构造函数的重载，构造函数没有返回类型，不会被继承，且可以有范围修饰符
    //构造函数的函数名称必须与类名称相同
    public Rectangle(int length){
        this.length = length;
        this.width = length;
    }

    //默认的无参数构造函数
    public Rectangle(){
        //默认构造函数会把成员变量的值初始化为默认值
    }

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(1,3);
        Rectangle square = new Rectangle(4);
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1.length);
    }
}
