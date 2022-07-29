package cn.zjl.basicPractice;

import java.util.Arrays;
import java.util.Collections;

class Value{
    int i;
}

public class Test {

    public static void main(String[] args) {
//    Integer i1=new Integer(12);
//    Integer i2=new Integer(12);
//    System.out.println(i1.equals(i2));
//        Value i1=new Value();
//        Value i2=new Value();
//        i1.i=i2.i=10;
//        System.out.println(i1.equals(i2));
//        char[] ch={'a','b','c','d'};
//        System.out.println(new String(ch));
        int i=0;
        outer:
        while(true){
            System.out.println("outer while loop");
            while(true){
                i++;
                System.out.println("i = "+i);
                if(i==1){
                    System.out.println("continue");
                    continue ;
                }
                if(i==3){
                    System.out.println("continue outer");
                    continue outer;
                }
                if(i==5){
                    System.out.println("break");
                }
                if(i==7){
                    System.out.println("break outer");
                    break outer;
                }
            }
        }
        System.out.println("Over");

    }
}
