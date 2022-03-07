package Day2.基础数据类型;
//数据溢出
public class NumberRun {
    public static void main(String[] args){
        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;
        int k = i+j;
        System.out.println("i("+i+")+j("+j+") = k("+k+")");
        Integer m = 10;// 这里是自动装箱，java se5之前是 Integer i = new Integer(10);
        int b = i;
        System.out.println(b);

    }
}
//i(2147483647)+j(2147483647) = k(-2) 这里就是发生了溢出，导致数据错误
//不能使用float 来表示金额等重要指标，float保存的只是十进制小数的近似值而不是准确值，重要指标用long来标示
