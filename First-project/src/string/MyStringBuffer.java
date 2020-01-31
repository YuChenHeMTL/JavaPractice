package string;

public class MyStringBuffer implements IStringBuffer{
    int capacity = 16;
    int length = 0;
    char[] value;
    public MyStringBuffer(){
        value = new char[capacity];
    }

    public MyStringBuffer(String str){
        if(null!=str)
            value =str.toCharArray();

        length = value.length;

        if(capacity<value.length)
            capacity  = value.length*2;
    }

    @Override
    public void reverse() {
        for (int i = 0; i < length / 2; i++) {
            char temp = value[i];
            value[i] = value[length - i - 1];
            value[length - i - 1] = temp;
        }
    }

    public void append(String str){
        insert(length + 1, str);
    }; //追加字符串

    public void append(char c){
        append(String.valueOf(c));
    };  //追加字符

    public void insert(int pos,char b){
        insert(pos, String.valueOf(b));
    }; //指定位置插入字符

    @Override
    public void insert(int pos, String b) {

        pos --;

        //边界条件判断
        if (pos < 0)
            return;

        if (pos > length)
            return;

        if (null == b)
            return;

        //扩容
        while (length + b.length() > capacity) {
            capacity = (int)((length + b.length()) * 1.5f);
            char[] newValue = new char[capacity];
            System.arraycopy(value, 0, newValue, 0, length);
            value = newValue;
        }

        char[] cs = b.toCharArray();

        //先把存在的数据后移
        System.arraycopy(value, pos, value, pos + cs.length, length - pos);

        //把要插入的数据插入到指定位置
        System.arraycopy(cs, 0, value, pos, cs.length);

        length = length + cs.length;
    }

    public void delete(int start){
        delete(start, value.length);
    }; //从开始位置删除剩下的

    public void delete(int start, int end) {
        //边界条件判断
        if(start<0)
            return;

        if(start>length)
            return;

        if(end<0)
            return;

        if(end>length)
            return;

        if(start>=end)
            return;

        System.arraycopy(value, end, value, start, length- end);
        length-=end-start;

    }


    public int length(){
        return length;
    }; //返回长度

    public String getString(){
        return String.valueOf(value);
    }

    public static void main(String[] args) {
        String newS = strings.getRandomCharString(10);
        StringBuffer sb = new StringBuffer(newS);
        Long now = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++){
            sb.append(strings.getRandomCharString(1));
        }
        System.out.println("StringBuffer: time - " + (System.currentTimeMillis() - now));

        newS = strings.getRandomCharString(10);
        MyStringBuffer msb = new MyStringBuffer(newS);
        now = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++){
            msb.insert(0, strings.getRandomCharString(1));
        }
        System.out.println("MyStringBuffer: time - " + (System.currentTimeMillis() - now));

    }
}
