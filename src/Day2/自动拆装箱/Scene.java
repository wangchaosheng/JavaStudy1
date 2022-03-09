package Day2.自动拆装箱;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Scene {

//场景1 把int类型放进集合类，在add时会自动装箱
    public void ListSetAddInt(){
        List<Integer> li = new ArrayList<>();
        for (int i =1;i<50;i++){
            li.add(i);
        }
    }

//场景2 包装类与基本数据类型进行比较运算时会自动装箱
    public void ComparePkgWithInt(){
        Integer a = 1;
        System.out.println(a == 1 ?"等于":"不等于");
        Boolean bool = false;
        Character c = 'c';
        String s = "string";
        System.out.println(bool?"真":"假");
    }

//场景3 包装类型之间的运算，会被自动拆箱成基本类型进行
    public void CalWithIntObject(){
        Integer i = 10;
        Integer j = 20;
        System.out.println(i+j);
    }

/*
    场景4 三目运算符的使用，当第二，第三操作数分别为基本类型和对象时，对象会拆箱为基本类型进行操作
     此时如果对象类型是一个null值的话就会出现空指针异常
     解决方案：用于判断的基本类型改为Boolean.FALSE,保持两个为对象类型则不会报错
    */
public void TernaryOperator(){
        Map<String,Boolean> map =  new HashMap<String,Boolean>();
        Boolean b = (map!=null ? map.get("test") : false);//这种写法是错误的
        Boolean c = (map!=null?map.get("test"):Boolean.FALSE);//第二三位需要统一类型，防止拆箱
    }

//场景5 函数参数与返回值
    public int GetNum1(Integer num){
        return num;
    }

    public Integer GetNum2(int num){
        return num;
    }
}
//自动拆装箱带来的问题，数值比较需要用 equals 比较，因为不在缓存池的整数就需要申请新的地址了
/*
java整数缓存池的实现
    cache = new Integer[(high - low) + 1];
    int j = low;
    for(int k = 0; k < cache.length; k++)
       cache[k] = new Integer(j++);
*/
/*
java装包时调用的缓存池的代码
    public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
    }
*/
//POJO类属性和RPC方法的返回值和参数都使用Boolean success,局部变量使用boolean success

