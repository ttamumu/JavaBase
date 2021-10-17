package com.example.projects.chapter1;

public class CalculateUSPopulation {
    public static void main(String[] args) {
        int birth = 7;
        int death = 13;
        int in  = 45;
        int basic = 312032486;

        int sumBirth = (5 * 365 * 24 * 60 * 60) / 7;
        int sumDeath =  (5 * 365 * 24 * 60 * 60) / 13;
        int sumIn =  (5 * 365 * 24 * 60 * 60) / 45;

        System.out.println("5年后老美的人口总数:" + (basic + sumBirth - sumDeath + sumIn));
    }
}
