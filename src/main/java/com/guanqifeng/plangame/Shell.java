package com.guanqifeng.plangame;

import java.awt.*;

public class Shell extends GameObject{
    public double degree;
    public Shell() {
        x = 200;
        y = 200;
        width = 10;
        height = 10;
        speed = 3;
        degree = Math.random()*Math.PI*2; //获取一个0~360的弧度
    }
    public void  draw(Graphics g){
        Color c = g.getColor();
        g.setColor(Color.yellow);
        g.fillOval((int)x,(int)y,(int)width,(int)height);

        x += speed*Math.cos(degree);
        y += speed*Math.sin(degree);

        if(x<10 || x> Constant.FRAME_WIDTH-width-10){
            degree = Math.PI - degree;
        }
        if(y<30 || y> Constant.FRAME_HEIGHT-height-10){
            degree = - degree;
        }

        g.setColor(c);
    }

}
