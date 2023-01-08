package com.hunun.javase.String;

import java.util.Locale;

public class StringTest1 {
    public static void main(String[] args) {
        String.valueOf("abc");
        System.out.println( String.valueOf("abc"));
        //内存分析：双引号括起来的"xy" 是保存在内存池当中的， new的对象是在堆内存当中开辟一片
        //空间，然后将内存地址赋给栈内存中的s3.
        String s3 = new String("xy");
        String k = new String("xy");
        //"test"能调用equals方法的原因是test是一个String 对象。
        //建议用第一个方法,防止空指针异常。
        System.out.println("test".equals(k));
        System.out.println(k.equals("test"));

        byte[] bytes={97,98,99,100};
        String s4 = new String(bytes);
        System.out.println(s4);
        String s5 = new String(bytes,1,2);
        System.out.println(s5);
        char[] ch = {'我','是','中','国','人'};
        String s6 = new String(ch,0,5);
        System.out.println(s6);
        char c = "我是中国人".charAt(1);
        System.out.println(c);
        int reasult = "abce".compareTo("abcd");
        System.out.println(reasult);
        System.out.println("HelloWord".contains("w"));
        System.out.println("HelloWord".endsWith("word"));
        System.out.println("HelloWord".equals("helloWord"));
        System.out.println("HelloWord".equalsIgnoreCase("helloWord"));
  byte[] bytesa = "abcdef".getBytes();
  for(int i = 0; i< bytesa.length; i++){
      System.out.println(bytesa[i]);
  }
        //判断某个子字符串在原字符串中出现的位置
        System.out.println("abcdefg".indexOf("def"));
        System.out.println("abcdefgcde".indexOf("cde"));

        //判断字符串是否为空
        String s7 ="";
        System.out.println(s7.isEmpty());

        String s8 ="a";
        System.out.println(s8.isEmpty());

        //判断某个子字符串在原字符串中最后出现的位置 .lastidexOf
        System.out.println("abcdefgcde".lastIndexOf("cde"));


        //把字符串某一位置的子字符串替换成想要的子字符串  .replace
        System.out.println("abcdefgcde".replace("abc","def"));

        //拆分字符串 .split
        String[] ymd = "1997-10-02".split("-");
        for(int i = 0; i< ymd.length; i++){
            System.out.println(ymd[i]);
        }

        //判断一个字符串是否以某个子字符串结尾
        System.out.println("abcdefgcde".startsWith("abc"));

        //截取字符串 subString(int beginIndex)
        //还可以设置截取的停止位置  subString(int beginIndex, int endIndex)
        System.out.println("abcdefgcde".substring(7));


        //将字符串转换为char数组
         char[] ch1 = "我是中国人".toCharArray();
         for (int i = 0; i<ch1.length; i++){
             System.out.println(ch1[i]);
         }

        //大写字母转换成小写
        System.out.println("ABcdeFGcde".toLowerCase());

         //小写字母转换成大写
        System.out.println("ABcdeFGcde".toUpperCase());

         //每一个locale对象都代表一个特定的政治文化，地区和创建方法
        Locale locale2=new Locale("汉语", "中国");
        System.out.println("locale2"+locale2);
        System.out.println("ABcdeFGcde".toLowerCase(locale2));

    }
}
