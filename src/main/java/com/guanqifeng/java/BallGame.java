package com.guanqifeng.java;
import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {
    Image desk = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Administrator\\IdeaProjects\\JavaLearning\\src\\main\\resources\\images\\desk.jpg");
    Image ball = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Administrator\\IdeaProjects\\JavaLearning\\src\\main\\resources\\images\\ball.png");
    double ballX = 100;
    double bally = 100;
    boolean right = true;
    public void paint(Graphics g){
        System.out.println("画了一下");
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)ballX,(int)bally,null);

    }
    public void  launchFrame()
    {
        setSize(856,500);
        setLocation(400,400);
        setVisible(true);

        while(true){
            repaint();
            try{
               Thread.sleep(40);
            }catch (Exception e){
                e.printStackTrace();
            }
            if(right){
                ballX = ballX + 10;
            }else{
                ballX = ballX - 10;
            }

            if(ballX > 856 - 40 -30){
                right = false;
            }
            if(ballX < 40){
                right = true;
            }
        }
    }
    public static void main(String[] args) {
        BallGame ballGame = new BallGame();
        ballGame.launchFrame();
    }
}
