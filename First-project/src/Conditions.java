import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {

        //todo: if statement
        Scanner s = new Scanner(System.in);
//        System.out.println("请输入你的体重：");
//        int weight = s.nextInt();
//        System.out.println("请输入你的身高：");
//        float height = s.nextFloat();
//        float bmi = weight/(height*height);
//
//        if (bmi < 18.5){
//            System.out.println("体重过轻");
//        } else if (18.5 <= bmi && bmi < 24){
//            System.out.println("正常范围");
//        } else if (24 <= bmi && bmi < 27){
//            System.out.println("体重过重");
//        } else if (27 <= bmi && bmi < 30){
//            System.out.println("轻度肥胖");
//        } else if (30 <= bmi && bmi < 35){
//            System.out.println("中度肥胖");
//        } else if (35 <= bmi){
//            System.out.println("重度肥胖");
//        } else {
//            System.out.println("bad data");
//        }

//        System.out.println("请输入一个年份：");
//        int year = s.nextInt();
//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
//            System.out.println(year + "是闰年");
//        } else {
//            System.out.println(year + "不是闰年");
//        }

        //todo: switch statement
//        System.out.println("请输入月份：");
//        int month = s.nextInt();
//        switch(month){
//            case 1:
//            case 3:
//            case 2:
//                System.out.println("春天");
//                break;
//            case 4:
//            case 6:
//            case 5:
//                System.out.println("夏天");
//                break;
//            case 7:
//            case 9:
//            case 8:
//                System.out.println("秋天");
//                break;
//            case 10:
//            case 11:
//            case 12:
//                System.out.println("冬天");
//                break;
//            default:
//                System.out.println("什么玩意儿");
//                break;
//        }

        //todo: while loop
//        System.out.println("请输入一个整数：");
//        int integer = s.nextInt();
//        int factorial = 1;
//        while (integer > 0){
//            factorial *= integer--;
//        }
//        System.out.println("阶乘是：" + factorial);

        //todo: break
        //打印单数
//        outloop: //outloop这个标示是可以自定义的比如outloop1,ol2,out5
//        for (int i = 0; i < 10; i++) {
//
//            for (int j = 0; j < 10; j++) {
//                System.out.println(i+":"+j);
//                if(j == 9)
//                    break outloop; //如果是双数，结束外部循环
//            }
//        }

        long total = 0;
        double r = 0.2;
        int p = 12000;
        int year = 0;
        while (total < 1000000){
            p *= (1 + r);
            total += p;
            year += 1;
        }
        System.out.println("需要" + year + "年10000才能达到100万");

        //todo: practices
        double diff = 1.0;
        int num = 0;
        int denom = 0;
        for (int i = 1; i <= 20; i++){
            for (int j = 1; j <= 20; j++){
                if (i % 2 == 0 && j % 2 == 0){
                    continue;
                }
                if (Math.abs(((double) i/j) - 0.618) < diff){
                    diff = Math.abs(((double) i/j) - 0.618);
                    num = i;
                    denom = j;
                }
            }
        }
        System.out.println("离黄金分割点 0.618最近的两个数是" + num + "/" + denom + "=" + ((double)num/(double)denom));

        int lotus = 100;
        while(lotus >= 100 && lotus <= 999){
            int hun = lotus / 100;
            int ten = (lotus / 10) % 10;
            int one = lotus % 10;
            if (lotus == (Math.pow(hun, 3) + Math.pow(ten, 3) + Math.pow(one, 3))){
                System.out.println(lotus + "是一个水仙花数");
            }
            lotus++;
        }

        outmost:
        for (int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                for (int k = 0; k<20; k++){
                    for (int l = 0; l<20; l++){
                        if ((i + j == 8) && (i + k == 14) &&
                                (j + l == 10) && (k - l == 6)){
                            System.out.println("第一位：" + i + "\n" +
                                    "第二位：" + j + "\n" +
                                    "第三位：" + k + "\n" +
                                    "第四位：" + l + "\n");
                            break outmost;
                        }
                    }
                }
            }
        }
    }
}
