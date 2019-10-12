package com.item.entity;

public class Hero {
    String name;    //姓名
    float hp;  //血量
    float armor;    //护甲
    int movespeed;  //移动速度

    public void getHp(){
        System.out.println("您的血量增加了！");
    }
    public static void main(String[] args){
        Hero gailun = new Hero();
        gailun.name = "盖伦";
        gailun.hp = 616.28f;
        gailun.armor = 27.536f;
        gailun.movespeed = 350;

        Hero timo = new Hero();
        timo.name = "提莫";
        timo.hp = 383f;
        timo.armor = 14f;
        timo.movespeed = 330;
        String str = "\r\n";
        System.out.println("英雄名称："+gailun.name+str+ "血量："+gailun.hp+str+"护甲："+gailun.armor+str+ "移速："+gailun.movespeed+str+str+ "英雄名称："+timo.name+str+"血量："+timo.hp+str+"护甲："+timo.armor+str+"移速："+timo.movespeed);
    }
}
