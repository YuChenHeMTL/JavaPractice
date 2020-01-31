package string;

import exceptions.MyStringBufferExceptions.IndexIsNegativeException;
import exceptions.MyStringBufferExceptions.IndexIsOutofRangeException;

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

    public void append(String str) throws IndexIsOutofRangeException, IndexIsNegativeException {
        insert(length + 1, str);
    }; //追加字符串

    public void append(char c) throws IndexIsOutofRangeException, IndexIsNegativeException {
        append(String.valueOf(c));
    };  //追加字符

    public void insert(int pos,char b) throws IndexIsOutofRangeException, IndexIsNegativeException {
        insert(pos, String.valueOf(b));
    }; //指定位置插入字符

    @Override
    public void insert(int pos, String b) throws IndexIsOutofRangeException, IndexIsNegativeException {

        pos --;

        //边界条件判断
        if (pos < 0) throw new IndexIsNegativeException();

        if (pos > length) throw new IndexIsOutofRangeException();

        if (null == b) throw new NullPointerException();

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

    public void delete(int start) throws IndexIsNegativeException, IndexIsOutofRangeException {
        delete(start, value.length);
    }; //从开始位置删除剩下的

    public void delete(int start, int end) throws IndexIsNegativeException, IndexIsOutofRangeException {
        //边界条件判断
        if(start<0) throw new IndexIsNegativeException();

        if(start>length) throw new IndexIsOutofRangeException();

        if(end<0) throw new IndexIsNegativeException();

        if(end>length) throw new IndexIsOutofRangeException();

        if(start>=end) throw new IndexIsOutofRangeException();

        System.arraycopy(value, end, value, start, length- end);
        length-=end-start;

    }


    public int length(){
        return length;
    }; //返回长度

    public String getString(){
        return String.valueOf(value);
    }

    public static void main(String[] args) throws IndexIsNegativeException, IndexIsOutofRangeException {
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
            try {
                msb.insert(0, strings.getRandomCharString(1));
            } catch (IndexIsNegativeException | IndexIsOutofRangeException e){
                e.printStackTrace();
                break;
            }
        }
        System.out.println("MyStringBuffer: time - " + (System.currentTimeMillis() - now));

    }
}
