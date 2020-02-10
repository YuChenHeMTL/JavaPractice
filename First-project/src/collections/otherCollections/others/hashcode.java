package collections.otherCollections.others;

import static string.strings.getRandomCharString;

public class hashcode {
    public static int hCode(String s){
        int total = 0;
        for (int i = 0; i < s.length(); i++){
            total += s.charAt(i) * 23;
        }
        return (total > 2000) ? total % 2000 : total;
    }

    public static void main(String[] args) {
        String[] strings = new String[100];
        for (int i = 0; i < strings.length; i++){
            int num = (int)(Math.random() * 100);
            strings[i] = getRandomCharString((num == 1) ? 2 : num);
        }
        int total = 0;
        for (int i = 0; i < strings.length; i++){
            total += hCode(strings[i]);
        }
        System.out.println(total/100);
    }
}
