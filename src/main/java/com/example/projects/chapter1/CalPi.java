package com.example.projects.chapter1;
/**
 *计算pi的值，计算公式为：
 * pi = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)
 * 分析：1.计算符号：当为奇数时运行符为“ + ”，当为偶数时，运行符为 “-”
 *      2.当n = 1时，比较特殊，不需要计算直接返回1，当n > 1 时，每次参与计算的数的分母为（当前数顺序 * 2 -1）
 *      3.返回计算结果
 */
public class CalPi {
    public static void main(String[] args) throws Exception {
        int n = 1000000;//一百万次耗时16毫秒
        double p = 0;
        long t1 = System.currentTimeMillis();
        System.out.println("t1 = " + t1);
        if (n < 1) {
            throw new Exception(" n不能小于1!!!");
        }
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                p = 1;
//                System.out.println( p );
            } else {
                if (i % 2 > 0) {
                    p = p + 1.0 / (2 * i - 1);
//                    System.out.println(p);
                } else {
                    p = p - 1.0 / (2 * i - 1);
//                    System.out.println(p);
                }
            }
        }
        long t2 = System.currentTimeMillis();
        System.out.println("t2:" + t2);
        System.out.println("pi的大小" + 4 * p);
        System.out.println("用时:" + (t2 - t1));
    }
}
