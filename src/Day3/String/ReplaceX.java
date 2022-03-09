package Day3.String;

public class ReplaceX {
    static String string = "abcd1234780aaa";
    public static void main(String[] args){
        System.out.println(string.replace("a","H"));//字符串替换所有
        System.out.println(string.replaceFirst("a","H"));//正则表达式替换第一个
        System.out.println(string.replaceAll("a","hh"));//正则替换所有
    }
}
