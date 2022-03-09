package Day3.String;

public class SubstringRealize {
    static String x = "abcdefg";//static方法中只能引用static字段

    public static void main(String[] args){
        x = x.substring(1,3);
        System.out.println(x);
    }
}
/*
JDK 7
public String(char value[], int offset, int count) {
        //check boundary
        this.value = Arrays.copyOfRange(value, offset, offset + count);
        }
创建一个String时就是创建了一个数组


public String substring(int beginIndex, int endIndex) {
        //check boundary
        int subLen = endIndex - beginIndex;
        return new String(value, beginIndex, subLen);
        }
而substring方法是直接拿下标创建了一个新的数组，避免了对老的数组引用而可能导致的内存泄漏问题
* */