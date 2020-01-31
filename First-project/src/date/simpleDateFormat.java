package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class simpleDateFormat {
    public static void main(String[] args) {
        //todo: SimpleDateFormat
        //y 代表年
        //M 代表月
        //d 代表日
        //H 代表24进制的小时
        //h 代表12进制的小时
        //m 代表分钟
        //s 代表秒
        //S 代表毫秒
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS" );
        Date d= new Date();
        String str = sdf.format(d);
        System.out.println("当前时间通过 yyyy-MM-dd HH:mm:ss SSS 格式化后的输出: "+str);

        SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy-MM-dd" );
        Date d1= new Date();
        String str1 = sdf1.format(d1);
        System.out.println("当前时间通过 yyyy-MM-dd 格式化后的输出: "+str1);

        //todo: 字符串转日期
        SimpleDateFormat sdf2 =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss" );
        String str2 = "2016/1/5 12:12:12";

        try {
            Date d2 = sdf2.parse(str2); //parse from string to date format
            System.out.printf("字符串 %s 通过格式  yyyy/MM/dd HH:mm:ss %n转换为日期对象: %s",str,d.toString());
            System.out.println();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //todo: practice

        Date[] listdate = new Date[9];
        Date d2000 = new Date();
        try {
            d2000 = sdf2.parse("2000/1/1 00:00:00"); //parse from string to date format
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        long long2000 = d2000.getTime();

        for (int i = 0; i < listdate.length; i++){
            listdate[i] =  new Date((long)(Math.random() * long2000));
            System.out.print(listdate[i] + "\t");
            if ((i + 1) % 3 == 0) System.out.println();
        }
        System.out.println();
        Long[] listDateLong = new Long[listdate.length];
        for (int i = 0; i < listdate.length; i++){
            listDateLong[i] = listdate[i].getTime();
        }
        Arrays.sort(listDateLong);
        for (int i = 0; i < listdate.length; i++){
            listdate[i] = new Date(listDateLong[i]);
            System.out.print(listdate[i] + "\t");
            if ((i + 1) % 3 == 0) System.out.println();
        }
    }
}
