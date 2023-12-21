package ClassTest;

import org.junit.Test;

public class ClassTest2 {
    @Test
    public void regex(){
        String s1 = "12345";
        String s2 = "12345abc";
        String s3 = "bgoogle";
        String s4 = "bob";
        String s5 = "book";
        String s6 = "bbookk";
        //+ 加号代表前面的字符必须至少出现一次。（1次、或多次）。
        //例如， "goo+gle"可以匹配google、gooogle、goooogle等;
        //? 问号代表前面的字符最多只可以出现一次。（0次、或1次）。
        //例如："colou?r"可以匹配color或者colour;
        //* 星号代表前面的字符可以不出现，也可以出现一次或者多次。（0次、或1次、或多次）。
        //例如， " 0*42 "可以匹配42、042、0042、00042等。
        String regex1 = "^[0-9]+abc$";
        String regex2 = "a*google";
        String regex3 = ".+o{2}.+";
//        String regex4 = "[a-zA-Z]+o{2}[a-zA-Z]+";
        //System.out.println(s1.matches(regex1));
        //System.out.println(s2.matches(regex1));
//        System.out.println(s3.matches(regex2));
        System.out.println(s4.matches(regex3));
        System.out.println(s5.matches(regex3));
        System.out.println(s6.matches(regex3));
    }
    @Test
    public void GetTest(){
        String s1 = ".";
//        String regex1 = "\.";
        String regex2 = "\\.";
//        System.out.println(s1.matches(regex1));
        System.out.println(s1.matches(regex2));
    }
    @Test
    public void Number(){
        /*如：使用数据"123456789"进行匹配结果为true；
        使用数据"12345"进行匹配结果为false。*/
        String s1 = "123456789";
        String s2 = "12345";
        String regex = "[0-9]{6,12}";
        System.out.println(s1.matches(regex));
        System.out.println(s2.matches(regex));

    }
    @Test
    public void telNumber(){
/*该规则需要匹配的内容是：11位的手机号码，第1位为1，第2位为3、4、5、7、8中的一个，后面9位为0到9之间的任意数字。
如：使用数据"12345678901"进行匹配结果为false；
使用数据"13312345678"进行匹配结果为true。*/
        String s1 = "12345678901";
        String s2 = "13312345678";
        String regex = "1[34578][0-9]{9}";
        System.out.println(s1.matches(regex));
        System.out.println(s2.matches(regex));
    }
    @Test
    public void start_end(){
        /*该规则需要匹配的内容是：在多个a或零个a后面有个b；b必须为最后一个字符。
        如：使用数据"aaaaab"进行匹配结果为true；
        使用数据"abc"进行匹配结果为false。*/
        String s1 = "aaaaab";
        String s2 = "abc";
        String regex = "a*b";
        System.out.println(s1.matches(regex));
        System.out.println(s2.matches(regex));
    }
    @Test
    public void QQ(){
//        举例：校验qq号码.
//        1: 要求必须是5-15位数字
//        2: 0不能开头
        String s1 = "244672111";
        String s2 = "0244672111";
        String s3 = "01111";
        String s4 = "11141";
        String regex = "[1-9][0-9]{4,14}";
        System.out.println(s1.matches(regex));
        System.out.println(s2.matches(regex));
        System.out.println(s3.matches(regex));
        System.out.println(s4.matches(regex));
    }
    @Test
    public void Split(){
        //举例：分割出字符串中的的数字
        String s1 = "12-33-41-03";
        String s2 = "12 33 41 03";
        String regex1 = "-";
        String regex2 = " ";
        String []result1 = s1.split(regex1);
        String []result2 = s2.split(regex2);
        for (String value : result1) {
            System.out.print(value + "  ");
        }
        System.out.println();
        for (String s : result2) {
            System.out.print(s + "  ");
        }
    }
    @Test
    public void replace(){
        //举例：把文字中的数字替换成*
        String s1 = "as123oah213dfs46adw";
        String regex = "[0-9]";
        String result = s1.replaceAll(regex,"*");
        System.out.println(result);
    }
}
