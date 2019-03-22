package com.guanqifeng.plangame;

import java.awt.*;

/**
 * 游戏父类
 */
public class GameObject {
     Image image;
     double x;
     double y;
     int speed;
     double height;
     double width;

    public Rectangle getRect(){
        return new Rectangle((int)x,(int)y,(int)width,(int)height);
    }

    public void drawSelf(Graphics g){
        g.drawImage(image,(int)x,(int)y,null);
    }
    public GameObject(Image image, double x, double y, int speed, double height, double width) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.height = height;
        this.width = width;
    }

    public GameObject(Image image, double x, double y) {
        this.image = image;
        this.x = x;
        this.y = y;
    }
    public GameObject(){

    }

}
