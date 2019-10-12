package com.item.entity;

import java.util.Arrays;

public class Paixu {

    void testPaixu(){
        int a[] = {11,45,98,75,40,23};
        String context = Arrays.toString(a);
        System.out.println(context);

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
    void choosePaixu(){
        int a[] = {18,62,68,82,65,9};
//        排序前先把内容打印出来
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println(" ");

//        第一步：把第一位和其他位置比较
//        如果发现其他位置的数据比第一位小，就进行交换
        for(int i=1;i<a.length;i++){
            if(a[i]<a[0]){
                int temp = a[0];
                a[0]=a[i];
                a[i] = temp;
            }
        }
        //打印出来，可以发现，最小的数字到了第一位
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);

        }
        System.out.println(" ");

//        第二步：把第二位和其他位置比较
//        如果发现其他位置的数据比第二位小，就进行交换
        for(int i=2;i<a.length;i++){
            if(a[i]<a[1]){
                int temp = a[1];
                a[1] = a[i];
                a[i] = temp;
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        System.out.println(" ");

        for (int j=0;j<a.length-1;j++){
            for(int i=j+1;i<a.length;i++){
                if(a[i]<a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args){
        Paixu px = new Paixu();
//        px.choosePaixu();
        px.testPaixu();
    }
}
