package string;

public class compare {
    public static void main(String[] args) {
        //todo : str1和str2的内容一定是一样的！
        // 但是，并不是同一个字符串对象
        // same content, but different String objects
        String str1 = "the light";
        String str2 = new String(str1);

        //==用于判断是否是同一个字符串对象
        //==: check if same object
        System.out.println( str1  ==  str2);

        //todo: 一般说来，编译器每碰到一个字符串的字面值，就会创建一个新的对象
        // 所以在第6行会创建了一个新的字符串"the light"
        // 但是在第7行，编译器发现已经存在现成的"the light"，那么就直接拿来使用，而没有进行重复创建
//        String str1 = "the light";
        String str3 = "the light";
        System.out.println( str1  ==  str3);

        //todo: 使用equals进行字符串内容的比较，必须大小写一致
        // equalsIgnoreCase，忽略大小写判断内容是否一致
        // equals() checks the content of strings and the char case
        // equalsIgnoreCase() checks only the content
        String st1 = "the light";
        String st2 = new String(st1);
        String st3 = st1.toUpperCase();

        //==用于判断是否是同一个字符串对象
        System.out.println( st1  ==  st2);
        System.out.println(st1.equals(st2));//完全一样返回true
        System.out.println(st1.equals(st3));//大小写不一样，返回false
        System.out.println(st1.equalsIgnoreCase(st3));//忽略大小写的比较，返回true

        //todo: startsWith 以...开始
        // endsWith 以...结束
        String start = "the";
        String end = "Ight";

        System.out.println(str1.startsWith(start));//以...开始
        System.out.println(str1.endsWith(end));//以...结束

        //todo: practice
        String[] ss = new String[100];
        for (int i = 0; i < ss.length; i++){
            ss[i] = strings.getRandomCharString(2);
        }
        for (int i = 0; i < ss.length; i++){
            System.out.print(ss[i] + " ");
            if ((i + 1) % 20 == 0) System.out.println();
        }
        String rep = "";
        for (int i = 0; i < ss.length - 1; i++){
            for (int j = i + 1; j < ss.length; j++){
                if (ss[i].equals(ss[j])) rep += ss[i] + " ";
            }
        }
        System.out.println(rep);
    }
}
