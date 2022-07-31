package com.softeem.wolf;

/**
 * Created by 苍狼
 * Time on 2022-07-29
 */
public class Test {
    public static void main(String[] args) {
//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j+"*"+i+"="+(i*j)+"\t");
//            }
//            System.out.print("\n");
//        }
//        for (int i = 1; i < 3; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j+"*"+i+"="+(i*j)+"\t");
//            }
//            System.out.print("\n");
//        }

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 3; j++) {
                if (j>i){
                    continue;
                }
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.print("\n");
        }
    }
}
