package com.example.projects.chapter1;

import java.math.BigDecimal;

/**
 * 已知一个跑步者：45分30秒跑了14公里，求他每小时能跑多少英里。1英里等于1.6公里
 * 分析：速度 = 路程 / 时间
 *      路程 = 14 公里
 *      时间 = 45 分 30 秒
 *  求：速度
 */
public class CalculateSpeedByEnglish {

    public static void main(String[] args) {
        double s = 14.0; //路程
        double h = 0.0;  //单位为小时
        int min = 45;  //单位为分钟
        int sec = 30;  //单位为秒

        h = h + min / 60.0 + sec / 3600.0;

        //根据 v = s / h 来计算时间
        double v = new BigDecimal(s / h).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
        //这里的计算以英里计的 s， s = v * h ,h为 1 小时
        System.out.println("每小时跑" + (v * 1 / 1.6) + "英里");
    }

}
