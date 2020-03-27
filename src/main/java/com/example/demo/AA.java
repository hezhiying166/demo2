package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class AA {
    public int aa=11;
    public static class BB{
        public void start() {
            System.out.println(122);
        }
    }
    public static void main(String[] args) {
//        AA.BB bb=new AA.BB();
//        HashMap mm=new HashMap();
//        mm.put("aa", null);
//        int i=3;
//        boolean aa=true;
//        System.out.println(String.valueOf(true) == "true");
        
        
//        Base obj = new Sub();
//        System.out.println(obj.x);
//        System.out.println(obj.getX());
        
//        int i = 0;
//        for (foo('A'); foo('B') && (i < 2); foo('C')) {
//            i++;
//            foo('D');
//        }
        int x, a=2, b=5, c=-2; x = ++a+b+++c++;
        System.out.println(x);
        
        HashMap map=new HashMap();
        map.put(null, "");
        System.out.println(map);
    }
    
    static boolean foo(char c) {
        System.out.print(c);
        return true;
    }

    public static class Base {
        int x = 1;
        public Base() {
            this.echo();
            this.x = 2;
        }
        public void echo() {
            System.out.println("Base.x="+this.x);
        }
        public int getX() {
            return this.x;
        }
    }
    public static class Sub extends Base {
        int x = 3;
        public Sub() {
            this.echo();
            this.x = 4;
        }
        public void echo() {
            System.out.println("Sub.x="+this.x);
        }
        public int getX() {
            return this.x;
        }
    }

}
