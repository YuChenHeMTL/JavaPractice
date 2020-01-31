package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class calendar {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        //todo: Calendar
        //采用单例模式获取日历对象Calendar.getInstance();
        Calendar c = Calendar.getInstance();

        //通过日历对象得到日期对象
        Date d = c.getTime();

        Date d2 = new Date(0);
        c.setTime(d2); //把这个日历，调成日期 : 1970.1.1 08:00:00

        System.out.println("当前日期：\t" + format(c.getTime()));

        //todo: Calendar manipulation

        c = Calendar.getInstance();
        Date now = c.getTime();

        // 下个月的今天
        c.setTime(now);
        c.add(Calendar.MONTH, 1);
        System.out.println("下个月的今天:\t" +format(c.getTime()));

        // 去年的今天
        c.setTime(now);
        c.add(Calendar.YEAR, -1);
        System.out.println("去年的今天:\t" +format(c.getTime()));

        // 上个月的第三天
        c.setTime(now);
        c.add(Calendar.MONTH, -1);
        c.set(Calendar.DATE, 3);
        System.out.println("上个月的第三天:\t" +format(c.getTime()));

        //todo: practice
        c.setTime(now);
        c.add(Calendar.MONTH, 1);
        c.add(Calendar.DATE, -3);
        System.out.println("下个月的倒数第3天: \t" + format(c.getTime()));
    }

    private static String format(Date time) {
        return sdf.format(time);
    }
}
