package com.item.entity;

import java.util.Scanner;

public class ScannerTest {
    //计算BMI
    //需要参数体重，身高；公式为：体重/（身高*身高）
    void Welcome(){
        System.out.println("----欢迎进入BMI测试工具----");
        System.out.println("是否确定进入该测试环节，1 or 2");
        Scanner s1 = new Scanner(System.in);
        int qd = s1.nextInt();
        if(qd == 1){
            System.out.println("请输入您的体重(kg)：");
            Scanner s2 = new Scanner(System.in);
            float wg = s2.nextFloat();
            System.out.println("请输入您的身高(m)：");
            Scanner s3 = new Scanner(System.in);
            float hg = s3.nextFloat();
            float bmi = wg/(hg*hg);
            System.out.println("您的BMI指数为："+bmi);

            if(bmi<18.5){
                System.out.println("您的体重过轻了，请注意加强营养哦！");
            }else if(bmi>=18.5 & bmi<24){
                System.out.println("恭喜您，您的体重在正常范围！");
            }else if(bmi>=24 & bmi<27){
                System.out.println("您的体重过重了，请注意控制饮食哦1");
            }else if(bmi>=27 & bmi<30){
                System.out.println("您的体重为轻度肥胖了，稍微少吃一点点哦！");
            }else if(bmi>=30 & bmi<35){
                System.out.println("您的体重为中度肥胖了，请饭量减半咯！");
            }else{
                System.out.println("你的体重为重度肥胖了，请减肥！");
            }
        }
    }

    public static void main(String[] args){
        ScannerTest sc = new ScannerTest();
        sc.Welcome();
        }
    }

