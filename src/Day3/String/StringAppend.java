package Day3.String;



public class StringAppend {
    public static void main(String[] args){
        String wechat = "Tiger";
        String introduce = "每天学一点的Java";
        String tiger = wechat+","+introduce;
        System.out.println(tiger);
        String monster = (new StringBuilder()).append(wechat).append(",").append(introduce).toString();
        String cat = wechat.concat(",").concat(introduce);
        StringBuffer tencent = new StringBuffer("Tiger");
        StringBuffer dog = tencent.append(",").append(introduce);
        System.out.println(String.join(",",wechat,introduce));//delimiter参数，分隔符，插到后面每个元素之间
        //String.join适用于字符串数组或集合，StringUtils.join适用于数字数组或集合
    }
}
/*
wechat+introduce  反编译后的内容
String tiger = (new StringBuilder()).append(wechat).append(",").append(introduce).toString();
StringBuilder类的append的方法可以一直套娃，然后调一下toString()方法

+号拼接作为一个语法糖，底层就是利用StringBuilder().append()方法
固定的字面量拼接是直接拼接的

.conat方法的源码
public String concat(String str) {
    int otherLen = str.length();
    if (otherLen == 0) {
        return this;
    }
    int len = value.length;
    char buf[] = Arrays.copyOf(value, len + otherLen); 创建一个数组，值为两个字符串的值，长度为两个字符串的和
    str.getChars(buf, len);//获取字符和长度
    return new String(buf, true);//返回了一个新的字符串
}

StringBuffer与StringBuilder的差别，StringBuffer是线程安全的

循环体内，字符串的连接方式，使用 StringBuilder 的 append 方法进行扩展。而不要使用+。

如果不是在循环体中进行字符串拼接的话，直接使用+就好了。

如果在并发场景中进行字符串拼接的话，要使用StringBuffer来代替StringBuilder。

* */