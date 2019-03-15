package com.guanqifeng.java;

/**
 * 测试带标签的break与continue
 */
public class BreakContinueWithLabelPractice {
    public static void main(String[] args) {
        outer:for(int i = 101;i<=150;i++){
            for(int j = 2;j<i/2;j++){
               if(i%j == 0){
                   continue outer;
               }
                System.out.print(i+"、");
                continue outer;
            }
        }
    }
}
