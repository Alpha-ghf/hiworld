package com.item.entity;


import java.util.Scanner;

public class RunYear {
//满足以下任一条件即为闰年
//1. 如果能够被4整除，但是不能被100整除
//2. 能够被400整除
    // 1.判断年份对应的闰年
    void JudgeYear(){
        System.out.println("----欢迎来到闰年判断软件----");
        System.out.println("请输入您需要判断的年份：");
        Scanner s1 = new Scanner(System.in);
        int year = s1.nextInt();
        if((year%4==0&year%100!=0) | (year%400==0)){
            System.out.println("您输入的年份为闰年");
        }else{
            System.out.println("您输入的年份不是闰年");
        }

    }

    // 2.判断月份对应的季节
    void JudgeSeason(){
        System.out.println("请输入月份：");
        Scanner s2 = new Scanner(System.in);
        int month = s2.nextInt();
        switch (month){
            case 1:
            case 11:
            case 12:
                System.out.println("冬天");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("春天");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("夏天");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("秋天");
                break;
                default:
                    System.out.println("不知道这是什么！");
                    break;
        }
    }

    // 3.计算整数的阶乘
    void Multiply(){
        System.out.println("请输入一个整数：");
        Scanner s3 = new Scanner(System.in);
        int Num = s3.nextInt();
        int s = 1;
        while(Num>1){
            s*=Num;
            Num--;
        }
        System.out.println("阶乘为："+s);
    }

    // 4.乞丐要钱问题解答(for循环的锻炼)
    void formoney(int day){
        double omoney = 1;
        double smoney = 0;
        for (int i=1;i<=day;i++){
            smoney+=omoney;
            omoney = omoney+omoney;
        }
        System.out.println(smoney);
    }

    // 5.数组的计算
    void arrayTest(){
        int[] a = new int[5];
        for(int i=0;i<5;i++){
            a[i] = (int)(Math.random()*100);
        }
        System.out.println("数组的值为：");
        for(int j=0;j<5;j++){
            System.out.println(a[j]);
        }
        int b = a[0];
        for(int z=1;z<a.length;z++){
            if(a[z]<b){
             b=a[z];
            }
        }
        System.out.println("最小值为："+b);
    }

    public static void main(String[] args){
     RunYear ru = new RunYear();
//     ru.formoney(3);
        ru.arrayTest();


    }
}
