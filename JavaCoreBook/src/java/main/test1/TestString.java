package main.test1;

public class TestString {
    public static void main(String[] args) {
        String strings = " abCdeeDDDimdj ";
        System.out.println(strings);

        //删除字符串头部与尾部的空格。
        String string = strings.trim();
        boolean isEqual = string.equalsIgnoreCase("abCdeedddimdj");

        System.out.println("小写：" + string.toLowerCase());
        System.out.println("大写：" + string.toUpperCase());

        //判空
        //StringUtils.isEmpty(String str)

    }
}
