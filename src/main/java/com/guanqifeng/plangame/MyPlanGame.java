package com.guanqifeng.plangame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyPlanGame extends JFrame {

    Image bg = GameUtil.getImage("images/bg.jpg");;
    Image plan = GameUtil.getImage("images/plane.png");

    PlaneObject planeObject = new PlaneObject(plan,250,250);
    Shell[] shells = new Shell[30];
    class KeyMonitor extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
//            super.keyPressed(e);
            planeObject.addDirection(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
//            super.keyReleased(e);
            planeObject.minusDirection(e);
        }
    }

    class paintThread extends Thread{
        @Override
        public void run(){
            while(true){
                repaint();
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void launchFrame(){
        this.setTitle("Plan Game");
        this.setSize(Constant.FRAME_WIDTH,Constant.FRAME_HEIGHT);
        this.setLocation(100,100);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        new paintThread().start();
        this.addKeyListener(new KeyMonitor()); //添加键盘监听
        /*
        初始化炮弹
         */
        for(int i = 0;i<shells.length;i++){
            shells[i] = new Shell();
        }

        this.setVisible(true);
    }
    @Override
    public void paint(Graphics g){
//        System.out.println("画了一次");
        g.drawImage(bg,0,0,null);
        if(planeObject.live){
            planeObject.drawSelf(g);
        }
        for(Shell s:shells){
            s.draw(g);
            if(s.getRect().intersects(planeObject.getRect())){
                planeObject.live = false;
            }
        }
    }


    public static void main(String[] args) {
        MyPlanGame planGame = new MyPlanGame();
        planGame.launchFrame();
    }
}
