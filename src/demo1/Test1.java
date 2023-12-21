package demo1;

import org.junit.Test;

public class Test1 {
    public static void main(String[] args) {
        int a = 1;
        String b = "hello";
        Boolean c = true;

        /*基本数据类型的包装类 ： 是用于在基本数据类型和字符之间进行转化用的
                   byte short int     long char      boolean float double (基本数据类型)
        对应的封装类 Byte Short Integer Long Character Boolean Float Double
        对与数据的处理，一般情况下，都是转化为String类型进行操作的，用的都是封装类
        特殊的整型数据类型  不需要转化操作
        */
        String  str = "true";
        //将字符串转化成基本数据类型
        //用包装类.parsexx()方法
        // 如果字符串不能转化为基本的数据类型 报错NumberFormatException

//        byte bytes = Byte.parseByte(str);//参数有符号的十进制的byte
//
//        int ints = Integer.parseInt(str);//参数有字符符号的十进制整数行
//
//        long longs = Long.parseLong(str);

        boolean booleans = Boolean.parseBoolean(str);

        System.out.println(booleans);
        /*将基本数据类型转换为字符串
        *调用的是String 的valueOf(方法)
        * 可以使用基本数据类型的包装类中的toString方法
        * */
        String f = String.valueOf(true);
        String i = String.valueOf(10);
        String i2 = 10+"";
        String f2 = true+"";
        System.out.println(f2);

        //可以使用基本数据类型的包装类中toString方法
        String sstr1 = Integer.toString(10);
        String sstr2 = Float.toString(10l);

        /*基本数据类型只能是数值（不能为空的）   包装类是个对象（可以为空）
        如果要以对象的形式来创建或者接收一个参数时，可以设置为空
        基本数据类型必须设置初始值
        而它的包装类对象可以为空

        * */

        int s = 10;
        Integer myInt = new Integer(s);

        //自动拆箱与自动装箱
        Integer myInt2 = 10;


    }
    @Test
    public void gettest(){
        Integer i1 = new Integer(128);
        Integer i2 = new Integer(128);
        System.out.println(i1==i2);//比较物理地址
        System.out.println(i1.equals(i2));//比较值

        //int -128~127
        //这里的Integer 缓冲区 范围在-128~127
        //如果要转的int类型在这个范围之内就不会创建integer对象而是在缓冲区直接调用
        Integer i3 = Integer.valueOf(127);
        System.out.println(i3);
        Integer i4 = 127;//127+1 运算 再 装箱 (new Integer)
        Integer i5 = 1+2;
        Integer i6 = 127;//超出缓冲区就要装箱了
        System.out.println(i4==i6);//是否超出127 超出就是false
        System.out.println(i4.equals(i6));//true


    }
}
