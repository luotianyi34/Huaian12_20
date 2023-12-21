package ClassTest;

import org.junit.Test;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ClassTest {
    @Test
    public void Date(){
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date);//创建日期对象，把当前的毫秒值转成日期对象
        System.out.println(date.toLocaleString());//toLocaleString()可以将时间格式成本地格式，此方法过期
//        System.out.println(date.toString());
    }
    @Test
    public void DateFormat() throws ParseException {
        //一：把Date对象转换成String
        DateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        String str_time = dateFormat.format(date);
        System.out.println(str_time);
        //二：把String转换成Date对象
//        String str_time2 = "2023年12月20日";
//        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        Date date1 = dateFormat.parse(str_time);
        System.out.println(date1);
    }
    @Test
    public void Calendar(){
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        calendar.add(Calendar.DATE,3);
        calendar.add(Calendar.YEAR,10);
        calendar.add(Calendar.HOUR,5);
        calendar.set(Calendar.YEAR,2023);
        Date date = new Date(calendar.getTime().getTime());
        DateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:ss:mm");
        String str_time = dateFormat.format(date);
        System.out.println(str_time);
        //获取该日历对象转成的日期对象
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
        System.out.println(d);
    }
    @Test
    public void Birth() throws ParseException {
        String str = "yyyy年MM月dd日";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.applyPattern(str);
        Date date = simpleDateFormat.parse("2001年05月16日");
        Date date2 = simpleDateFormat.parse("2030年01月01日");
        long birthTime = date.getTime();
        long needTime = date2.getTime();
        long nowTime = System.currentTimeMillis();
        long Times = (nowTime-birthTime)/(3600*24*1000);
        long Times2 = (needTime-nowTime)/(3600*24*1000);
        System.out.println("你已经活了"+Times+"天！");
        System.out.println(Times2+"天");
    }
    @Test
    public void BigDecimal(){

            // System.out.println(0.09 + 0.01);//0.10 0.1
            // System.out.println(1.0 - 0.32); //0.68
            // System.out.println(1.015 * 100);//101.5
            // System.out.println(1.301 / 100);//0.01301

            BigDecimal bd1 = new BigDecimal("0.09");
            BigDecimal bd2 = new BigDecimal("0.01");
            System.out.println(bd1.add(bd2));

            BigDecimal bd3 = new BigDecimal("1.0");
            BigDecimal bd4 = new BigDecimal("0.32");
            System.out.println(bd3.subtract(bd4));

            BigDecimal bd5 = new BigDecimal("1.015");
            BigDecimal bd6 = new BigDecimal("100");
            System.out.println(bd5.multiply(bd6));

            BigDecimal bd7 = new BigDecimal("1.991");
            BigDecimal bd8 = new BigDecimal("100");
            System.out.println(bd7.divide(bd8));

            // 1.301 100 2
            System.out.println(bd7.divide(bd8, 2, 	BigDecimal.ROUND_HALF_UP));

    }
}
