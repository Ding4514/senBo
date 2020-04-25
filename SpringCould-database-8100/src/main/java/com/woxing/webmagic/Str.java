package com.woxing.webmagic;

public class Str {
    public static void main(String[] args) {
        //输出7548
        String str="ss7f5d4ss8";
        String s="/[^0-9]/ig";
        String replace = str.replaceAll("\\D+", "");
        System.out.println(replace);
    }
}
